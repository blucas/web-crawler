package com.lucas.example.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Crawler which crawls the given url and any anchors found which start with the given url.
 *
 * @author Brendt Lucas
 */
public class JSoupCrawler {

    private final String baseUrl;

    private final Set<String> visited = new HashSet<>();

    private final Set<String> media = new LinkedHashSet<>();

    private final Set<String> imports = new LinkedHashSet<>();

    private final Set<String> anchors = new LinkedHashSet<>();

    public static void main(String... args) throws IOException {
        if (args.length != 1) {
            System.err.println("Missing <baseUrl> argument");
            return;
        }

        final String baseUrl = args[0];
        try {
            new URL(baseUrl);
        } catch (Exception e) {
            System.err.printf("Supplied baseUrl <%s> is not a valid URL\n", baseUrl);
            return;
        }

        final JSoupCrawler crawler = new JSoupCrawler(baseUrl);
        crawler.crawl(baseUrl);

        crawler.print();
    }

    JSoupCrawler(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    void crawl(String url) {
        visited.add(url);
        System.out.printf("Visiting: %s\n", url);

        try {
            Document doc = Jsoup.connect(url).get();
            Elements anchors = doc.select("a[href]");
            Elements media = doc.select("[src]");
            Elements imports = doc.select("link[href]");

            for (Element src : media) {
                this.media.add(String.format(" * %s: <%s>", src.tagName(), src.attr("abs:src")));
            }

            for (Element i : imports) {
                this.imports.add(String.format(" * %s <%s>", i.tagName(), i.attr("abs:href")));
            }

            for (Element anchor : anchors) {
                final String absoluteRef = anchor.attr("abs:href");
                this.anchors.add(absoluteRef);

                if (absoluteRef.startsWith(baseUrl) && !visited.contains(absoluteRef)) {
                    crawl(absoluteRef);
                }
            }
        } catch (IOException e) {
            System.err.printf("Failed to crawl: %s. Reason: %s\n", url, e.getMessage());
        }
    }

    private void print() {
        System.out.printf("\nMedia: (%d)\n", media.size());
        media.forEach(System.out::println);

        System.out.printf("\nImports: (%d)\n", imports.size());
        imports.forEach(System.out::println);

        System.out.printf("\nAnchors: (%d)\n", anchors.size());
        anchors.forEach(System.out::println);
    }

    Set<String> getMedia() {
        return media;
    }

    Set<String> getImports() {
        return imports;
    }

    Set<String> getAnchors() {
        return anchors;
    }
}

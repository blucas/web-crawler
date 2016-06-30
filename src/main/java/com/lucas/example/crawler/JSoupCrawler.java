package com.lucas.example.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.*;

/**
 * Crawler which crawls the given url and any anchors found which start with the given url.
 *
 * @author Brendt Lucas
 */
public class JSoupCrawler {

    private final String baseUrl;

    private final Queue<String> linksToVisit;

    private final Set<String> visited;

    private final Set<String> media;

    private final Set<String> imports;

    private final Set<String> anchors;

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
        crawler.crawl();

        crawler.print();
    }

    JSoupCrawler(String baseUrl) {
        this.baseUrl = baseUrl;

        visited = new HashSet<>();
        media = new LinkedHashSet<>();
        imports = new LinkedHashSet<>();
        anchors = new LinkedHashSet<>();

        linksToVisit = new LinkedList<>();
        linksToVisit.add(baseUrl);
    }

    void crawl() {

        while (!linksToVisit.isEmpty()) {
            final String url = linksToVisit.remove();

            // Add this URL to the list of visited URLs so that we don't visit it again
            visited.add(url);

            // Crawl the URL
            crawl(url);
        }
    }

    private void crawl(String url) {
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

                if (absoluteRef.startsWith(baseUrl) && !visited.contains(absoluteRef)
                        && !linksToVisit.contains(absoluteRef)) {
                    // Add the link only if it:
                    // 1 - starts with the baseUrl
                    // 2 - hasn't been visited
                    // 3 - hasn't been added to the queue
                    linksToVisit.add(absoluteRef);
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

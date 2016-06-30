package com.lucas.example.crawler;

import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author Brendt Lucas
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(Jsoup.class)
public class JSoupCrawlerTest {

    private final String baseUrl = "http://somesite.com/";

    @Before
    public void beforeTest() {
        PowerMockito.spy(Jsoup.class);
    }

    @Test
    public void testUrlWithNoLinks() throws Exception {

        final Document document = Document.createShell(baseUrl);

        final HttpConnection mockConnection = mockPage(baseUrl, document);

        final JSoupCrawler crawler = new JSoupCrawler(baseUrl);
        crawler.crawl();

        assertEquals(0, crawler.getAnchors().size());
        assertEquals(0, crawler.getMedia().size());
        assertEquals(0, crawler.getImports().size());

        PowerMockito.verifyStatic();
        Jsoup.connect(baseUrl);
        verify(mockConnection).get();
    }

    @Test
    public void testUrlWithMediaAndImports() throws Exception {

        final Document document = new Document(baseUrl);
        final Element html = document.appendElement("html");
        final Element head = html.appendElement("head");
        final Element body = html.appendElement("body");

        // Add elements to the head tag
        final Element mediaLink = head.appendElement("link");
        mediaLink.attr("href", "http://somesite.com/favicon.ico");
        final Element script = head.appendElement("script");
        script.attr("src", "https://apis.google.com/js/plusone.js");

        // Add elements to the body tag
        final Element img = body.appendElement("img");
        img.attr("src", "http://something.com/img1.jpg");

        final HttpConnection mockConnection = mockPage(baseUrl, document);

        final JSoupCrawler crawler = new JSoupCrawler(baseUrl);
        crawler.crawl();

        assertEquals(0, crawler.getAnchors().size());
        assertEquals(2, crawler.getMedia().size());
        assertEquals(1, crawler.getImports().size());

        PowerMockito.verifyStatic();
        Jsoup.connect(baseUrl);
        verify(mockConnection).get();
    }

    @Test
    public void testUrlWithMediaAndImportsAndInternalAndExternalAnchors() throws Exception {

        final Document document = new Document(baseUrl);
        final Element html = document.appendElement("html");
        final Element head = html.appendElement("head");
        final Element body = html.appendElement("body");

        // Add elements to the head tag
        final Element mediaLink = head.appendElement("link");
        mediaLink.attr("href", baseUrl + "favicon.ico");
        final Element script = head.appendElement("script");
        script.attr("src", "https://apis.google.com/js/plusone.js");

        // Add elements to the body tag
        final Element img = body.appendElement("img");
        img.attr("src", "http://something.com/img1.jpg");
        final Element a1 = body.appendElement("a");
        final String url2 = baseUrl + "page2";
        a1.attr("href", url2);
        a1.text("Page 2");
        final Element a2 = body.appendElement("a");
        a2.attr("href", "http://something.com/page5");
        a2.text("Other Site Page 5");


        final HttpConnection mockConnection = mockPage(baseUrl, document);
        final HttpConnection mockConnection2 = mockPage(url2, document);

        final JSoupCrawler crawler = new JSoupCrawler(baseUrl);
        crawler.crawl();

        assertEquals(2, crawler.getAnchors().size());
        assertEquals(2, crawler.getMedia().size());
        assertEquals(1, crawler.getImports().size());

        PowerMockito.verifyStatic();
        Jsoup.connect(baseUrl);
        verify(mockConnection).get();

        PowerMockito.verifyStatic();
        Jsoup.connect(url2);
        verify(mockConnection2).get();
    }

    private HttpConnection mockPage(String url, Document document) throws IOException {
        final HttpConnection mockConnection = Mockito.mock(HttpConnection.class);
        when(Jsoup.connect(url)).thenReturn(mockConnection);
        when(mockConnection.get()).thenReturn(document);
        return mockConnection;
    }

}

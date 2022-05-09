
import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

//Running junit
//javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
//java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest
public class MarkdownParseTest {

    @Test
    public void modTester() throws IOException
    {
        assertEquals(0, 2%2);
    }


    @Test
    public void testGetLinks() throws IOException
    {
        Path fileName =   Path.of("test-file.md");   
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expect = new ArrayList<>();
        expect.add("https://something.com");
        expect.add("some-thing.html");

        assertEquals(expect, links);
    }

    @Test
    public void testGetLinks3() throws IOException
    {
        Path fileName =   Path.of("test3.md");   
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expect = new ArrayList<>();
        expect.add("bye.com");

        assertEquals(expect, links);
    }

    @Test
    public void testGetLinks4() throws IOException
    {
        Path fileName =   Path.of("test4.md");   
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expect = new ArrayList<>();

        assertEquals(expect, links);
    }

    @Test
    public void testGetLinksF2() throws IOException
    {
        Path fileName =   Path.of("test-file2.md");   
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expect = new ArrayList<>();
        expect.add("https://something.com");
        expect.add("some-page.html");

        assertEquals(expect, links);
    }

    @Test
    public void testGetLinksF3() throws IOException
    {
        Path fileName =   Path.of("test-file3.md");   
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expect = new ArrayList<>();

        assertEquals(expect, links);
    }

    @Test
    public void testGetLinksF4() throws IOException
    {
        Path fileName =   Path.of("test-file4.md");   
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expect = new ArrayList<>();

        assertEquals(expect, links);
    }

    @Test
    public void testGetLinksF5() throws IOException
    {
        Path fileName =   Path.of("test-file5.md");   
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expect = new ArrayList<>();

        assertEquals(expect, links);
    }

    @Test
    public void testGetLinksF6() throws IOException
    {
        Path fileName =   Path.of("test-file6.md");   
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expect = new ArrayList<>();

        assertEquals(expect, links);
    }

    @Test
    public void testGetLinksF7() throws IOException
    {
        Path fileName =   Path.of("test-file7.md");   
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expect = new ArrayList<>();

        assertEquals(expect, links);
    }

    @Test
    public void testGetLinksF8() throws IOException
    {
        Path fileName =   Path.of("test-file8.md");   
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expect = new ArrayList<>();
        expect.add("a link on the first line");

        assertEquals(expect, links);
    }

        @Test
    public void testGetLinksF9() throws IOException
    {
        Path fileName =   Path.of("test-file9.md");   
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expect = new ArrayList<>();
        expect.add("https://twitter.com");
        expect.add("");
        expect.add("https://facebook.com");

        assertEquals(expect, links);
    }
}
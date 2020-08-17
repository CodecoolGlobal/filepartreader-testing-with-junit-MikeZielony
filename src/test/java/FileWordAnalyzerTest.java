import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileWordAnalyzerTest {

    FileWordAnalyzer fileWordAnalyzer = new FileWordAnalyzer();

    @Test
    public void testGetWordsOrderedAlphabetically() throws IOException {
        List<String> expected = Arrays.asList("a", "from", "on");

        assertEquals(expected, fileWordAnalyzer.getWordsOrderedAlphabetically());
    }

    @Test
    public void testGetStringsWhichPalindromes() throws IOException {
        List<String> expected = new ArrayList<>();
        expected.add("kajak");
        expected.add("rowor");
        expected.add("dood");



        assertEquals(expected, fileWordAnalyzer.getStringsWhichPalindromes());
    }
}

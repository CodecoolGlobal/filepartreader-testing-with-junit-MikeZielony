import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FilePartReader filePartReader = new FilePartReader();
        FileWordAnalyzer fileWordAnalyzer = new FileWordAnalyzer(filePartReader);
        filePartReader.setup("/Users/mzi/Desktop/zADANIA/filepartreader-testing-with-junit-MikeZielony/src/main/resources/text.txt", 1, 111);

        System.out.println(fileWordAnalyzer.getStringsWhichPalindromes());
        System.out.println(fileWordAnalyzer.getWordsOrderedAlphabetically());
        System.out.println(fileWordAnalyzer.getWordsContainingSubstring("ja"));
    }
}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FilePartReader {
    private String filePath;
    private int fromLine;
    private int toLine;


    public FilePartReader() {
        this.filePath = "";
        this.fromLine = 0;
        this.toLine = 0;
    }

    public void setup(String filePath, int fromLine, int toLine) {
        if (toLine < fromLine) throw new IllegalArgumentException("toLine is smaller than fromLine");
        if (fromLine < 1) throw new IllegalArgumentException("fromLine is smaller than 1");
        this.filePath = filePath;
        this.fromLine = fromLine;
        this.toLine = toLine;


    }

    public String read() throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    public String readLines() throws IOException {
        String text = read();
        String[] splittedText = text.split(System.lineSeparator());
        String[] selectedLines = Arrays.copyOfRange(splittedText, fromLine - 1, toLine);
        return String.join(" ", selectedLines);
    }
}

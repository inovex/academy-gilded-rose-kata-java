package gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;

public class GildedRoseApplicationTests {

    private static final String testFileName = "test.txt";
    private static final String goldenMasterFilename = "GoldenMaster.txt";

    private String readFile(String filePath) throws IOException {
        Path path = Path.of(filePath);

        return Files.readString(path);
    }

    @Test
    void run_ComparedToGoldenMaster_ShouldReturnSameValues() throws IOException {
        File file = new File(testFileName);
        PrintStream stream = new PrintStream(file);
        System.setOut(stream);

        GildedRoseApplication app = new GildedRoseApplication();
        app.run();

        String actualOutput = readFile(testFileName);
        String goldenMaster = readFile(goldenMasterFilename);
        assertEquals(goldenMaster, actualOutput);

    }
}

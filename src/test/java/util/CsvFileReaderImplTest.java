package util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CsvFileReaderImplTest {
    public static final String PATH = "src/test/resources/tests.txt";

    @Test
    void readFile() {
        CsvFileReaderImpl reader = new CsvFileReaderImpl();
        assertEquals(4, reader.readFile(PATH).size());
    }


}
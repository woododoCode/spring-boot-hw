package util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FileReaderImplTest {
    public static final String PATH = "tests.txt";

    @Test
    void readFile() {
        FileReaderImpl reader = new FileReaderImpl();
        assertEquals(8, reader.readFile(PATH).length());
    }


}

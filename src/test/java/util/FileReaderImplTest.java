package util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FileReaderImplTest {
    public static final String PATH = "src/test/resources/tests.txt";

    @Test
    void readFile() {
        FileReaderImpl reader = new FileReaderImpl();
        assertEquals(4, reader.readFile(PATH).size());
    }


}

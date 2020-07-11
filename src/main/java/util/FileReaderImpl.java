package util;

import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.Cleanup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FileReaderImpl implements FileReader {

    @Override
    public String readFile(String path) {
        try {
            URI resource = Objects.requireNonNull(FileReaderImpl.class
                    .getClassLoader().getResource(path)).toURI();
            @Cleanup Stream<String> stringStream = Files.lines(Paths.get(resource));
            return stringStream.map(s -> s + "\n").collect(Collectors.joining());
        } catch (IOException | URISyntaxException e) {
            throw new UndeclaredThrowableException(e);
        }
    }
}

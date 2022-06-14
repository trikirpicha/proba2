package lesson22;

import java.io.*;
import java.nio.file.Path;

public class OutputRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "test.txt").toFile();
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file))) {
            String value = "Hello World!";
            outputStream.write(value.getBytes());
            outputStream.write(System.lineSeparator().getBytes());
        }
    }
}

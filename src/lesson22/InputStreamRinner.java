package lesson22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRinner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "test.txt").toFile();
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] bytes = fileInputStream.readAllBytes();
            String stringValue = new String(bytes);
            System.out.println(stringValue);
        }

    }

    }


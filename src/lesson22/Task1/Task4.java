package lesson22.Task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "lesson22", "Task1", "Task2.java");
        String stringValue = Files.readString(path);
        String result = stringValue.replace("public", "private");

        Path resultPath = Path.of("resources", "Task2.java");
        Files.writeString(resultPath, result);
    }
}

package lesson22.Task1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

//public class Task5 {
//    public static void main(String[] args) {
//        Path path = Path.of("src", "lesson22", "Task1", "Task4.java");
//        Path result = Path.of("resources", "Task4.java");
//        try (Stream<String> lines = Files.lines(path);
//             BufferedWriter bufferedWriter = Files.newBufferedWriter(result, StandardOpenOption.APPEND)) {
//            lines.map(StringBuilder::new)
//                        .map(StringBuilder::reverse)
//                         .forEach(bufferedWriter::write);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

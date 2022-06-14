package Metanit;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;


public class MetanitRunner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "test2.txt");
        try (FileWriter fileWriter = new FileWriter("path", true)) {
            String text = "Olegovich";
            fileWriter.write(text);


        }
    }
}
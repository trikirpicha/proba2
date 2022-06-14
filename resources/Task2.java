package lesson22.Task1;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

private class Task2 {
    private static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "test.txt");
        try (Scanner scanner = new Scanner(path)) {
            String prev = null;
            if (scanner.hasNext()){
                prev = scanner.next();

            }
            while (scanner.hasNext()){
                String current = scanner.next();

                if (isEqualLastSymbolAndFirstSympol(prev, current)) {
                    System.out.println(prev + " " + current);
                }
                prev = current;
            }
        }
    }

    private static boolean isEqualLastSymbolAndFirstSympol(String prev, String current) {
        return prev.charAt((prev.length() - 1)) == current.charAt(0);
    }
}

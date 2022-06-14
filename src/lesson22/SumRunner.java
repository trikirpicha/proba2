package lesson22;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SumRunner {
    public static void main(String[] args) throws IOException {
        int result = 0;
        Path path = Path.of("resources", "test2.txt");
        try (Scanner sc = new Scanner(path)) {
            while (sc.hasNext()) {
                result += sc.nextInt();
            }

            System.out.println(result);

        }








////        public static void sum(int value) {
//            int result;
//            result = value1 + value2+ value3+ value4;
        }



    }

//    public static int calculator(byte[] bytes) {
//        int result = 0;
//        for (int i = 0; i < bytes.length; i++) {
//            result += (int) bytes[i];
//
//        }
//        return result;
//    }



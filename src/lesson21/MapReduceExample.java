package lesson21;

import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {
    public static void main(String[] args) {
        Optional<Student> optional = Stream.of(
                        new Student(18, "Ivan"),
                        new Student(21, "Petr"),
                        new Student(33, "Sveta"),
                        new Student(45, "Katya"),
                        new Student(101, "Vasya")
                )
                .parallel()
//                .filter(student -> student.getAge() > 18)
//                .map(Student::getAge)
                .filter(student -> student.getAge() >33)
                .reduce((student, student2) -> student.getAge() > student2.getAge() ? student : student2);








        // .reduce((age1, age2)->Math.max(age1,age2))
    }

}

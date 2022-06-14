package lesson22;
/**
 Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами, затем удалит из них все числа,
 стоящие на четных позициях, и затем выведет получившуюся последовательность в обратном порядке в System.out.

 Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.

 Все import объявлены за вас.

 Пример ввода: 1 2 3 4 5 6 7 8 9 10
 Пример вывода: 10 8 6 4 2
 */



import java.io.Reader;
import java.util.*;

public class kata {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int i = 0;
        Scanner sc = new Scanner(System.in);
            while (sc.hasNextInt()){
                int val = sc.nextInt();
                    if (i++ % 2 !=0){
                        deque.remove(val);
                    } else {
                        deque.add(val);
                    }
            }
        deque.forEach(x -> System.out.print(x + " "));
    }
}









//        int i = 1;
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextInt()){
//            int val = sc.nextInt();
//            if (i++ % 2 == 0) {
//                removeEven.add(i);
//            }
//        }
//        Collections.reverse(removeEven);
//        removeEven.forEach(x -> System.out.print(x + " "));
//        }

  //  }





//    }
//}
//        public static Map<String, Long> getSalesMap (Reader reader){
//            Map<String, Long> map = new HashMap<>();
//            Scanner sc = new Scanner(reader);
//            while (sc.hasNext()) {
//                String value = sc.next();
//                long number = sc.nextLong();
//                map.merge(value, number, Long::sum);
//               }
//            return map.merge();
//        }


package ex04;

import java.util.Arrays;
import java.util.List;

public class CountApp {
    public static void main(String[] args) {
        //1. count
        List<String> names = Arrays.asList("Alice", "Bob", "Carl", "Dan", "Eve");

        List<String> r1 = names.stream() // 물가에 뿌리고
                .filter(name -> name.length() > 3) //중간연산
                .toList(); //바구니에 다시 담기

        r1.forEach(s -> System.out.println(s));

        Long r2 = names.stream()
                .filter(name -> name.length() > 3)
                .count();

        System.out.println(r2);
    }
}

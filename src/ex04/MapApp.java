package ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//.filter(name -> name.length() > 3)

public class MapApp {
    public static void main(String[] args) {
        //1. Map (가공) 기존 데이터 변형
        List<String> names = Arrays.asList("Alice", "Bob", "Carl", "Dan");

        List<String> newNames = names.stream()
                .map(name -> name.toLowerCase())
                .toList();

        newNames.forEach(name -> System.out.println(name));
    }
}

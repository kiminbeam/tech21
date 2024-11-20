package ex04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class GroupApp {
    public static void main(String[] args) {
        //1. count
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna");

        //Map <Character, List<String>>
        var groupData = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(groupData);

        System.out.println(groupData.get('A'));
    }
}

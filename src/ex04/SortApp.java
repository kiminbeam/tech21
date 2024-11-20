package ex04;

import java.util.Arrays;
import java.util.List;

public class SortApp {
    public static void main(String[] args) {
        //1. sort
        List<Integer> nums = Arrays.asList(5,3,1,4,2,5,2);

        nums.stream()
                .sorted()
                .distinct() // 중복제거 연산
                .forEach(integer -> System.out.print(integer));

    }
}

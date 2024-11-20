package ex04;

import java.util.Arrays;
import java.util.List;

public class ReduceApp {
    public static void main(String[] args) {
        //1. reduce (join 조인) = 수집연산자 > 중간연산자와 달리 뒤에 추가 못함.
        List<Integer> nums = Arrays.asList(1,2,3,4);

        int sum = nums.stream()
                .mapToInt(x -> x)//map처럼 돌면서 int 타입 return
                .sum();

        System.out.println(sum);

        int sum2 = nums.stream()
                .reduce(5, (prev, next) -> {
                    System.out.println("prev: " + prev);
                    System.out.println("next: " + next);
                    System.out.println("-----------");
                    return prev + next;
                });

    }
}

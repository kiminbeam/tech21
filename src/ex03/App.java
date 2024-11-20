package ex03;

// 옵셔널 : null 처리

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        String data1 = null;
        Optional<String> op1 = Optional.ofNullable(data1);

        if (op1.isPresent()) {
            String r1 = op1.get();
            System.out.println("r1: " + r1);
        }

        String data2 = null;
        String r2 = Optional.ofNullable(data2).orElseGet(() -> "없음");
        System.out.println("r2: " + r2);

        // ★★★★★★★
        String data3 = "222222";
        String r3 = Optional.ofNullable(data3).orElseThrow(() -> new RuntimeException("값이 없습니다. 주의"));
        System.out.println("r3: " + r3);

        String data4 = null;
        String r4 = Optional.ofNullable(data4).orElseThrow(() -> new RuntimeException("값이 없습니다. 주의"));
        System.out.println("r3: " + r3);
    }
}

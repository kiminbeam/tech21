package ex02;


// 1. 람다는 인터페이스로 만든다.
// 2. 람다 인터페이스에는 메서드가 하나만 존재해야 한다.
// 3. 메서드가 인터페이스를 매개변수로 받고 있다면, 행위를 주세요!!
// 4. 람다에서는 매개변수에 타입 생략 가능하다.
// 5. @FunctionalInterface 표시가능

public class App {
    public static void main(String[] args) {

        //람다식
        MyConsumer<Integer> r1 = (data) -> {
            System.out.println("소비할 데이터: " + data);
        };

        r1.accept(1);

        //람다 표현식
        MySupplier<String> r2 = () -> {
            //1. 만약에 오늘 날씨가
            //2. 연산
            //3. 리턴
            return "Good";
        };

        MySupplier<String> r3 = () -> "Good";
        String msg = r3.get();
        System.out.println(msg);

        MyFunction<String, String> r4 = (data) -> {
            return "안녕하세요.";
        };

        String result4 = r4.apply("hi");

        System.out.println(result4);



        MyPredicate<Integer> r5 = integer -> {
            return integer / 2 == 0;
        };

        boolean result5 = r5.apply(3);

        System.out.println(result5);

    }
}

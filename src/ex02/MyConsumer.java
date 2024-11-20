package ex02;

// 입력만 받고 출력이 없는 연산만 수행합니다.
public interface MyConsumer<T> {
    void accept(T data);
}

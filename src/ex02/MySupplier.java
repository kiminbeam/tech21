package ex02;

// 공급자 | 입력없이 값을 반환 (Return)
@FunctionalInterface // 람다식을 사용할 때 사용하는 어노테이션 (런타임에 확인)
public interface MySupplier<T> {
    T get();
}

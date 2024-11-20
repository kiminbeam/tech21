package ex01;

import com.google.gson.Gson;
import ex01.dto.OrderDetailDTO;
import ex01.dto.ProductDetailDTO;
import ex01.dto.ProductDto;
import ex01.model.Order;
import ex01.model.OrderOption;
import ex01.model.ProductOption;
import ex01.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        // 1. 상품 2개
        Product p1 = new Product(1, "바지");
        Product p2 = new Product(2, "티");


        // 2. 옵션 4개 생성 (2-1, 2-2)
        ProductOption op1 = new ProductOption(1, "파란바지", 1000, 10, p1);
        ProductOption op2 = new ProductOption(2, "빨간바지", 2000, 10, p1);
        ProductOption op3 = new ProductOption(3, "노랑티", 1000, 10, p2);
        ProductOption op4 = new ProductOption(4, "하얀티", 2000, 10, p2);


        List<ProductOption> p2Options = Arrays.asList(op3, op4);

        // 3. 구매
        Order or1 = new Order(1);
        OrderOption orOption1 = new OrderOption(1, "파란바지", 2, 2000, p1, or1);
        OrderOption orOption2 = new OrderOption(2, "빨간바지", 2, 4000, p1, or1);
        OrderOption orOption3 = new OrderOption(3, "하얀티", 5, 10000, p2, or1);

        // 4번문제 데이터 (이것만 넣고 DTO 만들기)


        op1.setQty(op1.getQty() - 2);
        op2.setQty(op2.getQty() - 2);
        op4.setQty(op4.getQty() - 5);

        Order or2 = new Order(2);
        OrderOption orOption4 = new OrderOption(4, "노랑티", 7, 7000, p2, or2);

        // 3번문제 데이터 (이것만 넣고 DTO 만들기)


        op3.setQty(op3.getQty() - 7);

        // gson
        Gson gson = new Gson();

        // 4. 상품 목록 화면 (products) -> List<ProductDTO>
        List<Product> products = Arrays.asList(p1, p2); // 1번 문제 -> products DTO로 옮기기

        //알고리즘
        //4.1 product -> new ProductDTO(product)
        List<ProductDto> productDtos = new ArrayList<>();

        for (Product product : products) {
            productDtos.add(new ProductDto(product));
        }

        String r1 = gson.toJson(productDtos); //객체를 json으로 만들어준다
        System.out.println(r1);

        System.out.println("======================");


        //////////////////////////////////////////////////
        // 5. 상품 상세 화면 (p1Options) -> ProductDetailDTO
        List<ProductOption> p1Options = Arrays.asList(op1, op2); // 2번 문제 -> p1, p1Options DTO로 옮기기
        ProductDetailDTO productDetailDTO = new ProductDetailDTO(p1Options);

        String r2 = gson.toJson(productDetailDTO); //객체를 json으로 만들어준다
        System.out.println(r2);

        System.out.println("======================");
        // 6-1. 주문 확인 상세 화면 (or2) ->
        //List<OrderOption> or2Options = Arrays.asList(orOption4);


        // 6-2. 주문 확인 상세 화면 (or1) -> OrderDetailDTO
        List<OrderOption> or1Options = Arrays.asList(orOption1, orOption2, orOption3);
        OrderDetailDTO orderDetailDTO = new OrderDetailDTO(or1Options);

        String r3 = gson.toJson(orderDetailDTO);
        System.out.println(r3);

    }


}
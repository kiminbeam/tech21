package ex01.dto;

import ex01.model.OrderOption;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class OrderDetailV2DTO {

    private int orderId;
    private List<OrderProductDTO> products = new ArrayList<>();
    private int sumPrice;

    public OrderDetailV2DTO(List<OrderOption> options) {
        // 1. orderId
        this.orderId = options.get(0).getOrder().getId();

        //2. sumPrice
//        for (OrderOption option : options) {
//            this.sumPrice += option.getTotalPrice();
//        }

        this.sumPrice = options.stream()
                .mapToInt(value -> value.getTotalPrice())
                .sum();

        //3. products
        //List<OrderOption> options 물가에 던지기
        //productId 로 그룹핑 (or1, or2) (or3)
        //OrderProductDTO 그룹 갯수만큼 생성해서 만들어주기

        this.products = options.stream()
                .collect(Collectors.groupingBy(op -> op.getProduct().getId()))
                .entrySet() // Map 타입 -> Set 타입으로 변경시켜준다. (이후 다시 stream 돌린다. 컬렉션만)
                .stream()
                .map(en -> new OrderProductDTO(en.getValue()))
                .toList();

    }


    }

    @Data
    class OrderProductDTO { // 돈봉투
        private int productId;
        private List<OrderOptionDTO> options = new ArrayList<>();

        public OrderProductDTO(List<OrderOption> options) {
            this.productId = options.get(0).getProduct().getId();

//            for (OrderOption option : options) {
//                this.options.add(new OrderOptionDTO(option));
//            }

            this.options = options.stream()
                    .map(orderOption -> new OrderOptionDTO(orderOption))
                    .toList();
        }

        @Data
        class OrderOptionDTO {
            private int id;
            private String optionName; // 하얀티
            private int qty; // 5개
            private int totalPrice;

            public OrderOptionDTO(OrderOption option) {
                this.id= option.getId();
                this.optionName = option.getOptionName();
                this.qty = option.getQty();
                this.totalPrice = option.getTotalPrice();
            }
        }
    }


package ex01.dto;

import lombok.Data;
import ex01.model.Product;

@Data
public class ProductDto {
    private int id;
    private String name; // 바지

    public ProductDto(Product product) {
        this.id = product.getId();
        this.name = product.getName();
    }

}

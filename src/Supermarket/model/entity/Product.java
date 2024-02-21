package Supermarket.model.entity;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

public class Product {
    private String name;
    private String brand;
    private String serial;
    private Double price;


    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

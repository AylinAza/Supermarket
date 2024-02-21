package Supermarket.model.entity;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

public class Order {
    private int id;
    private Customer customer;
    private Product product;
    private LocalDate date;
    private int discount;
    private int totalAmount;
    private int payment;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

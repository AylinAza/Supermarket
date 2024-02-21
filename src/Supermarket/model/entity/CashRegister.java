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

public class CashRegister {
    private int id;
    private Order order;
    private Double amount;
    private Double cashAmount;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}

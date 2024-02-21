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

public class Storage {
    private int id;
    private Product product;
    private int quantity;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

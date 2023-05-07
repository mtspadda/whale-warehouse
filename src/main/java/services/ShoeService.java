package services;

import org.springframework.stereotype.Component;
import whalewarehouse.Shoe;

import java.util.List;
@Component
public class ShoeService {
    public List<Shoe> getAllShoes(){
        return List.of(new Shoe(1L, "7899999876", "Sneaker"));
    }

}

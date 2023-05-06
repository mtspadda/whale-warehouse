package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import services.ShoeService;
import whalewarehouse.Shoe;

import java.util.List;

@RequestMapping(path = "api/v1/shoe")
public class ShoeController {

    public ShoeController(ShoeService shoeService) {
        this.shoeService = shoeService;
    }

    private final ShoeService shoeService;

    @GetMapping
    public List<Shoe> getAllShoes(){
        return shoeService.getAllShoes();
    }
}

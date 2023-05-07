package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.ShoeService;
import whalewarehouse.Shoe;

import java.util.List;
@RestController
@RequestMapping(path = "api/v1/shoe")
public class ShoeController {

    private final ShoeService shoeService;
    @Autowired
    public ShoeController(ShoeService shoeService) {
        this.shoeService = shoeService;
    }


    @GetMapping
    public List<Shoe> getAllShoes(){
        return shoeService.getAllShoes();
    }
}

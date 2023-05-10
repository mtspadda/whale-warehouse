package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.ShoeService;
import whalewarehouse.Shoe;

import java.util.List;
import java.util.Optional;

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
        return shoeService.findAll();
    }

    @PostMapping
    public void saveShoe(@RequestBody Shoe shoe){
        shoeService.save(shoe);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Shoe> updateShoe(@PathVariable(value = "id") Long id, @RequestBody Shoe requestShoe){
        Optional<Shoe> shoe = shoeService.findById(id);

        shoeService.save(requestShoe);

        return ResponseEntity.ok(requestShoe);

    }
}

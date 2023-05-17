package controller;

import exceptions.ResourceNotFoundException;
import model.Shoe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ShoeService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/shoes")
public class ShoeController {

    private ShoeService shoeService;

    @Autowired
    public ShoeController(ShoeService shoeService) {
        this.shoeService = shoeService;
    }

    @GetMapping
    public ResponseEntity<List<Shoe>> getAllShoes() {
        List<Shoe> shoes = shoeService.getAll();
        return new ResponseEntity<>(shoes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Shoe> getShoeById(@PathVariable Long id) {
        Shoe shoe = shoeService.getById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Shoe not found with id: " + id));
        return new ResponseEntity<>(shoe, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Shoe> createShoe(@RequestBody Shoe shoe) {
        Shoe createdShoe = shoeService.create(shoe);
        return new ResponseEntity<>(createdShoe, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Shoe> updateShoe(@PathVariable Long id, @RequestBody Shoe shoe) {
        Shoe updatedShoe = shoeService.update(id, shoe);
        return new ResponseEntity<>(updatedShoe, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteShoe(@PathVariable Long id) {
        shoeService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

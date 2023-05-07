package services;

import controllers.ShoeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import whalewarehouse.Shoe;

import java.util.List;
import java.util.Optional;

@Service
public class ShoeService {

    private final ShoeRepository shoeRepository;

    @Autowired
    public ShoeService(ShoeRepository shoeRepository){
        this.shoeRepository = shoeRepository;
    }
    public List<Shoe> getAllShoes(){
        return shoeRepository.findAll();
    }

    public void addNewShoe(Shoe shoe) {
        Optional<Shoe> shoeByBarCode =
        shoeRepository.findShoeByBarCode(shoe.getBarCode());

    }
}

package services;

import controllers.ShoeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import whalewarehouse.Shoe;

import java.util.List;
import java.util.Optional;

@Service
public class ShoeServiceImpl implements ShoeService{

    @Autowired
    private ShoeRepository shoeRepository;

    @Override
    public Optional<Shoe> findById(Long id){
        return shoeRepository.findById(id);
    }
    @Override
    public void save(Shoe shoe) {
        shoeRepository.save(shoe);
    }

    @Override
    public List<Shoe> findAll() {
        return shoeRepository.findAll();
    }

    @Override
    public void delete(long id) {
        shoeRepository.deleteById(id);
    }






}

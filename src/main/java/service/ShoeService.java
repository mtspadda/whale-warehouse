package service;

import model.Shoe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ShoeRepository;


@Service
public class ShoeService{

    @Autowired
    private ShoeRepository repository;

    public ShoeService(ShoeRepository repository) {
        // Here will be the branch logic which will be use in branch controller
    }
}

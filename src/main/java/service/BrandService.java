package service;

import model.Brand;
import org.springframework.stereotype.Service;
import repository.BrandRepository;

@Service
public class BrandService{

    private BrandRepository repository;


    public BrandService(BrandRepository repository){
        // Here will be the branch logic which will be use in branch controller
    }
}

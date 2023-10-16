package service;

import model.Brand;
import org.springframework.stereotype.Service;
import repository.BasicRepository;

@Service
public class BrandService extends GenericService<Brand, Long> {

    private BasicRepository repository;


    public BrandService(BasicRepository repository){
        super(repository);
        this.repository = repository;
    }
}

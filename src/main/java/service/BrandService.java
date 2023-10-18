package service;

import model.Brand;
import org.springframework.stereotype.Service;
import repository.BrandRepository;

@Service
public class BrandService extends GenericService<Brand, Long> {

    private BrandRepository repository;


    public BrandService(BrandRepository repository){
        super(repository);
        this.repository = repository;
    }
}

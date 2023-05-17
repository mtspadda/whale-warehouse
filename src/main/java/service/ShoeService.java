package service;

import model.Shoe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ShoeRepository;


@Service
public class ShoeService extends GenericService<Shoe, Long> {

    private ShoeRepository repository;

    public ShoeService(ShoeRepository repository) {
        super(repository);
        this.repository = repository;
    }
}

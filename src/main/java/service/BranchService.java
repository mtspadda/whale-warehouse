package service;

import model.Branch;
import org.springframework.stereotype.Service;
import repository.BranchRepository;
import repository.BrandRepository;

@Service
public class BranchService extends GenericService<Branch, Long>{

    private BranchRepository repository;

    public BranchService(BranchRepository repository){
        super(repository);
        this.repository = repository;
    }
}

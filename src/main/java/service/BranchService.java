package service;

import model.Branch;
import org.springframework.stereotype.Service;
import repository.BranchRepository;
import repository.BrandRepository;

@Service
public class BranchService extends GenericService<Branch, Long>{
    // I Will leave the extends here to futher tests
    private BranchRepository repository;

    public BranchService(BranchRepository repository){
        super(repository);
        this.repository = repository;
        // Here will be the branch logic which will be use in branch controller

    }
}

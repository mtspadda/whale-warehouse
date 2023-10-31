package service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import repository.BranchRepository;

import java.util.List;
import java.util.Optional;

@Service
public abstract class GenericService<T, ID> {

    private JpaRepository<T, ID> repository;

    public GenericService(BranchRepository repository) {
        this.repository = repository;
    }

    public List<T> getAll() {
        return repository.findAll();
    }

    public Optional<T> getById(ID id) {
        return repository.findById(id);
    }

    public T create(T entity) {
        return repository.save(entity);
    }

    public T update(ID id, T entity) {
        if (repository.existsById(id)) {
            return repository.save(entity);
        } else {
            throw new IllegalArgumentException("Cannot update entity. Entity with ID " + id + " does not exist.");
        }
    }

    public void delete(ID id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Cannot delete entity. Entity with ID " + id + " does not exist.");
        }
    }
}


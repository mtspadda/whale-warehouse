package services;

import controllers.ShoeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import whalewarehouse.Shoe;

import java.util.List;
import java.util.Optional;

public interface ShoeService {


    List < Shoe > findAll();

    void save(Shoe shoe);

    Optional < Shoe > findById(Long id);

    void delete(long id);

}

package service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.Shoe;
import org.springframework.stereotype.Service;

@Service
public interface ShoeService extends JpaRepository<Shoe, Long> {

}

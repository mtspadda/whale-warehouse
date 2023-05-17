package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Shoe;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ShoeRepository extends JpaRepository<Shoe, Long> {

}

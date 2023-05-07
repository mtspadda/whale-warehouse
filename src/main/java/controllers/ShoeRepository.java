package controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import whalewarehouse.Shoe;

import java.util.Optional;

@Repository
public interface ShoeRepository extends JpaRepository<Shoe, Long> {

    //SELECT * FROM SHOE WHERE = ?
    @Query("SELECT s FROM Shoe s Where s.email = ?1") // TO BE SPECIFIC OR JUST TO SHOW THE QUERY
    Optional<Shoe> findShoeByBarCode(String barcode);

}

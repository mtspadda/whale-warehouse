package controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import whalewarehouse.Shoe;

import java.util.Optional;

@Repository
public interface ShoeRepository extends JpaRepository<Shoe, Long> {

}

package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table
public class StorePick {
    @Id
    @GeneratedValue
    private Long id;

    private List<Shoe> shoes;


}

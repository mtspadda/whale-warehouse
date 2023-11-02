package model;

import jakarta.persistence.*;
import org.h2.util.Task;


@Embeddable
public class ShoeStorePickPK {

    @ManyToOne
    @JoinColumn
    private Shoe shoe;

    @ManyToOne
    @JoinColumn
    private Task task;
}

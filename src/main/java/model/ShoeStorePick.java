package model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name="shoe_task")
public class ShoeStorePick implements Serializable {

    @EmbeddedId
    private ShoeStorePickPK id = new ShoeStorePickPK();
    public ShoeStorePick() {}

    public ShoeStorePick(Shoe shoe, StorePick storePick){
        super();
    }

}

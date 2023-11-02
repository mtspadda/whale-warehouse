package model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "shoe")
public class Shoe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "bar_code", length = 100, nullable = false)
    private String barCode;

    @Column(name = "description", length = 250, nullable = false)
    private String description;

    @OneToMany(mappedBy = "id.storepick")
    public Set<ShoeStorePick> shoeStorePicks = new HashSet<>();

    public Shoe(Long id, String barCode, String description) {
        this.id = id;
        this.barCode = barCode;
        this.description = description;
    }

    public Shoe() {
    }

    public Long getId() {
        return id;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<StorePick> getStorePick(){
        List<StorePick> storePicks = new ArrayList<StorePick>();
        for(ShoeStorePick ssp: shoeStorePicks){
          //  storePicks.add(ssp.getStorePick());
        }
        return storePicks;
    }
}

package model;

import jakarta.persistence.*;

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
}

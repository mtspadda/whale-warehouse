package whalewarehouse;

public class Shoe {
    private Integer id;

    private String barCode;

    private String description;

    public Shoe(Integer id, String barCode, String description) {
        this.id = id;
        this.barCode = barCode;
        this.description = description;
    }

    public Shoe() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

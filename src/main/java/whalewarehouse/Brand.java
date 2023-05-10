package whalewarehouse;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "brand")
public class Brand {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "brand_name", length = 10, nullable = false)
    private String brandName;

    public Brand(Integer id, String brandName) {
        this.id = id;
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}

package whalewarehouse;

public class Brand {

    private Integer id;

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

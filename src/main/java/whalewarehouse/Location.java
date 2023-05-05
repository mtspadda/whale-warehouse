package whalewarehouse;

public class Location {

    private Integer id;

    private String barCode;

    private String locationCode;

    private LocationType locationType;

    public Location(Integer id, String barCode, String locationCode, LocationType locationType) {
        this.id = id;
        this.barCode = barCode;
        this.locationCode = locationCode;
        this.locationType = locationType;
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

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public LocationType getLocationType() {
        return locationType;
    }

    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
    }
}

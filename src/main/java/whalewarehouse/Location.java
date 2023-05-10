package whalewarehouse;

import jakarta.persistence.*;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "bar_code", length = 20, nullable = false)
    private String barCode;

    @Column(name = "location_code", length = 20, nullable = false)
    private String locationCode;

    @Column(name = "location_type", length = 20, nullable = false)
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

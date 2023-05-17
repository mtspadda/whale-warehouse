package service;

import model.Location;
import org.springframework.stereotype.Service;
import repository.LocationRepository;
import repository.ShoeRepository;

@Service
public class LocationService extends GenericService<Location, Long> {

    private LocationRepository repository;

    public LocationService(LocationRepository repository) {
        super(repository);
        this.repository = repository;
    }

}

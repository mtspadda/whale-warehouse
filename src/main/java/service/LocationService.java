package service;

import model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.LocationRepository;
import repository.ShoeRepository;

@Service
public class LocationService{

    @Autowired
    private LocationRepository repository;

    public LocationService(LocationRepository repository) {
        // Here will be the branch logic which will be use in branch controller
    }

}

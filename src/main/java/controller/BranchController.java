package controller;

import exceptions.ResourceNotFoundException;
import model.Branch;
import model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.BranchService;
import service.BrandService;
import service.LocationService;

import java.util.List;

@RestController
@RequestMapping("api/v1/branch")
public class BranchController {


    private final BranchService branchService;

    @Autowired
    public BranchController(BranchService branchService) {
        this.branchService = branchService;
    }

    @GetMapping
    public ResponseEntity<List<Branch>> getAllLocations() {
        List<Branch> branches = branchService.getAll();
        return new ResponseEntity<>(branches, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Branch> getBranchById(@PathVariable Long id) {
        Branch branch = branchService.getById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Location not found with id: " + id));
        return new ResponseEntity<>(branch, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Branch> createBranch(@RequestBody Branch branch) {
        Branch createdBranch = branchService.create(branch);
        return new ResponseEntity<>(createdBranch, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Branch> updateBranch(@PathVariable Long id, @RequestBody Branch branch) {
        Branch updatedBranch = branchService.update(id, branch);
        return new ResponseEntity<>(updatedBranch, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLocation(@PathVariable Long id) {
        branchService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

}

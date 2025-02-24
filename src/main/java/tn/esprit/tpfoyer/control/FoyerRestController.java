package tn.esprit.tpfoyer.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.service.IFoyerService;

import java.util.List;

@RestController
@RequestMapping("/foyer")
public class FoyerRestController {

    @Autowired
    IFoyerService foyerService;

    // http://localhost:8089/tpfoyer/foyer/retrieve-all-foyers
    // GET - Retrieve all foyers
    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> getFoyers() {
        return foyerService.retrieveAllFoyers();
    }

    // http://localhost:8089/tpfoyer/foyer/retrieve-foyer/{foyer-id}
    // GET - Retrieve a specific foyer by ID
    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long foyerId) {
        return foyerService.retrieveFoyer(foyerId);
    }

    // http://localhost:8089/tpfoyer/foyer/add-foyer
    // POST - Add a new foyer
    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    // http://localhost:8089/tpfoyer/foyer/remove-foyer/{foyer-id}
    // DELETE - Remove a foyer by ID
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long foyerId) {
        foyerService.removeFoyer(foyerId);
    }

    // http://localhost:8089/tpfoyer/foyer/modify-foyer
    // PUT - Modify an existing foyer
    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer foyer) {
        return foyerService.modifyFoyer(foyer);
    }
}

package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Foyer;
import java.util.List;

public interface IFoyerService {

    // Retrieve all foyers
    List<Foyer> retrieveAllFoyers();

    // Retrieve a specific foyer by its ID
    Foyer retrieveFoyer(Long foyerId);

    // Add a new foyer
    Foyer addFoyer(Foyer foyer);

    // Remove a foyer by its ID
    void removeFoyer(Long foyerId);

    // Modify an existing foyer
    Foyer modifyFoyer(Foyer foyer);
}

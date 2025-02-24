package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Universite;
import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversites();
    Universite retrieveUniversite(Long idUniversite);
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    void removeUniversite(Long idUniversite);
}

package tn.esprit.tpfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.entity.Reservation;
import tn.esprit.tpfoyer.repository.ReservationRepository;

import java.util.List;

@Service
public class ReservationServiceImpl implements IReservationService {

    @Autowired
    ReservationRepository reservationRepository;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation retrieveReservation(String reservationId) {
        return reservationRepository.findById(reservationId).orElse(null);
    }

    @Override
    public Reservation addReservation(Reservation reservation) {
        System.out.println("Ajout de la réservation : " + reservation.getIdReservation());
        for (Etudiant etudiant : reservation.getEtudiants()) {
            System.out.println("Vérification de l'étudiant avec ID : " + etudiant.getIdEtudiant());
        }
        return reservationRepository.save(reservation);
    }


    @Override
    public void removeReservation(String reservationId) {
        reservationRepository.deleteById(reservationId);
    }

    @Override
    public Reservation modifyReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}

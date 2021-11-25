package pl.patronage.zadanie.zadaniepatronage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.patronage.zadanie.zadaniepatronage.domain.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationRepository {
    List<Reservation> findAll();

    Optional<Object> findById(String id);

    Reservation findById();
}

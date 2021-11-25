package pl.patronage.zadanie.zadaniepatronage.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.patronage.zadanie.zadaniepatronage.domain.Reservation;
import pl.patronage.zadanie.zadaniepatronage.exceptions.NotFoundException;
import pl.patronage.zadanie.zadaniepatronage.model.ReservationRequest;
import pl.patronage.zadanie.zadaniepatronage.repository.ReservationRepository;

import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class ReservationService {
    private ReservationRepository reservationRepository;

    public Reservation createReservation(ReservationRequest reservationRequest) {
        Reservation reservation = (Reservation) reservationRepository.findById(reservationRequest.getId()).orElseThrow(() ->
                new NotFoundException("Couldn't make reservation"));
        return reservation;
    }
    public void removeReservation(String id) {
        reservationRepository.findById(id);

    }

    public List<Reservation> getReservationList() {
        return reservationRepository.findAll();
    }
    public Reservation getReservation(String id) {
        return (Reservation) reservationRepository.findById(id).orElseThrow(() ->
                new NotFoundException("Couldn't find reservation"))
                ;}

}


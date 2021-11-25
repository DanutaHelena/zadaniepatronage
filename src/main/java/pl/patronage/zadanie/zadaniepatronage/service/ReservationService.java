package pl.patronage.zadanie.zadaniepatronage.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.patronage.zadanie.zadaniepatronage.domain.Parking;
import pl.patronage.zadanie.zadaniepatronage.domain.Reservation;
import pl.patronage.zadanie.zadaniepatronage.repository.ReservationRepository;


@Service
@Transactional
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;


}



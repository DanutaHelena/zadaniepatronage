package pl.patronage.zadanie.zadaniepatronage.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.patronage.zadanie.zadaniepatronage.domain.Parking;
import pl.patronage.zadanie.zadaniepatronage.domain.Reservation;
import pl.patronage.zadanie.zadaniepatronage.model.ReservationRequest;
import pl.patronage.zadanie.zadaniepatronage.repository.ParkingRepository;
import pl.patronage.zadanie.zadaniepatronage.repository.ReservationRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class ParkingService {

    private final ReservationRepository reservationRepository;
    private final ParkingRepository parkingRepository;

    public Reservation createReservation(ReservationRequest reservationRequest) {
        Parking parking = parkingRepository.
    }
    public void removeReservation(String id){
        reservationRepository.
    }
}

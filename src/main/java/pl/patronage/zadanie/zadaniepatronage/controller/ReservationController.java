package pl.patronage.zadanie.zadaniepatronage.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.patronage.zadanie.zadaniepatronage.domain.Reservation;
import pl.patronage.zadanie.zadaniepatronage.model.ReservationRequest;
import pl.patronage.zadanie.zadaniepatronage.service.ReservationService;

@RestController
@RequestMapping("api/reservations")
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation createReservation(@RequestBody ReservationRequest reservationRequest) {
        return reservationService.createReservation(reservationService);

    }

}

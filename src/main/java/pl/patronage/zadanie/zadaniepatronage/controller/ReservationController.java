package pl.patronage.zadanie.zadaniepatronage.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.patronage.zadanie.zadaniepatronage.domain.Reservation;
import pl.patronage.zadanie.zadaniepatronage.model.ReservationRequest;
import pl.patronage.zadanie.zadaniepatronage.service.ReservationService;

import java.util.List;

@RestController
@RequestMapping("api/reservations")
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation createReservation(@RequestBody ReservationRequest reservationRequest, @PathVariable String id) {
        return reservationService.createReservation(reservationRequest);

    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeReservation(@PathVariable String id) {
        reservationService.removeReservation(id);
    }
    @GetMapping("/{id}")
    public List<Reservation> reservationList(){
        return reservationService.getReservationList();

    }
}

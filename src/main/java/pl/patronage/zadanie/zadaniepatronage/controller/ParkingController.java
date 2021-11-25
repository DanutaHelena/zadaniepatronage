package pl.patronage.zadanie.zadaniepatronage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patronage.zadanie.zadaniepatronage.service.ParkingService;


@RestController
@RequestMapping("/parking")
public class ParkingController {
    private ParkingService parkingService;

    }


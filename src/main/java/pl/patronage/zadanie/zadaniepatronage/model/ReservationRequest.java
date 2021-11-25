package pl.patronage.zadanie.zadaniepatronage.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservationRequest {

    @NonNull
    private String id;
}

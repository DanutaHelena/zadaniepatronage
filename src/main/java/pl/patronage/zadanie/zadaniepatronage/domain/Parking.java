package pl.patronage.zadanie.zadaniepatronage.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Entity (name = "PARKING_PLACES")
public class Parking {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private Integer parkingNumber;

    private Integer parkingStorey;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private enum parkingType {
        DISABLED, FAMILY, ALL
    }

}
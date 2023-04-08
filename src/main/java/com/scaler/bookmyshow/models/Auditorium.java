package com.scaler.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

// 1:M
// 1:1

@Entity
@Getter
@Setter
public class Auditorium extends BaseModel {
    private String name;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Seat> seats;
    private int capacity;

    @ElementCollection // M:M
    @Enumerated(EnumType.STRING)
    private List<AuditoriumFeature> auditoriumFeatures;

    // 1 A : 1 T
    // M  A :   1 T
    @ManyToOne
    private Theatre theatre;
}

package com.scaler.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel {
//    1 : 1
//    m  :  1
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private Date endTime;

    // 1 : 1
    // m  : 1
    @ManyToOne
    private Auditorium auditorium;

    // 1 : m
    // 1  :  1
    @OneToMany(mappedBy = "show")
    private List<ShowSeat> showSeats;

    //  1 : M
    //  1  :  1
    @OneToMany
    private List<ShowSeatType> showSeatTypes;

    @Enumerated(EnumType.STRING)
    private Language language;


    @ElementCollection //M:M
    @Enumerated(EnumType.STRING)
    private List<ShowFeature> showFeatures;
}

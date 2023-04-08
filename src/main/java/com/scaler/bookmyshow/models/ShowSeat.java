package com.scaler.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel {
    //   ShowSeat    Show
    //      1         1
    //      M         1
    @ManyToOne
    private Show show; // 1 show -> many show seats, and many show seats belong to 1 show

    //  SS : S
    //   1   1
    //   m    1
    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.STRING)
    private ShowSeatState state;
}

// Make a booking
// 0. Create a city
// 1. Create a theatre
// 2. Create a auditorium
//    in the theatre with seats
// 3. Create a Movie
// 4. Create a Show
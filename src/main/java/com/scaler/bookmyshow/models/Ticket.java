package com.scaler.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel {
    // Ticket   User
    //  1         1
    //  M         1
    @ManyToOne
    private User bookedBy;

    // Ticket   Show
    //    1       1
    //    M       1
    @ManyToOne
    private Show show;

    // 1 showSeat -> 1 seat in a particular show
    // Can 1 show seat belong to many tickets -> Yes
    // 1 ticket booked -> Seat 1
    // ticket got cancelled
    // another ticket booked -> Seat 1
    // Seat 1 -> booked by tickets -> 2
    // Can two active tickets book the same showSeat -> No


    // Ticket       ShowSeat
    //  1               M
    //  M               1
    @ManyToMany
    private List<ShowSeat> showSeats;
    private double totalAmount;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;

    private Date timeOfBooking;

}

// if there is a conflict of booking, allow the request
// that is booking more seats
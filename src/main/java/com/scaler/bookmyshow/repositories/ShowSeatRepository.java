package com.scaler.bookmyshow.repositories;

import com.scaler.bookmyshow.models.ShowSeat;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatRepository
extends JpaRepository<ShowSeat, Long> {
    @Lock(LockModeType.PESSIMISTIC_WRITE) // exclusive lock
    List<ShowSeat> findByIdIn(List<Long> showSeatIds); // select * from ShowSeatTable where id IN ();
    ShowSeat save(ShowSeat showSeat); //save means -> update and save, it will update an existing object or save a new object
}

package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class City extends BaseModel {
    private String name;

//    1 : M
//    1  :  1
    @OneToMany(fetch = FetchType.EAGER)
    private List<Theatre> theatres;
}

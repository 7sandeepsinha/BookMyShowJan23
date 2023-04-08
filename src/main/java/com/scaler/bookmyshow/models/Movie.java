package com.scaler.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String name;

    @ElementCollection // M:M
    @Enumerated(EnumType.STRING)
    private List<Language> languages;
//    1  : M
//    M   :  1
    @ManyToMany
    private List<Actor> actors;
    private int length;
    private double rating;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeature> movieFeatures;
}

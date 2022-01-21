package com.example.weatherservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "weathers")
@NoArgsConstructor
@AllArgsConstructor
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String main;
    private String description;
    private String icon;
    @ManyToOne
    private City city;
    private String time;

    public Weather(String main, String description, String icon, City city, String time) {
        this.main = main;
        this.description = description;
        this.icon = icon;
        this.city = city;
        this.time = time;
    }
}

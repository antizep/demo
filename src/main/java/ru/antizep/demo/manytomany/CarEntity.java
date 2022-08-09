package ru.antizep.demo.manytomany;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "car")
public class CarEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String model;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "driver_car",
            joinColumns = @JoinColumn(name = "car_id"),
            inverseJoinColumns = @JoinColumn(name = "driver_id")
    )
    private Set<DriverEntity> drivers;
}

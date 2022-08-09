package ru.antizep.demo.sequence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AutoGeneratorEntity {
    @Id
    //выбирает наиболее подходящюю реализацию исходя из диалекта БД здесь GenerationType.SEQUENCE
    @GeneratedValue
    private long id;
}

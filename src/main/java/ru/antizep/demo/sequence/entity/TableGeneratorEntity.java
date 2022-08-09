package ru.antizep.demo.sequence.entity;

import javax.persistence.*;

@Entity
public class TableGeneratorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

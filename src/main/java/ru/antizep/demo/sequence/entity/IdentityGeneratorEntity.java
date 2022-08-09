package ru.antizep.demo.sequence.entity;

import javax.persistence.*;

@Entity
public class IdentityGeneratorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

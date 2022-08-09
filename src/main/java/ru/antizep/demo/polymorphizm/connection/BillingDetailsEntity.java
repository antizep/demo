package ru.antizep.demo.polymorphizm.connection;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
public abstract class BillingDetailsEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String owner;
}

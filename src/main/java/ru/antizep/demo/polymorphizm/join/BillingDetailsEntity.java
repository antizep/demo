package ru.antizep.demo.polymorphizm.join;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "JBillingDetail")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@Table(name = "join_billing_detail")
public abstract class BillingDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String owner;
}

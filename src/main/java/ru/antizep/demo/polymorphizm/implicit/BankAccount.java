package ru.antizep.demo.polymorphizm.implicit;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class BankAccount extends BillingDetailSuperclass{
    @Id
    @GeneratedValue
    private Long id;
    private String account;
    private String bankName;
}

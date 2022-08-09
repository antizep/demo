package ru.antizep.demo.polymorphizm.connection;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity(name = "CBankAccount")
@Getter
@Setter
public class BankAccount extends BillingDetailsEntity {

    private String account;
    private String bankName;
}

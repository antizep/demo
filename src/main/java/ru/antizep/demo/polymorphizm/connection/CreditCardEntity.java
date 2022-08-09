package ru.antizep.demo.polymorphizm.connection;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity(name = "CCreditCard")
@Getter
@Setter
public class CreditCardEntity extends BillingDetailsEntity {
    private String cardNumber;
    private String expMonth;
    private String expYear;
}

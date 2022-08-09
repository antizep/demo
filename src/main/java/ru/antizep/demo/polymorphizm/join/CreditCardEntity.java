package ru.antizep.demo.polymorphizm.join;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "JCreditCard")
@Getter
@Setter
@Table(name = "join_credit_card")
public class CreditCardEntity extends BillingDetailsEntity {
    private String cardNumber;
    private String expMonth;
    private String expYear;
}

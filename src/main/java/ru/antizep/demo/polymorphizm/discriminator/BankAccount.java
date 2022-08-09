package ru.antizep.demo.polymorphizm.discriminator;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "SingleTableBankAccount")
@Getter
@Setter
@DiscriminatorValue("BA")
public class BankAccount extends BillingDetailEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String account;
    private String bankName;
}

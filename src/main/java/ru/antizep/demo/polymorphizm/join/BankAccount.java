package ru.antizep.demo.polymorphizm.join;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "JBankAccount")
@Getter
@Setter
@Table(name = "join_bank_account")
public class BankAccount extends BillingDetailsEntity {
    private String account;
    private String bankName;
}

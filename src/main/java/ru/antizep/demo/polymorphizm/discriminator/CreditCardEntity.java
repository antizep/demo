package ru.antizep.demo.polymorphizm.discriminator;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "SingleTableCreditCard")
@Getter
@Setter
@AttributeOverrides({@AttributeOverride(name = "owner",column = @Column(name = "cc_owner"))})
@DiscriminatorValue("CC")
public class CreditCardEntity extends BillingDetailEntity {


    private String cardNumber;
    private String expMonth;
    private String expYear;
}

package ru.antizep.demo.polymorphizm.implicit;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AttributeOverrides({@AttributeOverride(name = "owner",column = @Column(name = "cc_owner"))})
public class CreditCardEntity extends BillingDetailSuperclass{
    @Id
    @GeneratedValue
    private Long id;

    private String cardNumber;
    private String expMonth;
    private String expYear;
}

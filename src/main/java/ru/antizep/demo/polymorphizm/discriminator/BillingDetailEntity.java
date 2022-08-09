package ru.antizep.demo.polymorphizm.discriminator;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "SingleTableBillingDetail")
@Table(name = "sigle_table_billing_detail")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class BillingDetailEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String owner;
}

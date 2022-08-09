package ru.antizep.demo.embeddable.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "UserAddress")
@Getter
@Setter
@Table(name = "user_address")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private AddressEmbeddable homeAddress;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street",column = @Column(name = "billing_street")),
            @AttributeOverride(name = "zipcode",column = @Column(name = "billing_zipcode")),
            @AttributeOverride(name = "city",column = @Column(name = "billin_city"))

    })
    private AddressEmbeddable billingAddress;

}

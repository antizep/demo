package ru.antizep.demo.embeddable.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class AddressEmbeddable {
    private String street;
    private String zipcode;
    private String city;

}

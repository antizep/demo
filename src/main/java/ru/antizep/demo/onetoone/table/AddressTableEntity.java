package ru.antizep.demo.onetoone.table;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
public class AddressTableEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String address;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "address_user_table",
            joinColumns = @JoinColumn(name = "address_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private UserTableEntity user;
}

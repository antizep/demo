package ru.antizep.demo.onetoone.column;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "one_to_one_column_address")
public class AddressColumnEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String address;

    @OneToOne(optional = false, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private UserColumnEntity user;
}

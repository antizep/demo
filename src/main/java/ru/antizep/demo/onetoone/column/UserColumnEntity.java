package ru.antizep.demo.onetoone.column;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "OneToOneColumnUser")
@Table(name = "one_to_one_column_user")
public class UserColumnEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne(mappedBy = "user",cascade = CascadeType.PERSIST)
    private AddressColumnEntity address;

}

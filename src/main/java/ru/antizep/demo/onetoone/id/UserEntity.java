package ru.antizep.demo.onetoone.id;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "OneToOneUser")
@Table(name = "one_to_one_user")
public class UserEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne(mappedBy = "user",cascade = CascadeType.PERSIST)
    private AddressEntity address;
}

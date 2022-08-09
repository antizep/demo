package ru.antizep.demo.onetoone.id;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "one_to_one_address")

public class AddressEntity {
    @Id
    @GeneratedValue(generator = "addressKeyGenerator")
    @org.hibernate.annotations.GenericGenerator(
            name = "addressKeyGenerator",
            strategy = "foreign",
            parameters =
            @org.hibernate.annotations.Parameter(
                    name = "property", value = "user"
            )
    )
    private Long id;
    private String address;

    @OneToOne(optional = false)
    @PrimaryKeyJoinColumn
    private UserEntity user;
}

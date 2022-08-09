package ru.antizep.demo.manytoone;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
public class ItemEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "itemEntity",cascade = CascadeType.PERSIST,orphanRemoval = true)
    private List<ImageEntity> images;
}

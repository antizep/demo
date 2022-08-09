package ru.antizep.demo.manytoone;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ImageEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String filename;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "item_id")
    private ItemEntity itemEntity;
}

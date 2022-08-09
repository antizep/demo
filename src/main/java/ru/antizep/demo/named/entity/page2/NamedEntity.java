package ru.antizep.demo.named.entity.page2;

import javax.persistence.*;

@Entity(name = "OtherNameEntity")
@Table(name = "other_named",schema = "public")
public class NamedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "renamed_field")
    private String field;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

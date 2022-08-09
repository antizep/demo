package ru.antizep.demo.named.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OtherNameRepository extends JpaRepository<ru.antizep.demo.named.entity.page2.NamedEntity,Long> {
    @Query("select n from OtherNameEntity n")
    List<ru.antizep.demo.named.entity.page2.NamedEntity> customAll();
}

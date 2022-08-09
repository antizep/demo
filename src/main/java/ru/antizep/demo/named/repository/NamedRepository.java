package ru.antizep.demo.named.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.antizep.demo.named.entity.page1.NamedEntity;

import java.util.List;


public interface NamedRepository extends JpaRepository<ru.antizep.demo.named.entity.page1.NamedEntity,Long> {
    @Query("select n from NamedEntity n")
    List<NamedEntity> customAll();
}

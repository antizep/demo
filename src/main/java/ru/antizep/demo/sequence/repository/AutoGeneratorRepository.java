package ru.antizep.demo.sequence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.antizep.demo.sequence.entity.AutoGeneratorEntity;

public interface AutoGeneratorRepository extends JpaRepository<AutoGeneratorEntity,Long> {
}
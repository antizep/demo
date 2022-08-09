package ru.antizep.demo.sequence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.antizep.demo.sequence.entity.TableGeneratorEntity;

public interface TableGeneratorRepository extends JpaRepository<TableGeneratorEntity,Long> {
}

package ru.antizep.demo.sequence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.antizep.demo.sequence.entity.IdentityGeneratorEntity;

public interface IdentityGeneratorRepository extends JpaRepository<IdentityGeneratorEntity,Long> {
}

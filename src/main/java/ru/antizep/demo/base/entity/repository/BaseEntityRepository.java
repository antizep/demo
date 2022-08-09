package ru.antizep.demo.base.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.antizep.demo.base.entity.entity.UserEntity;

public interface BaseEntityRepository extends JpaRepository<UserEntity,Long> {
}

package ru.antizep.demo.embeddable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.antizep.demo.embeddable.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}

package ru.antizep.demo.base;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import ru.antizep.demo.base.entity.entity.UserEntity;
import ru.antizep.demo.base.entity.repository.BaseEntityRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class BaseEntityTest {
    @Autowired
    private BaseEntityRepository repository;
    @Test
    public void save(){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1L);
        repository.save(userEntity);
        assertEquals(repository.findAll().size(),1);
    }
}

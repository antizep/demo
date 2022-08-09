package ru.antizep.demo.onetoone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.antizep.demo.onetoone.column.AddressColumnEntity;
import ru.antizep.demo.onetoone.column.UserColumnEntity;
import ru.antizep.demo.onetoone.id.AddressEntity;
import ru.antizep.demo.onetoone.id.UserEntity;
import ru.antizep.demo.onetoone.table.AddressTableEntity;
import ru.antizep.demo.onetoone.table.UserTableEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@SpringBootTest
public class OneToOneTest {
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;
    EntityManager em;
    @BeforeEach
    void before(){
        em  = entityManagerFactory.createEntityManager();
    }
    @Test
    void idTest(){
        UserEntity userEntity = new UserEntity();
        userEntity.setName("Alexey");

        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setAddress("My full Address");
        addressEntity.setUser(userEntity);

        em.getTransaction().begin();
        em.persist(addressEntity);
        em.getTransaction().commit();
    }

    @Test
    void columnTest(){
        UserColumnEntity userEntity = new UserColumnEntity();
        userEntity.setName("Alexey");

        AddressColumnEntity addressEntity = new AddressColumnEntity();
        addressEntity.setAddress("My full Address");
        addressEntity.setUser(userEntity);

        em.getTransaction().begin();
        em.persist(addressEntity);
        em.getTransaction().commit();
    }

    @Test
    void tableTest(){
        UserTableEntity userTableEntity = new UserTableEntity();
        userTableEntity.setName("MyName");

        AddressTableEntity addressTableEntity = new AddressTableEntity();
        addressTableEntity.setUser(userTableEntity);
        addressTableEntity.setAddress("Long address");

        em.getTransaction().begin();
        em.persist(addressTableEntity);
        em.getTransaction().commit();
    }
}
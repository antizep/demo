package ru.antizep.demo.manytoone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ManyToOneTest {
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;
    EntityManager em;
    @BeforeEach
    void before(){
       em  = entityManagerFactory.createEntityManager();
    }
    @Test
    void test(){
        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setName("nameItem");

        ImageEntity imageEntity = new ImageEntity();
        imageEntity.setFilename("myFilename");
        imageEntity.setItemEntity(itemEntity);

        em.getTransaction().begin();
        em.persist(imageEntity);
        em.getTransaction().commit();
    }
    @Test
    void oprahRemoval(){
        em.getTransaction().begin();
        ItemEntity entity  = em.find(ItemEntity.class,10L);
        em.remove(entity);
        em.getTransaction().commit();
    }
}

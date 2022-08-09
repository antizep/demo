package ru.antizep.demo.polymorphizm.single;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.antizep.demo.polymorphizm.discriminator.CreditCardEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

@SpringBootTest
public class SingleTableTest {

    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;
    @Test
    void test() {


        EntityManager entityManager = entityManagerFactory.createEntityManager();


        EntityManager em = entityManagerFactory.createEntityManager();
        CreditCardEntity entity = new CreditCardEntity();
        entity.setExpYear("20");
        entity.setExpMonth("12");
        entity.setCardNumber("XXXXXXXXXX");
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.persist(entity);
        t.commit();
    }

}

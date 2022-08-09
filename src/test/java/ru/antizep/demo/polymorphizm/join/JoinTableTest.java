package ru.antizep.demo.polymorphizm.join;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.*;

@SpringBootTest
public class JoinTableTest {
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @Test
    void test() {

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

    @Test
    void selectTest(){
        EntityManager em = entityManagerFactory.createEntityManager();
        Query query = em.createQuery("SELECT b FROM JBillingDetail b");
        query.getResultList();
    }
}

package ru.antizep.demo.polymorphizm.implicit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.*;

@SpringBootTest
public class ImplicitExtendsTest {
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @Test
    void incorrectTest(){
        EntityManager em = entityManagerFactory.createEntityManager();
        CreditCardEntity entity = new CreditCardEntity();
        entity.setExpYear("20");
        entity.setExpMonth("12");
        entity.setCardNumber("XXXXXXXXXX");
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.persist(entity);
        t.commit();
        Query q = em.createQuery("select b FROM BillingDetailSuperclass b");

        BillingDetailSuperclass s = (BillingDetailSuperclass) q.getSingleResult();

    }
    @Test
    void correctTest(){
        EntityManager em = entityManagerFactory.createEntityManager();
        CreditCardEntity entity = new CreditCardEntity();
        entity.setExpYear("20");
        entity.setExpMonth("12");
        entity.setCardNumber("XXXXXXXXXX");
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.persist(entity);
        t.commit();
        Query q = em.createQuery("select b FROM CreditCardEntity b WHERE b.id = "+entity.getId());
        CreditCardEntity s = (CreditCardEntity) q.getSingleResult();
    }


}

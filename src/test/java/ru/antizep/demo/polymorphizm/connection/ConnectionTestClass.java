package ru.antizep.demo.polymorphizm.connection;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.antizep.demo.polymorphizm.connection.BillingDetailsEntity;
import ru.antizep.demo.polymorphizm.join.BankAccount;
import ru.antizep.demo.polymorphizm.join.CreditCardEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

@SpringBootTest
public class ConnectionTestClass {
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @Test
    void test() {


        EntityManager em = entityManagerFactory.createEntityManager();
        CreditCardEntity entity = new CreditCardEntity();
        entity.setExpYear("20");
        entity.setExpMonth("12");
        entity.setCardNumber("XXXXXXXXXX");
        entity.setOwner("Owner");
        EntityTransaction t = em.getTransaction();

        BankAccount ba = new BankAccount();
        ba.setOwner("Other");
        ba.setAccount("account");
        ba.setBankName("SB");
        t.begin();
        em.persist(ba);
        em.persist(entity);
        t.commit();

    }
}

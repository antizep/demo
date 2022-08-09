package ru.antizep.demo.manytomany;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.Set;

@SpringBootTest
public class ManyToMany {
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;
    EntityManager em;
    @BeforeEach
    void before(){
        em  = entityManagerFactory.createEntityManager();
    }
    @Test
    void test(){

        DriverEntity driverEntity = new DriverEntity();
        driverEntity.setName("Alfred");

        DriverEntity driverEntity1 = new DriverEntity();
        driverEntity1.setName("Nikola");

        CarEntity carEntity = new CarEntity();
        carEntity.setModel("Lada");
        carEntity.setDrivers(Set.of(driverEntity1,driverEntity));

        CarEntity carEntity1 = new CarEntity();
        carEntity1.setModel("UAZ");
        carEntity1.setDrivers(Set.of(driverEntity));

        em.getTransaction().begin();

        em.persist(carEntity);
        em.persist(carEntity1);

        em.getTransaction().commit();
    }
}

package ru.antizep.demo.embeddable;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.antizep.demo.embeddable.entity.AddressEmbeddable;
import ru.antizep.demo.embeddable.entity.UserEntity;
import ru.antizep.demo.embeddable.repository.UserRepository;

@SpringBootTest
public class EmbeddableTest{
    @Autowired
    UserRepository repository;
    @Test
    void test(){
        UserEntity entity = new UserEntity();
        AddressEmbeddable addressHome = new AddressEmbeddable();
        addressHome.setCity("Kazan");
        addressHome.setZipcode("code");
        addressHome.setStreet("Lenina");
        entity.setHomeAddress(addressHome);
        AddressEmbeddable billingAddress = new AddressEmbeddable();
        billingAddress.setStreet("Puskina");
        billingAddress.setCity("Budennovsk");
        billingAddress.setZipcode("other code");
        entity.setBillingAddress(billingAddress);

        repository.save(entity);
    }
}

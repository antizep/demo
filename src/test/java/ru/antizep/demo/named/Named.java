package ru.antizep.demo.named;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.antizep.demo.named.entity.page1.NamedEntity;
import ru.antizep.demo.named.repository.NamedRepository;
import ru.antizep.demo.named.repository.OtherNameRepository;

@SpringBootTest
public class Named {
    @Autowired
    NamedRepository namedRepository;
    @Autowired
    OtherNameRepository otherNameRepository;

    @Test
    void testName(){
        NamedEntity entity = new NamedEntity();
        namedRepository.save(entity);
       Assertions.assertFalse( namedRepository.customAll().isEmpty());
    }
    @Test
    void testOtherName(){
        ru.antizep.demo.named.entity.page2.NamedEntity entity = new ru.antizep.demo.named.entity.page2.NamedEntity();
        otherNameRepository.save(entity);
        Assertions.assertFalse( otherNameRepository.customAll().isEmpty());
    }
}

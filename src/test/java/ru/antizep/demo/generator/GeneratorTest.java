package ru.antizep.demo.generator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.antizep.demo.sequence.entity.AutoGeneratorEntity;
import ru.antizep.demo.sequence.entity.IdentityGeneratorEntity;
import ru.antizep.demo.sequence.entity.TableGeneratorEntity;
import ru.antizep.demo.sequence.repository.AutoGeneratorRepository;
import ru.antizep.demo.sequence.repository.IdentityGeneratorRepository;
import ru.antizep.demo.sequence.repository.TableGeneratorRepository;

@SpringBootTest
public class GeneratorTest {
    @Autowired
    AutoGeneratorRepository autoGeneratorRepository;
    @Autowired
    IdentityGeneratorRepository identityGeneratorRepository;
    @Autowired
    TableGeneratorRepository tableGeneratorRepository;
    @Test
    void testAuto(){
        AutoGeneratorEntity entity = new AutoGeneratorEntity();
        autoGeneratorRepository.save(entity);
    }
    @Test
    void testIdentity(){
        IdentityGeneratorEntity entity = new IdentityGeneratorEntity();
        identityGeneratorRepository.save(entity);
    }
    @Test
    void testTable(){
        TableGeneratorEntity entity = new TableGeneratorEntity();
        tableGeneratorRepository.save(entity);
    }
}

package org.prince.repository;

import org.junit.jupiter.api.Test;
import org.prince.entity.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class MaterialRepositoryTest {

    @Autowired
    private MaterialRepository materialRepository;

    @Test
    void createMaterial(){

        materialRepository.save(
                Material
                        .builder()
                        .manufacturer("HP")
                        .serialNumber("909873FAB34")
                        .model("E15")
                        .build()
        );
    }

    @Test
    void getListOfMaterial(){
        List<Material> list = materialRepository.findAll();
        list.forEach(material->{
            System.out.println(material.toString());
        });
    }

}
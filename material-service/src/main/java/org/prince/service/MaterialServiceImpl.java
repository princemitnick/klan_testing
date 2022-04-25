package org.prince.service;

import org.prince.entity.Material;
import org.prince.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService{

    @Autowired
    private MaterialRepository materialRepository;

    @Override
    public Material createMaterial(Material material) {
        return materialRepository.save(material);
    }

    @Override
    public Material getOne(Integer materialId) {
        return null;
    }

    @Override
    public List<Material> getAllMaterials() {
        return materialRepository.findAll();
    }
}

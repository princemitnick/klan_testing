package org.prince.service;

import org.prince.entity.Material;

import java.util.List;

public interface MaterialService {

    Material createMaterial(Material material);

    Material getOne(Integer materialId);

    List<Material> getAllMaterials();

}

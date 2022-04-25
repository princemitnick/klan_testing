package org.prince.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Material {

    @Id
    @SequenceGenerator(
            name = "material_sequence",
            sequenceName = "material_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "material_sequence"
    )
    private Integer materialId;
    private String model;
    private String manufacturer;
    private String serialNumber;

}

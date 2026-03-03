package com.ecommerce.logistics.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private int capacity;

    @OneToMany(mappedBy = "warehouse",cascade=CascadeType.ALL)
    @JsonIgnore
    private List<Shipment>shipments;
}

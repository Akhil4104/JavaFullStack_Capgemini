package com.ecommerce.logistics.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrackingEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String eventType;

    private LocalDateTime timestamp;

    private String location;

    @ManyToOne
    @JoinColumn(name="shipment_id")
    private Shipment shipment;
}

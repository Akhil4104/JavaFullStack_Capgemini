package com.ecommerce.logistics.controller;

import com.ecommerce.logistics.dto.ShipmentDTO;
import com.ecommerce.logistics.entity.Shipment;
import com.ecommerce.logistics.service.ShipmentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shipments")
@RequiredArgsConstructor
public class ShipmentController {

    private final ShipmentService shipmentService;
    // POST: http://localhost:8080/api/shipments
    @PostMapping
    public ResponseEntity<Shipment> createShipment(
            @Valid @RequestBody ShipmentDTO dto) {

        Shipment createdShipment = shipmentService.createShipment(dto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdShipment);
    }
    //GET: http://localhost:8080/api/shipments/1
    @GetMapping("/{id}")
    public ResponseEntity<Shipment> getShipmentById(
            @PathVariable Long id) {

        Shipment shipment = shipmentService.getShipment(id);

        return ResponseEntity.ok(shipment);
    }
    // GET: http://localhost:8080/api/shipments?page=0&size=5
    @GetMapping
    public ResponseEntity<Page<Shipment>> getAllShipments(
            @PageableDefault(size = 5) Pageable pageable) {

        Page<Shipment> shipments = shipmentService.getAllShipments(pageable);

        return ResponseEntity.ok(shipments);
    }

    // PUT: http://localhost:8080/api/shipments/1
    @PutMapping("/{id}")
    public ResponseEntity<Shipment> updateShipment(
            @PathVariable Long id,
            @Valid @RequestBody ShipmentDTO dto) {

        Shipment updatedShipment = shipmentService.updateShipment(id, dto);

        return ResponseEntity.ok(updatedShipment);
    }
    // DELETE: http://localhost:8080/api/shipments/1
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteShipment(
            @PathVariable Long id) {

        shipmentService.deleteShipment(id);

        return ResponseEntity.ok("Shipment deleted successfully");
    }
    // GET: http://localhost:8080/api/shipments/filter?status=SHIPPED&warehouse=Delhi
    @GetMapping("/filter")
    public ResponseEntity<List<Shipment>> filterShipments(
            @RequestParam String status,
            @RequestParam String warehouse) {

        List<Shipment> shipments =
                shipmentService.filterByStatusAndWarehouse(status, warehouse);

        return ResponseEntity.ok(shipments);
    }
    // GET: http://localhost:8080/api/shipments/count-by-warehouse
    @GetMapping("/count-by-warehouse")
    public ResponseEntity<List<Object[]>> countShipmentsPerWarehouse() {

        return ResponseEntity.ok(
                shipmentService.countShipmentsPerWarehouse()
        );
    }
    // GET: http://localhost:8080/api/shipments/with-latest-event
    @GetMapping("/with-latest-event")
    public ResponseEntity<List<Shipment>> getShipmentsWithLatestEvent() {

        List<Shipment> shipments =
                shipmentService.getShipmentsWithLatestEvent();

        return ResponseEntity.ok(shipments);
    }
}
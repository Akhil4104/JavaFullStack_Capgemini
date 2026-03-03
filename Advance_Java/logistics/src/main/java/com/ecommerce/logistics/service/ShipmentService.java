package com.ecommerce.logistics.service;

import com.ecommerce.logistics.dto.ShipmentDTO;
import com.ecommerce.logistics.entity.Shipment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ShipmentService {
    Shipment createShipment(ShipmentDTO dto);
    Shipment getShipment(Long id);
    Page<Shipment> getAllShipments(Pageable pageable);
    Shipment updateShipment(Long id, ShipmentDTO dto);
    void deleteShipment(Long id);
    List<Shipment> filterByStatusAndWarehouse(String status, String warehouse);

    List<Object[]> countShipmentsPerWarehouse();

    List<Shipment> getShipmentsWithLatestEvent();
}
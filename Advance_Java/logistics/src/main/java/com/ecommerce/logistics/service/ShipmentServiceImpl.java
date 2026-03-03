package com.ecommerce.logistics.service;

import com.ecommerce.logistics.dto.ShipmentDTO;
import com.ecommerce.logistics.entity.Shipment;
import com.ecommerce.logistics.entity.Warehouse;
import com.ecommerce.logistics.exception.ResourceNotFoundException;
import com.ecommerce.logistics.repository.ShipmentRepository;
import com.ecommerce.logistics.repository.WarehouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository shipmentRepository;
    private final WarehouseRepository warehouseRepository;

    @Override
    @Transactional
    public Shipment createShipment(ShipmentDTO dto) {
        Optional<Warehouse> optionalWarehouse =
                warehouseRepository.findById(dto.getWarehouseId());
        if (optionalWarehouse.isPresent()) {
            Warehouse warehouse = optionalWarehouse.get();
            Shipment shipment = new Shipment();
            shipment.setTrackingNumber(dto.getTrackingNumber());
            shipment.setCustomerEmail(dto.getCustomerEmail());
            shipment.setStatus(dto.getStatus());
            shipment.setWarehouse(warehouse);

            return shipmentRepository.save(shipment);

        } else {
            throw new ResourceNotFoundException("Warehouse not found");
        }
    }

    @Override
    public Shipment getShipment(Long id) {
        return shipmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Shipment not found"));
    }

    @Override
    public Page<Shipment> getAllShipments(Pageable pageable) {
        return shipmentRepository.findAll(pageable);
    }

    @Override
    @Transactional
    public Shipment updateShipment(Long id, ShipmentDTO dto) {

        Shipment shipment = getShipment(id);

        shipment.setTrackingNumber(dto.getTrackingNumber());
        shipment.setCustomerEmail(dto.getCustomerEmail());
        shipment.setStatus(dto.getStatus());

        return shipmentRepository.save(shipment);
    }

    @Override
    public void deleteShipment(Long id) {
        Shipment shipment = getShipment(id);
        shipmentRepository.delete(shipment);
    }
    @Override
    public List<Shipment> filterByStatusAndWarehouse(String status, String warehouse) {
        return shipmentRepository.findByStatusAndWarehouse(status, warehouse);
    }

    @Override
    public List<Object[]> countShipmentsPerWarehouse() {
        return shipmentRepository.countShipmentsPerWarehouse();
    }

    @Override
    public List<Shipment> getShipmentsWithLatestEvent() {
        return shipmentRepository.findShipmentsWithLatestEvent();
    }
}
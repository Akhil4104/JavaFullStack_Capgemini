package com.ecommerce.logistics.repository;

import com.ecommerce.logistics.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShipmentRepository extends JpaRepository<Shipment,Long> {

    @Query(value = "SELECT * FROM shipment s JOIN warehouse w ON s.warehouse_id = w.id WHERE s.status = ?1 AND w.name LIKE CONCAT('%', ?2, '%')", nativeQuery = true)
    List<Shipment> findByStatusAndWarehouse(String status, String warehouseName);

    @Query(value = "SELECT w.name, COUNT(s.id) FROM shipment s JOIN warehouse w ON s.warehouse_id = w.id GROUP BY w.id, w.name", nativeQuery = true)
    List<Object[]> countShipmentsPerWarehouse();

    @Query("SELECT s FROM Shipment s JOIN FETCH s.trackingEvents te WHERE te.timestamp = (SELECT MAX(t.timestamp) FROM TrackingEvent t WHERE t.shipment.id = s.id)")
    List<Shipment> findShipmentsWithLatestEvent();

}

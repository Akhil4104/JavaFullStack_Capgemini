package com.ecommerce.logistics.repository;

import com.ecommerce.logistics.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
    Optional<Warehouse> findByName(String name);
    List<Warehouse> findByLocation(String location);
    boolean existsByName(String name);
}
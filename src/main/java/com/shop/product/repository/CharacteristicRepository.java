package com.shop.product.repository;

import com.shop.product.data.entity.Characteristic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CharacteristicRepository extends JpaRepository<Characteristic, UUID> {
}

package com.military.assetmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.military.assetmanagement.model.Purchase;

@Repository
public interface PurchaseRepository  extends JpaRepository<Purchase, Long>{

	List<Purchase> findByEquipmentNameAndBaseId(String name, Long baseId);

}

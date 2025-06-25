package com.military.assetmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.military.assetmanagement.model.Transfer;

@Repository
public interface TransferRepository extends JpaRepository<Transfer, Long> {
	List<Transfer> findByEquipmentNameAndToBaseId(String name, Long baseId);
	List<Transfer> findByEquipmentNameAndFromBaseId(String name, Long baseId);


}

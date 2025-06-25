package com.military.assetmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.military.assetmanagement.model.Assignment;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
	
	List<Assignment> findByEquipmentNameAndBaseId(String name, Long baseId);
	List<Assignment> findByEquipmentNameAndBaseIdAndExpendedTrue(String name, Long baseId);


}

package com.military.assetmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.military.assetmanagement.model.Asset;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long>{

}

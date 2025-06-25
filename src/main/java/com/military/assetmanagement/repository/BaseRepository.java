package com.military.assetmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.military.assetmanagement.model.Base;

public interface BaseRepository extends JpaRepository<Base,Long> {

}

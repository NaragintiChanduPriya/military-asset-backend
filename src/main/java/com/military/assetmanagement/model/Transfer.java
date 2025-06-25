package com.military.assetmanagement.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String equipmentName;
    private String equipmentType;
    private int quantity;
    private LocalDate transferDate;

    @ManyToOne
    @JoinColumn(name = "from_base_id")
    private Base fromBase;

    @ManyToOne
    @JoinColumn(name = "to_base_id")
    private Base toBase;

	public Transfer() {
		super();
	}

	public Transfer(Long id, String equipmentName, String equipmentType, int quantity, LocalDate transferDate,
			Base fromBase, Base toBase) {
		super();
		this.id = id;
		this.equipmentName = equipmentName;
		this.equipmentType = equipmentType;
		this.quantity = quantity;
		this.transferDate = transferDate;
		this.fromBase = fromBase;
		this.toBase = toBase;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDate getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(LocalDate transferDate) {
		this.transferDate = transferDate;
	}

	public Base getFromBase() {
		return fromBase;
	}

	public void setFromBase(Base fromBase) {
		this.fromBase = fromBase;
	}

	public Base getToBase() {
		return toBase;
	}

	public void setToBase(Base toBase) {
		this.toBase = toBase;
	}
	
}

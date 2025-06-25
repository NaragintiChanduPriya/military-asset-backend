package com.military.assetmanagement.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String personnelName;   // To whom the asset is assigned
    private String equipmentName;
    private String equipmentType;
    private int quantity;
    private LocalDate assignedDate;
    private boolean expended;       // true if asset was used/spent

    @ManyToOne
    @JoinColumn(name = "base_id")
    private Base base;

	public Assignment() {
		super();
	}

	public Assignment(Long id, String personnelName, String equipmentName, String equipmentType, int quantity,
			LocalDate assignedDate, boolean expended, Base base) {
		super();
		this.id = id;
		this.personnelName = personnelName;
		this.equipmentName = equipmentName;
		this.equipmentType = equipmentType;
		this.quantity = quantity;
		this.assignedDate = assignedDate;
		this.expended = expended;
		this.base = base;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPersonnelName() {
		return personnelName;
	}

	public void setPersonnelName(String personnelName) {
		this.personnelName = personnelName;
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

	public LocalDate getAssignedDate() {
		return assignedDate;
	}

	public void setAssignedDate(LocalDate assignedDate) {
		this.assignedDate = assignedDate;
	}

	public boolean isExpended() {
		return expended;
	}

	public void setExpended(boolean expended) {
		this.expended = expended;
	}

	public Base getBase() {
		return base;
	}

	public void setBase(Base base) {
		this.base = base;
	}
    
}


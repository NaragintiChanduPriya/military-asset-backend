package com.military.assetmanagement.DTO;


public class DashboardSummaryDTO {
    private String equipmentName;
    private String equipmentType;
    private String baseName;
    private int openingBalance;
    private int purchases;
    private int transfersIn;
    private int transfersOut;
    private int assigned;
    private int expended;
    private int closingBalance;
	public DashboardSummaryDTO() {
		super();
	}
	public DashboardSummaryDTO(String equipmentName, String equipmentType, String baseName, int openingBalance,
			int purchases, int transfersIn, int transfersOut, int assigned, int expended, int closingBalance) {
		super();
		this.equipmentName = equipmentName;
		this.equipmentType = equipmentType;
		this.baseName = baseName;
		this.openingBalance = openingBalance;
		this.purchases = purchases;
		this.transfersIn = transfersIn;
		this.transfersOut = transfersOut;
		this.assigned = assigned;
		this.expended = expended;
		this.closingBalance = closingBalance;
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
	public String getBaseName() {
		return baseName;
	}
	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}
	public int getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(int openingBalance) {
		this.openingBalance = openingBalance;
	}
	public int getPurchases() {
		return purchases;
	}
	public void setPurchases(int purchases) {
		this.purchases = purchases;
	}
	public int getTransfersIn() {
		return transfersIn;
	}
	public void setTransfersIn(int transfersIn) {
		this.transfersIn = transfersIn;
	}
	public int getTransfersOut() {
		return transfersOut;
	}
	public void setTransfersOut(int transfersOut) {
		this.transfersOut = transfersOut;
	}
	public int getAssigned() {
		return assigned;
	}
	public void setAssigned(int assigned) {
		this.assigned = assigned;
	}
	public int getExpended() {
		return expended;
	}
	public void setExpended(int expended) {
		this.expended = expended;
	}
	public int getClosingBalance() {
		return closingBalance;
	}
	public void setClosingBalance(int closingBalance) {
		this.closingBalance = closingBalance;
	}
    
}


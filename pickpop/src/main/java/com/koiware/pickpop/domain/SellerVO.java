package com.koiware.pickpop.domain;

public class SellerVO extends BaseVO{
	String idseller;
	String pwseller;
	String nameseller;
	int idaddress;
	
	public int getIdaddress() {
		return idaddress;
	}
	public void setIdaddress(int idaddress) {
		this.idaddress = idaddress;
	}
	public String getIdseller() {
		return idseller;
	}
	public void setIdseller(String idseller) {
		this.idseller = idseller;
	}
	public String getPwseller() {
		return pwseller;
	}
	public void setPwseller(String pwseller) {
		this.pwseller = pwseller;
	}
	public String getNameseller() {
		return nameseller;
	}
	public void setNameseller(String nameseller) {
		this.nameseller = nameseller;
	}
}

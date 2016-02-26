package com.koiware.pickpop.domain;

public class PopBoxVO {
	int idpopbox;
	int status;
	int user_id;
	int idfrendpopbox;
	String notepopbox;
	int countcomment;
	int countlike;
	
	public int getCountcomment() {
		return countcomment;
	}
	public void setCountcomment(int countcomment) {
		this.countcomment = countcomment;
	}
	public int getCountlike() {
		return countlike;
	}
	public void setCountlike(int countlike) {
		this.countlike = countlike;
	}
	public String getNotepopbox() {
		return notepopbox;
	}
	public void setNotepopbox(String notepopbox) {
		this.notepopbox = notepopbox;
	}
	public int getIdpopbox() {
		return idpopbox;
	}
	public void setIdpopbox(int idpopbox) {
		this.idpopbox = idpopbox;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getIdfrendpopbox() {
		return idfrendpopbox;
	}
	public void setIdfrendpopbox(int idfrendpopbox) {
		this.idfrendpopbox = idfrendpopbox;
	}
	
	
}

package com.koiware.pickpop.domain;

public class CommentVO {
	int idpopcomment;
	int idwriter;
	int idrecommandproduct;
	String comment;
	int idpopbox;
	int idproduct;
	
	public int getIdpopbox() {
		return idpopbox;
	}
	public void setIdpopbox(int idpopbox) {
		this.idpopbox = idpopbox;
	}
	public int getIdproduct() {
		return idproduct;
	}
	public void setIdproduct(int idproduct) {
		this.idproduct = idproduct;
	}
	public int getIdpopcomment() {
		return idpopcomment;
	}
	public void setIdpopcomment(int idpopcomment) {
		this.idpopcomment = idpopcomment;
	}
	public int getIdwriter() {
		return idwriter;
	}
	public void setIdwriter(int idwriter) {
		this.idwriter = idwriter;
	}
	public int getIdrecommandproduct() {
		return idrecommandproduct;
	}
	public void setIdrecommandproduct(int idrecommandproduct) {
		this.idrecommandproduct = idrecommandproduct;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}

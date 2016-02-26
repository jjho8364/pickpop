package com.koiware.pickpop.domain;

import java.lang.reflect.Field;

public class ProductVO extends BaseVO{
	int idproduct;
	String nameproduct;
	int priceproduct;
	int pointproduct;
	String noteproduct;
	int countstock;
	int countsell;
	int idcategorysml;
	int seller_id;
	String realsize;
	
	int color;
	int sex;
	int age;
	int idstyle;
	
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
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getIdstyle() {
		return idstyle;
	}
	public void setIdstyle(int idstyle) {
		this.idstyle = idstyle;
	}
	public int getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}
	public int getIdproduct() {
		return idproduct;
	}
	public void setIdproduct(int idproduct) {
		this.idproduct = idproduct;
	}
	public String getNameproduct() {
		return nameproduct;
	}
	public void setNameproduct(String nameproduct) {
		this.nameproduct = nameproduct;
	}
	public int getPriceproduct() {
		return priceproduct;
	}
	public void setPriceproduct(int priceproduct) {
		this.priceproduct = priceproduct;
	}
	public int getPointproduct() {
		return pointproduct;
	}
	public void setPointproduct(int pointproduct) {
		this.pointproduct = pointproduct;
	}
	public String getNoteproduct() {
		return noteproduct;
	}
	public void setNoteproduct(String noteproduct) {
		this.noteproduct = noteproduct;
	}
	public int getCountstock() {
		return countstock;
	}
	public void setCountstock(int countstock) {
		this.countstock = countstock;
	}
	public int getCountsell() {
		return countsell;
	}
	public void setCountsell(int countsell) {
		this.countsell = countsell;
	}
	public int getIdcategorysml() {
		return idcategorysml;
	}
	public void setIdcategorysml(int idcategorysml) {
		this.idcategorysml = idcategorysml;
	}
	public String getRealsize() {
		return realsize;
	}
	public void setRealsize(String realsize) {
		this.realsize = realsize;
	}
}

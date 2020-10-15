package com.example.demo.dto;

public class getSvByGv {
private String maSv;
private String hoTen;
private float diemTl;
private float diemCk;
private float diemTb;
private String maLop;

public getSvByGv() {
	
}

public String getMaSv() {
	return maSv;
}

public void setMaSv(String maSv) {
	this.maSv = maSv;
}

public String getHoTen() {
	return hoTen;
}

public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}


public float getDiemTl() {
	return diemTl;
}

public void setDiemTl(float diemTl) {
	this.diemTl = diemTl;
}

public float getDiemCk() {
	return diemCk;
}

public void setDiemCk(float diemCk) {
	this.diemCk = diemCk;
}

public float getDiemTb() {
	return diemTb;
}

public void setDiemTb() {
	this.diemTb = (float)(this.diemTl*0.4+this.diemCk*0.6);
}

public String getMaLop() {
	return maLop;
}

public void setMaLop(String maLop) {
	this.maLop = maLop;
}

public getSvByGv(String maSv, String hoTen, float diemTl, float diemCk, float diemTb, String maLop) {
	super();
	this.maSv = maSv;
	this.hoTen = hoTen;
	this.diemTl = diemTl;
	this.diemCk = diemCk;
	this.diemTb = diemTb;
	this.maLop = maLop;
}




}

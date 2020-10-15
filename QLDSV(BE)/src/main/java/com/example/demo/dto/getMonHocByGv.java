package com.example.demo.dto;

public class getMonHocByGv {
private String maMon;
private String tenMon;
private String maLop;
private String maKy;

public getMonHocByGv() {
	
}

public String getMaMon() {
	return maMon;
}

public void setMaMon(String maMon) {
	this.maMon = maMon;
}

public String getTenMon() {
	return tenMon;
}

public void setTenMon(String tenMon) {
	this.tenMon = tenMon;
}

public String getMaLop() {
	return maLop;
}

public void setMaLop(String maLop) {
	this.maLop = maLop;
}

public String getMaKy() {
	return maKy;
}

public void setMaKy(String maKy) {
	this.maKy = maKy;
}

public getMonHocByGv(String maMon, String tenMon, String maLop, String maKy) {
	super();
	this.maMon = maMon;
	this.tenMon = tenMon;
	this.maLop = maLop;
	this.maKy = maKy;
}


}

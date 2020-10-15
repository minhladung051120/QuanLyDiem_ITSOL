package com.example.demo.dto;

import java.util.Date;

public class MonHoc {
	private String maMon;
	private String tenMon;
	private String tenKy;
	private Date thoiGian;
	private Date thoiGianKt;
	
public MonHoc() {
	
}

	public MonHoc(String maMon, String tenMon, String tenKy, Date thoiGian, Date thoiGianKt) {
		super();
		this.maMon = maMon;
		this.tenMon = tenMon;
		this.tenKy = tenKy;
		this.thoiGian = thoiGian;
		this.thoiGianKt = thoiGianKt;
	}

	public Date getThoiGianKt() {
		return thoiGianKt;
	}

	public void setThoiGianKt(Date thoiGianKt) {
		this.thoiGianKt = thoiGianKt;
	}

	public String getTenMon() {
		return tenMon;
	}

	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}

	public String getTenKy() {
		return tenKy;
	}

	public void setTenKy(String tenKy) {
		this.tenKy = tenKy;
	}

	public Date getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
	}

	public String getMaMon() {
		return maMon;
	}

	public void setMaMon(String maMon) {
		this.maMon = maMon;
	}

}

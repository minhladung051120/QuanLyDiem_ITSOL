package com.example.demo.dto;

import java.util.Date;

public class KyHoc {
	private String maKy;
	private String tenKy;
	private Date thoiGian;
	private Date thoiGianKt;
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

	public KyHoc(String maKy, String tenKy, Date thoiGian, Date thoiGianKt) {
		super();
		this.maKy = maKy;
		this.tenKy = tenKy;
		this.thoiGian = thoiGian;
		this.thoiGianKt = thoiGianKt;
	}
	public KyHoc() {
		
	}
	
	public String getMaKy() {
		return maKy;
	}
	public void setMaKy(String maKy) {
		this.maKy = maKy;
	}
	public Date getThoiGianKt() {
		return thoiGianKt;
	}
	public void setThoiGianKt(Date thoiGianKt) {
		this.thoiGianKt = thoiGianKt;
	}

	
	
}

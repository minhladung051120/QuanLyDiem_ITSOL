package com.example.demo.dto;




public class LopHoc {
	private String tenKy;
	private String tenMon;
	private String maLop;
	private String tenLop;
	private String maGv;
	private String hoTen;
	

	public LopHoc(String tenKy, String tenMon, String maLop, String tenLop, String maGv, String hoTen) {
		super();
		this.tenKy = tenKy;
		this.tenMon = tenMon;
		this.maLop = maLop;
		this.tenLop = tenLop;
		this.maGv = maGv;
		this.hoTen = hoTen;
	}
	public String getMaLop() {
		return maLop;
	}
	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}
	public String getTenKy() {
		return tenKy;
	}
	public void setTenKy(String tenKy) {
		this.tenKy = tenKy;
	}
	public String getTenMon() {
		return tenMon;
	}
	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public String getMaGv() {
		return maGv;
	}
	public void setMaGv(String maGv) {
		this.maGv = maGv;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	
}

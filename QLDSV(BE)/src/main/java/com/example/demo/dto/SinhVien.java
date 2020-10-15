package com.example.demo.dto;

public class SinhVien {
	private String maSv;
	private String hoTen;
	private String khoa;
	private String email;
	private String sdt;
	private String diaChi;
	private String maLop;
	private String tenLop;
	
	public SinhVien(String maSv, String hoTen, String khoa, String email, String sdt, String diaChi, String maLop,
			String tenLop) {
		super();
		this.maSv = maSv;
		this.hoTen = hoTen;
		this.khoa = khoa;
		this.email = email;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.maLop = maLop;
		this.tenLop = tenLop;
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
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getMaLop() {
		return maLop;
	}
	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	
	public SinhVien() {
		
	}
}

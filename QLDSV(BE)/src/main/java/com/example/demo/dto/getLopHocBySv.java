package com.example.demo.dto;

public class getLopHocBySv {
	private String maMon;
	private String tenMon;
	private String maLop;
	private String maKy;
	private float diemTb;
	private String trangThai;
	
	public getLopHocBySv() {
		
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

	public float getDiemTb() {
		return diemTb;
	}

	public void setDiemTb(float diemTl,float diemCk) {
		this.diemTb = (float)(diemTl*0.4+diemCk*0.6);
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai() {
		if(this.diemTb>5) {
			this.trangThai="Đã qua";
		}else {
			this.trangThai="Chưa qua";
		}
	}

	public void setDiemTb(float diemTb) {
		this.diemTb = diemTb;
	}

	public getLopHocBySv(String maMon, String tenMon, String maLop, String maKy, float diemTb) {
		super();
		this.maMon = maMon;
		this.tenMon = tenMon;
		this.maLop = maLop;
		this.maKy = maKy;
		this.diemTb = diemTb;
	}

	
	
}

package com.example.demo.dto;

public class BangDiem {
	private String tenKy;
	private String tenMon;
	private String tenLop;
	private String maSv;
	private String hoTen;
	private float diemTl;
	private float diemCk;
	private float diemTb;
	private String xepLoai;

	
	public BangDiem(String tenKy, String tenMon, String tenLop, String maSv, String hoTen, float diemTl, float diemCk) {
		super();
		this.tenKy = tenKy;
		this.tenMon = tenMon;
		this.tenLop = tenLop;
		this.maSv = maSv;
		this.hoTen = hoTen;
		this.diemTl = diemTl;
		this.diemCk = diemCk;
	}

	
	public float getDiemTb() {
		diemTb=(float)Math.round((diemTl*0.6+diemCk*0.4)*10)/10;
		return diemTb;
	}


	public void setDiemTb(float diemTb) {
		this.diemTb = diemTb;
	}


	public String getXepLoai() {
		if(diemTb>8) {
			xepLoai="Giỏi";
		}else if(diemTb>6.5) {
			xepLoai="Khá";
		}else {
			xepLoai="Trung bình";
		}
		return xepLoai;
	}


	public void setXepLoai(String xepLoai) {
		this.xepLoai = xepLoai;
	}


	public String getTenKy() {
		return tenKy;
	}

	public void setTenKy(String tenKy) {
		this.tenKy = tenKy;
	}

	public String getMaSv() {
		return maSv;
	}

	public void setMaSv(String maSv) {
		this.maSv = maSv;
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
	
}

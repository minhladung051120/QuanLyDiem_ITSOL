package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class bangdiem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int maBd;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "maLop", insertable = false, updatable = false)
	private lophoc lophoc;
	@Column(name = "maLop")
	private String maLop;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "maSv", insertable = false, updatable = false)
	private sinhvien sinhvien;
	@Column(name = "maSv")
	private String maSv;
	@Column(nullable = true)
	private float diemTl;
	@Column(nullable = true)
	private float diemCk;

	public bangdiem() {

	}

	public bangdiem(com.example.demo.model.lophoc lophoc, String maLop, com.example.demo.model.sinhvien sinhvien,
			String maSv, float diemTl, float diemCk) {
		super();
		this.lophoc = lophoc;
		this.maLop = maLop;
		this.sinhvien = sinhvien;
		this.maSv = maSv;
		this.diemTl = diemTl;
		this.diemCk = diemCk;
	}

	public bangdiem(String maLop, String maSv) {
		super();
		this.maLop = maLop;
		this.maSv = maSv;
	}

	public String getMaLop() {
		return maLop;
	}

	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}

	public String getMaSv() {
		return maSv;
	}

	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}

	public int getMaBd() {
		return maBd;
	}

	public void setMaBd(int maBd) {
		this.maBd = maBd;
	}

	public lophoc getLophoc() {
		return lophoc;
	}

	public void setLophoc(lophoc lophoc) {
		this.lophoc = lophoc;
	}

	public sinhvien getSinhvien() {
		return sinhvien;
	}

	public void setSinhvien(sinhvien sinhvien) {
		this.sinhvien = sinhvien;
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

package com.example.demo.model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class lophoc {
	@Id
	@Column(length = 20)
	private String maLop;
	private String tenLop;
	@OneToMany(targetEntity = bangdiem.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "maLop", referencedColumnName = "maLop")
	private List<bangdiem> bangdiem;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "maGv", insertable = false, updatable = false)
	private giangvien giangvien;
	@Column(name = "maGv")
	private String maGv;
	@Column(name = "maMon")
	private String maMon;

	
	public String getMaGv() {
		return maGv;
	}

	public void setMaGv(String maGv) {
		this.maGv = maGv;
	}

	public giangvien getGiangvien() {
		return giangvien;
	}

	public void setGiangvien(giangvien giangvien) {
		this.giangvien = giangvien;
	}

	public String getMaMon() {
		return maMon;
	}

	public void setMaMon(String maMon) {
		this.maMon = maMon;
	}



	public List<bangdiem> getBangdiem() {
		return bangdiem;
	}

	public void setBangdiem(List<bangdiem> bangdiem) {
		this.bangdiem = bangdiem;
	}

	public lophoc() {

	}



	public lophoc(String maLop, String tenLop, String maMon) {
		super();
		this.maLop = maLop;
		this.tenLop = tenLop;
		this.maMon = maMon;
	}
	
	public lophoc(String maLop, String tenLop, List<com.example.demo.model.bangdiem> bangdiem,
			com.example.demo.model.giangvien giangvien, String maGv, String maMon) {
		super();
		this.maLop = maLop;
		this.tenLop = tenLop;
		this.bangdiem = bangdiem;
		this.giangvien = giangvien;
		this.maGv = maGv;
		this.maMon = maMon;
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
}

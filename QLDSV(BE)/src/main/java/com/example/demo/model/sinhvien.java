package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class sinhvien {
	@Id
	@Column(length = 20)
	private String maSv;

	private String khoa;
	@OneToMany(targetEntity = bangdiem.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "maSv", referencedColumnName = "maSv")
	private List<bangdiem> bangdiem;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "maTk")
	private taikhoan taikhoan;
	
	public List<bangdiem> getBangdiem() {
		return bangdiem;
	}

	public void setBangdiem(List<bangdiem> bangdiem) {
		this.bangdiem = bangdiem;
	}

	public taikhoan getTaikhoan() {
		return taikhoan;
	}

	public void setTaikhoan(taikhoan taikhoan) {
		this.taikhoan = taikhoan;
	}

	public sinhvien() {

	}

	

	public sinhvien(String maSv, String khoa, List<com.example.demo.model.bangdiem> bangdiem,
			com.example.demo.model.taikhoan taikhoan) {
		super();
		this.maSv = maSv;
		this.khoa = khoa;
		this.bangdiem = bangdiem;
		this.taikhoan = taikhoan;
	}

	public String getMaSv() {
		return maSv;
	}

	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

}

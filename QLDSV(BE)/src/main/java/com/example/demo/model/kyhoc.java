package com.example.demo.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class kyhoc {

	@Id
	@Column(length = 20)
	private String maKy;
	private String tenKy;

	private Date thoiGian;
	private Date thoiGianKt;
	@OneToMany(targetEntity = monhoc.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "maKy", referencedColumnName = "maKy")
	private List<monhoc> monhocs;

	public kyhoc() {

	}

	public kyhoc(String maKy, String tenKy, Date thoiGian, Date thoiGianKt, List<monhoc> monhocs) {
		super();
		this.maKy = maKy;
		this.tenKy = tenKy;
		this.thoiGian = thoiGian;
		this.thoiGianKt = thoiGianKt;
		this.monhocs = monhocs;
	}



	public Date getThoiGianKt() {
		return thoiGianKt;
	}



	public void setThoiGianKt(Date thoiGianKt) {
		this.thoiGianKt = thoiGianKt;
	}



	public String getMaKy() {
		return maKy;
	}

	public void setMaKy(String maKy) {
		this.maKy = maKy;
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

	public List<monhoc> getMonhocs() {
		return monhocs;
	}

	public void setMonhocs(List<monhoc> monhocs) {
		this.monhocs = monhocs;
	}

	
}

package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class monhoc {

	@Id
	@Column(length = 20)
	private String maMon;
	private String tenMon;
	@OneToMany(targetEntity = lophoc.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "maMon", referencedColumnName = "maMon")
	private List<lophoc> lophocs;
	@Column(name = "maKy")
	private String maKy;



	public String getMaKy() {
		return maKy;
	}

	public void setMaKy(String maKy) {
		this.maKy = maKy;
	}

	public monhoc() {

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

	public List<lophoc> getLophocs() {
		return lophocs;
	}

	public void setLophocs(List<lophoc> lophocs) {
		this.lophocs = lophocs;
	}

	public monhoc(String maMon, String tenMon, List<lophoc> lophocs, String maKy) {
		super();
		this.maMon = maMon;
		this.tenMon = tenMon;
		this.lophocs = lophocs;
		this.maKy = maKy;
	}


	

}

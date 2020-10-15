package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class monhoc {

	@Id
	@Column(length = 20)
	private String maMon;
	private String tenMon;
	
	@OneToMany(mappedBy = "maMonHoc",fetch = FetchType.LAZY)
	private List<lophoc> lophocs;
	
	@ManyToOne
	@JoinColumn(name = "maKy")
	private  kyhoc maKy;

	public monhoc(String maMon, String tenMon, kyhoc maKy) {
		super();
		this.maMon = maMon;
		this.tenMon = tenMon;
		this.maKy = maKy;
	}

	public monhoc() {
		super();
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

	public kyhoc getMaKy() {
		return maKy;
	}

	public void setMaKy(kyhoc maKy) {
		this.maKy = maKy;
	}

	public void setLophocs(List<lophoc> lophocs) {
		this.lophocs = lophocs;
	}



	

}

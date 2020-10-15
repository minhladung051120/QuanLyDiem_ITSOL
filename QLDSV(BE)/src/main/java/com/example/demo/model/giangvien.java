package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class giangvien {
	@Id
	@Column(length = 20)
	private String maGv;
	
	@OneToMany(mappedBy = "giangvien",fetch = FetchType.LAZY)
	private List<lophoc> lophocs;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "maTk")
	private taikhoan taikhoan;

	public taikhoan getTaikhoan() {
		return taikhoan;
	}

	public void setTaikhoan(taikhoan taikhoan) {
		this.taikhoan = taikhoan;
	}

	public giangvien() {

	}

	public giangvien(String maGv) {
		super();
		this.maGv = maGv;
	}

	public String getMaGv() {
		return maGv;
	}

	public void setMaGv(String maGv) {
		this.maGv = maGv;
	}

//	public List<lophoc> getLophocs() {
//		return lophocs;
//	}

	public void setLophocs(List<lophoc> lophocs) {
		this.lophocs = lophocs;
	}

	public giangvien(String maGv, List<lophoc> lophocs) {
		super();
		this.maGv = maGv;
		this.lophocs = lophocs;
	}

}

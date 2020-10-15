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
	
	@ManyToOne
	@JoinColumn(name = "maGv")
	private giangvien giangvien;
	
	@ManyToOne
	@JoinColumn(name = "maMon")
	private monhoc maMonHoc;
	
	@Column(name = "isAlive")
	private boolean isAlive;
	


	public lophoc() {
		super();
	}



	public lophoc(String maLop, String tenLop, List<com.example.demo.model.bangdiem> bangdiem,
			com.example.demo.model.giangvien giangvien, monhoc maMonHoc, boolean isAlive) {
		super();
		this.maLop = maLop;
		this.tenLop = tenLop;
		this.bangdiem = bangdiem;
		this.giangvien = giangvien;
		this.maMonHoc = maMonHoc;
		this.isAlive = isAlive;
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



//	public List<bangdiem> getBangdiem() {
//		return bangdiem;
//	}



	public void setBangdiem(List<bangdiem> bangdiem) {
		this.bangdiem = bangdiem;
	}



	public giangvien getGiangvien() {
		return giangvien;
	}



	public void setGiangvien(giangvien giangvien) {
		this.giangvien = giangvien;
	}







	public monhoc getMaMonHoc() {
		return maMonHoc;
	}



	public void setMaMonHoc(monhoc maMonHoc) {
		this.maMonHoc = maMonHoc;
	}



	public boolean isAlive() {
		return isAlive;
	}



	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	
}

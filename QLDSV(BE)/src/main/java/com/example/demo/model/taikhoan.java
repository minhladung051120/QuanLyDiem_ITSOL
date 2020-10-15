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
public class taikhoan {
	@Id
	@Column(length = 20)
	private String maTk;
	private String tenTk;

	private String matKhau;

	private String hoTen;

	private String email;

	private String sdt;

	private String diaChi;

	private String chucVu;
	@OneToMany(targetEntity = giangvien.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "maTk", referencedColumnName = "maTk")
	private List<giangvien> giangviens;

	@OneToOne(targetEntity = sinhvien.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "maTk", referencedColumnName = "maTk")
	private List<sinhvien> sinhviens;
	
	public taikhoan() {

	}

	public taikhoan(String maTk, String tenTk, String matKhau, String hoTen, String email, String sdt, String diaChi,
			String chucVu, List<giangvien> giangviens, List<sinhvien> sinhviens) {
		super();
		this.maTk = maTk;
		this.tenTk = tenTk;
		this.matKhau = matKhau;
		this.hoTen = hoTen;
		this.email = email;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.chucVu = chucVu;
		this.giangviens = giangviens;
		this.sinhviens = sinhviens;
	}

	public String getMaTk() {
		return maTk;
	}

	public void setMaTk(String maTk) {
		this.maTk = maTk;
	}

	public String getTenTk() {
		return tenTk;
	}

	public void setTenTk(String tenTk) {
		this.tenTk = tenTk;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public List<giangvien> getGiangviens() {
		return giangviens;
	}

	public void setGiangviens(List<giangvien> giangviens) {
		this.giangviens = giangviens;
	}

	public List<sinhvien> getSinhviens() {
		return sinhviens;
	}

	public void setSinhviens(List<sinhvien> sinhviens) {
		this.sinhviens = sinhviens;
	}

	

}
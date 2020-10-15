package com.example.demo.dto;

public class TaiKhoanDb {
	private String maTk;

	private String matKhau;

	private String hoTen;

	private String email;

	private String sdt;

	private String diaChi;

	private String chucVu;
	private String maTkDb;
	private String khoa;

	public String getMaTk() {
		return maTk;
	}

	public void setMaTk(String maTk) {
		this.maTk = maTk;
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

	public String getMaTkDb() {
		return maTkDb;
	}

	public void setMaTkDb(String maTkDb) {
		this.maTkDb = maTkDb;
	}

	public TaiKhoanDb(String maTk, String matKhau, String hoTen, String email, String sdt, String diaChi, String chucVu,
			String maTkDb) {
		super();
		this.maTk = maTk;
		this.matKhau = matKhau;
		this.hoTen = hoTen;
		this.email = email;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.chucVu = chucVu;
		this.maTkDb = maTkDb;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public TaiKhoanDb() {

	}
}

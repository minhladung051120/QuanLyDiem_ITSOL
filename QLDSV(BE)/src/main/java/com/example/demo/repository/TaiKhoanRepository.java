package com.example.demo.repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.KyHoc;
import com.example.demo.dto.TaiKhoan;
import com.example.demo.dto.TaiKhoanDb;
import com.example.demo.model.taikhoan;

@Repository
public class TaiKhoanRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<TaiKhoan> getTaiKhoan() {
		String sql = "select ho_ten,ma_tk,chuc_vu,email,dia_chi,sdt from taikhoan";
		return jdbcTemplate.query(sql, new RowMapper<TaiKhoan>() {
			public TaiKhoan mapRow(ResultSet rs, int rownumber) throws SQLException {
				TaiKhoan tk = new TaiKhoan();
				tk.setHoTen(rs.getString(1));
				tk.setMaTk(rs.getString(2));
				tk.setChucVu(rs.getString(3));
				tk.setEmail(rs.getString(4));
				tk.setDiaChi(rs.getString(5));
				tk.setSdt(rs.getString(6));
				return tk;
			}
		});
	}

	public List<TaiKhoan> getTaiKhoanSv() {
		String sql = "select ho_ten,ma_tk,chuc_vu,email,dia_chi,sdt from taikhoan where chuc_vu like 'SV'";
		return jdbcTemplate.query(sql, new RowMapper<TaiKhoan>() {
			public TaiKhoan mapRow(ResultSet rs, int rownumber) throws SQLException {
				TaiKhoan tk = new TaiKhoan();
				tk.setHoTen(rs.getString(1));
				tk.setMaTk(rs.getString(2));
				tk.setChucVu(rs.getString(3));
				tk.setEmail(rs.getString(4));
				tk.setDiaChi(rs.getString(5));
				tk.setSdt(rs.getString(6));
				return tk;
			}
		});
	}

	public List<TaiKhoan> getTaiKhoanGv() {
		String sql = "select ho_ten,ma_tk,chuc_vu,email,dia_chi,sdt from taikhoan where chuc_vu like 'GV'";
		return jdbcTemplate.query(sql, new RowMapper<TaiKhoan>() {
			public TaiKhoan mapRow(ResultSet rs, int rownumber) throws SQLException {
				TaiKhoan tk = new TaiKhoan();
				tk.setHoTen(rs.getString(1));
				tk.setMaTk(rs.getString(2));
				tk.setChucVu(rs.getString(3));
				tk.setEmail(rs.getString(4));
				tk.setDiaChi(rs.getString(5));
				tk.setSdt(rs.getString(6));
				return tk;
			}
		});
	}

	public List<TaiKhoan> getTaiKhoanDt() {
		String sql = "select ho_ten,ma_tk,chuc_vu,email,dia_chi,sdt from taikhoan where chuc_vu like 'DT'";
		return jdbcTemplate.query(sql, new RowMapper<TaiKhoan>() {
			public TaiKhoan mapRow(ResultSet rs, int rownumber) throws SQLException {
				TaiKhoan tk = new TaiKhoan();
				tk.setHoTen(rs.getString(1));
				tk.setMaTk(rs.getString(2));
				tk.setChucVu(rs.getString(3));
				tk.setEmail(rs.getString(4));
				tk.setDiaChi(rs.getString(5));
				tk.setSdt(rs.getString(6));
				return tk;
			}
		});
	}

	public TaiKhoanDb getTaiKhoanId(String maTk) {
		String sql = "select ma_tk,mat_khau,ho_ten,email,sdt,dia_chi,chuc_vu from taikhoan where ma_tk = '" + maTk + "'";
		return jdbcTemplate.queryForObject(sql, new RowMapper<TaiKhoanDb>() {
			public TaiKhoanDb mapRow(ResultSet rs, int rownumber) throws SQLException {
				TaiKhoanDb tk = new TaiKhoanDb();
				tk.setMaTk(rs.getString(1));
				tk.setMatKhau(rs.getString(2));
				tk.setHoTen(rs.getString(3));
				tk.setEmail(rs.getString(4));
				tk.setSdt(rs.getString(5));
				tk.setDiaChi(rs.getString(6));
				tk.setChucVu(rs.getString(7));
				return tk;
			}
		});
	}
	
	public TaiKhoanDb getTaiKhoanGvId(String maTk) {
		String sql = "select t.ma_tk,mat_khau,ho_ten,email,sdt,dia_chi,chuc_vu,ma_gv from taikhoan as t  join giangvien as g on t.ma_tk=g.ma_tk where t.ma_tk = '"+maTk+"'";
		return jdbcTemplate.queryForObject(sql, new RowMapper<TaiKhoanDb>() {
			public TaiKhoanDb mapRow(ResultSet rs, int rownumber) throws SQLException {
				TaiKhoanDb tk = new TaiKhoanDb();
				tk.setMaTk(rs.getString(1));
				tk.setMatKhau(rs.getString(2));
				tk.setHoTen(rs.getString(3));
				tk.setEmail(rs.getString(4));
				tk.setSdt(rs.getString(5));
				tk.setDiaChi(rs.getString(6));
				tk.setChucVu(rs.getString(7));
				tk.setMaTkDb(rs.getString(8));
				return tk;
			}
		});
	}
	
	public TaiKhoanDb getTaiKhoanSvId(String maTk) {
		String sql = "select t.ma_tk,mat_khau,ho_ten,email,sdt,dia_chi,chuc_vu,ma_sv,khoa from taikhoan as t  join sinhvien as s on t.ma_tk=s.ma_tk where t.ma_tk = '"+maTk+"'";
		return jdbcTemplate.queryForObject(sql, new RowMapper<TaiKhoanDb>() {
			public TaiKhoanDb mapRow(ResultSet rs, int rownumber) throws SQLException {
				TaiKhoanDb tk = new TaiKhoanDb();
				tk.setMaTk(rs.getString(1));
				tk.setMatKhau(rs.getString(2));
				tk.setHoTen(rs.getString(3));
				tk.setEmail(rs.getString(4));
				tk.setSdt(rs.getString(5));
				tk.setDiaChi(rs.getString(6));
				tk.setChucVu(rs.getString(7));
				tk.setMaTkDb(rs.getString(8));
				tk.setKhoa(rs.getString(9));
				return tk;
			}
		});
	}

	public void createTaiKhoanDt(taikhoan taikhoan) {
		String insertQuery = "insert into taikhoan (ma_tk,mat_khau,ho_ten,email,sdt,dia_chi,chuc_vu) values (?,?,?,?,?,?,?)";
		jdbcTemplate.update(insertQuery, taikhoan.getMaTk(), taikhoan.getMatKhau(), taikhoan.getHoTen(),
				taikhoan.getEmail(), taikhoan.getSdt(), taikhoan.getDiaChi(), taikhoan.getChucVu());
	}

	public void createTaiKhoanDb(TaiKhoanDb TaiKhoanDb) {
		if (TaiKhoanDb.getChucVu().equals("GV")) {
			String insertQuery = "insert into taikhoan (ma_tk,mat_khau,ho_ten,email,sdt,dia_chi,chuc_vu) values (?,?,?,?,?,?,?)";
			jdbcTemplate.update(insertQuery, TaiKhoanDb.getMaTk(), TaiKhoanDb.getMatKhau(), TaiKhoanDb.getHoTen(),
					TaiKhoanDb.getEmail(), TaiKhoanDb.getSdt(), TaiKhoanDb.getDiaChi(), TaiKhoanDb.getChucVu());
			String insertQuery2 = "insert into giangvien (ma_gv,ma_tk) values (?,?)";
			jdbcTemplate.update(insertQuery2, TaiKhoanDb.getMaTkDb(), TaiKhoanDb.getMaTk());
		} else if (TaiKhoanDb.getChucVu().equals("SV")) {
			String insertQuery = "insert into taikhoan (ma_tk,mat_khau,ho_ten,email,sdt,dia_chi,chuc_vu) values (?,?,?,?,?,?,?)";
			jdbcTemplate.update(insertQuery, TaiKhoanDb.getMaTk(), TaiKhoanDb.getMatKhau(), TaiKhoanDb.getHoTen(),
					TaiKhoanDb.getEmail(), TaiKhoanDb.getSdt(), TaiKhoanDb.getDiaChi(), TaiKhoanDb.getChucVu());
			String insertQuery2 = "insert into sinhvien (ma_sv,khoa,ma_tk) values (?,?,?)";
			jdbcTemplate.update(insertQuery2, TaiKhoanDb.getMaTkDb(), TaiKhoanDb.getKhoa(), TaiKhoanDb.getMaTk());
		}
	}

	public void updateTaiKhoan(TaiKhoanDb TaiKhoanDb) {
		String updateQuery = "update taikhoan set mat_khau=?,ho_ten=?,email=?,sdt=?,dia_chi=?,chuc_vu=? where ma_tk=?";
		jdbcTemplate.update(updateQuery, TaiKhoanDb.getMatKhau(), TaiKhoanDb.getHoTen(), TaiKhoanDb.getEmail(),
				TaiKhoanDb.getSdt(), TaiKhoanDb.getDiaChi(), TaiKhoanDb.getChucVu(), TaiKhoanDb.getMaTk());
	}
	
	public void updateTaiKhoanDb(TaiKhoanDb TaiKhoanDb) {
		String updateQuery = "update taikhoan set mat_khau=?,ho_ten=?,email=?,sdt=?,dia_chi=?,chuc_vu=? where ma_tk=?";
		jdbcTemplate.update(updateQuery, TaiKhoanDb.getMatKhau(), TaiKhoanDb.getHoTen(), TaiKhoanDb.getEmail(),
				TaiKhoanDb.getSdt(), TaiKhoanDb.getDiaChi(), TaiKhoanDb.getChucVu(), TaiKhoanDb.getMaTk());
		String updateQuery2 = "update sinhvien set khoa=? where ma_sv=?";
		jdbcTemplate.update(updateQuery2, TaiKhoanDb.getKhoa(),TaiKhoanDb.getMaTkDb());
	}
	
	public void deleteTaiKhoanDt(String maTk) {
		String sql2 = "delete from giangvien where ma_tk='" + maTk + "'";
		jdbcTemplate.execute(sql2);
		String sql3 = "delete from sinhvien where ma_tk='" + maTk + "'";
		jdbcTemplate.execute(sql3);
		String sql = "delete from taikhoan where ma_tk='" + maTk + "'";
		jdbcTemplate.execute(sql);
		
		
	}
}

package com.example.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.MonHoc;
import com.example.demo.model.monhoc;
@Repository
public class MonHocRepository{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<MonHoc> getMonHoc() {
		String sql = "select m.ma_mon, m.ten_mon, k.ten_ky,k.thoi_gian,k.thoi_gian_kt from kyhoc as k inner join monhoc as m on k.ma_ky = m.ma_ky";
		return jdbcTemplate.query(sql, new RowMapper<MonHoc>() {
			public MonHoc mapRow(ResultSet rs, int rownumber) throws SQLException {
				MonHoc mh = new MonHoc();
				mh.setMaMon(rs.getString(1));
				mh.setTenMon(rs.getString(2));
				mh.setTenKy(rs.getString(3));
				mh.setThoiGian(rs.getDate(4));
				mh.setThoiGianKt(rs.getDate(5));
				return mh;
			}
		});
	}
	
	public monhoc getMonHocId(String maMon) {
		String sql = "select ma_mon,ten_mon,ma_ky from monhoc where ma_mon ='" + maMon + "'";
		return jdbcTemplate.queryForObject(sql, new RowMapper<monhoc>() {
			public monhoc mapRow(ResultSet rs, int rownumber) throws SQLException {
				monhoc mh = new monhoc();
				mh.setMaMon(rs.getString(1));
				mh.setTenMon(rs.getString(2));
				mh.setMaKy(rs.getString(3));
				return mh;
			}
		});
	}
	
	public List<MonHoc> searchMonHoc(String maMon) {
		String sql = "select m.ma_mon, m.ten_mon, k.ten_ky,k.thoi_gian,k.thoi_gian_kt from kyhoc as k inner join monhoc as m on k.ma_ky = m.ma_ky where ma_mon like '%"+maMon+"%';";
		System.out.println(sql);
		return jdbcTemplate.query(sql, new RowMapper<MonHoc>() {
			public MonHoc mapRow(ResultSet rs, int rownumber) throws SQLException {
				MonHoc mh = new MonHoc();
				mh.setMaMon(rs.getString(1));
				mh.setTenMon(rs.getString(2));
				mh.setTenKy(rs.getString(3));
				mh.setThoiGian(rs.getDate(4));
				mh.setThoiGianKt(rs.getDate(5));
				return mh;
			}
		});
	}

	public void createMonHoc(String maMon, String tenMon, String maKy) {
		String insertQuery = "insert into monhoc (ma_mon,ten_mon,ma_ky) values (?,?,?)";
		jdbcTemplate.update(insertQuery, maMon, tenMon, maKy);
	}

	public void updateMonHoc(String maMon, String tenMon, String maKy) {
		String updateQuery = "update monhoc set ten_mon=?,ma_ky=? where ma_mon=?";
		jdbcTemplate.update(updateQuery, tenMon, maKy, maMon);
	}

	public void deleteMonHoc(String maMon) {
		String sql = "delete from monhoc where ma_mon='" + maMon + "'";
		jdbcTemplate.execute(sql);
	}
}

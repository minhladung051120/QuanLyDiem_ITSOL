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

@Repository
public class KyHocRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<KyHoc> getKyHoc() {
		String sql = "select ma_ky,ten_ky,thoi_gian,thoi_gian_kt from kyhoc";
		return jdbcTemplate.query(sql, new RowMapper<KyHoc>() {
			public KyHoc mapRow(ResultSet rs, int rownumber) throws SQLException {
				KyHoc kh = new KyHoc();
				kh.setMaKy(rs.getString(1));
				kh.setTenKy(rs.getString(2));
				kh.setThoiGian(rs.getDate(3));
				kh.setThoiGianKt(rs.getDate(4));

				return kh;
			}
		});
	}

	public KyHoc getKyHocId(String maKy) {
		String sql = "select ma_ky,ten_ky,thoi_gian,thoi_gian_kt from kyhoc where ma_ky ='" + maKy + "'";
		return jdbcTemplate.queryForObject(sql, new RowMapper<KyHoc>() {
			public KyHoc mapRow(ResultSet rs, int rownumber) throws SQLException {
				KyHoc kh = new KyHoc();
				kh.setMaKy(rs.getString(1));
				kh.setTenKy(rs.getString(2));
				kh.setThoiGian(rs.getDate(3));
				kh.setThoiGianKt(rs.getDate(4));

				return kh;
			}
		});
	}
	
	public List<KyHoc> searchKyHoc(String tenKy) {
		String sql = "select ma_ky,ten_ky,thoi_gian,thoi_gian_kt from kyhoc where ten_ky like '%" + tenKy + "%'";
		System.out.println(sql);
		return jdbcTemplate.query(sql, new RowMapper<KyHoc>() {
			public KyHoc mapRow(ResultSet rs, int rownumber) throws SQLException {
				KyHoc kh = new KyHoc();
				kh.setMaKy(rs.getString(1));
				kh.setTenKy(rs.getString(2));
				kh.setThoiGian(rs.getDate(3));
				kh.setThoiGianKt(rs.getDate(4));

				return kh;
			}
		});
	}

	public void createKyHoc(String maKy, String tenKy, Date thoiGian, Date thoiGianKt) {
		String insertQuery = "insert into kyhoc (ma_ky,ten_ky,thoi_gian,thoi_gian_kt) values (?,?,?,?)";
		jdbcTemplate.update(insertQuery, maKy, tenKy, thoiGian, thoiGianKt);
	}

	public void updateKyHoc(String maKy, String tenKy, Date thoiGian, Date thoiGianKt) {
		String updateQuery = "update kyhoc set ten_ky=?,thoi_gian=?,thoi_gian_kt=? where ma_ky=?";
		jdbcTemplate.update(updateQuery, tenKy, thoiGian, thoiGianKt, maKy);
	}

	public void deleteKyHoc(String maKy) {
		String sql = "delete from kyhoc where ma_ky='" + maKy + "'";
		jdbcTemplate.execute(sql);
	}
}

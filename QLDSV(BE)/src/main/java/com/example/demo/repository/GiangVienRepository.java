package com.example.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.getSvByGv;
import com.example.demo.dto.getMonHocByGv;

@Repository
public class GiangVienRepository{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<getMonHocByGv> getMonHocByGv() {
		String sql = "select m.ma_mon,m.ten_mon,l.ma_lop,k.ma_ky from kyhoc as k inner join monhoc as m on k.ma_ky = m.ma_ky inner join lophoc as l on m.ma_mon=l.ma_mon inner join giangvien as g on l.ma_gv=g.ma_gv where g.ma_gv = 'GV001' order by m.ma_ky desc;";
		return jdbcTemplate.query(sql, new RowMapper<getMonHocByGv>() {
			public getMonHocByGv mapRow(ResultSet rs, int rownumber) throws SQLException {
				getMonHocByGv mhbgv = new getMonHocByGv();
				mhbgv.setMaMon(rs.getString(1));
				mhbgv.setTenMon(rs.getString(2));
				mhbgv.setMaLop(rs.getString(3));
				mhbgv.setMaKy(rs.getString(4));
				return mhbgv;
			}
		});
	}
	
	public List<getSvByGv> getSvByGv(String maLop) {
		String sql = "select s.ma_sv, t.ho_ten, b.diem_tl, b.diem_ck, l.ma_lop from monhoc as m join lophoc as l on m.ma_mon=l.ma_mon join bangdiem as b on b.ma_lop = l.ma_lop join sinhvien as s on s.ma_sv=b.ma_sv join taikhoan as t on t.ma_tk=s.ma_tk where l.ma_lop='"+maLop+"';";
		return jdbcTemplate.query(sql, new RowMapper<getSvByGv>() {
			public getSvByGv mapRow(ResultSet rs, int rownumber) throws SQLException {
				getSvByGv svbgv = new getSvByGv();
				svbgv.setMaSv(rs.getString(1));
				svbgv.setHoTen(rs.getString(2));
				svbgv.setDiemTl(rs.getFloat(3));
				svbgv.setDiemCk(rs.getFloat(4));
				svbgv.setDiemTb();
				svbgv.setMaLop(rs.getString(5));
				return svbgv;
			}
		});
	}
}

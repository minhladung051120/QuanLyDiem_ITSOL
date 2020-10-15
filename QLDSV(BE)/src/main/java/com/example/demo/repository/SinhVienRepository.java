package com.example.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.SinhVien;
import com.example.demo.dto.getLopHocBySv;
@Repository
public class SinhVienRepository{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<SinhVien> getSinhVien() {
		String sql = "select s.ma_sv, t.ho_ten, s.khoa, t.email,t.sdt,t.dia_chi,l.ma_lop,l.ten_lop from monhoc as m join lophoc as l on m.ma_mon=l.ma_mon join bangdiem as b on b.ma_lop = l.ma_lop join sinhvien as s on s.ma_sv=b.ma_sv join taikhoan as t on t.ma_tk=s.ma_tk";
		return jdbcTemplate.query(sql, new RowMapper<SinhVien>() {
			public SinhVien mapRow(ResultSet rs, int rownumber) throws SQLException {
				SinhVien sv = new SinhVien();
				sv.setMaSv(rs.getString(1));
				sv.setHoTen(rs.getString(2));
				sv.setKhoa(rs.getString(3));
				sv.setEmail(rs.getString(4));
				sv.setSdt(rs.getString(5));
				sv.setDiaChi(rs.getString(6));
				sv.setMaLop(rs.getString(7));
				sv.setTenLop(rs.getString(8));
				return sv;
			}
		});
	}
	
	public List<getLopHocBySv> getLopHocBySv() {
		String sql = "select m.ma_mon, m.ten_mon, l.ma_lop, m.ma_ky,b.diem_tl,b.diem_ck from monhoc as m join lophoc as l on m.ma_mon=l.ma_mon join bangdiem as b on b.ma_lop = l.ma_lop join sinhvien as s on s.ma_sv=b.ma_sv join taikhoan as t on t.ma_tk=s.ma_tk where s.ma_sv = 'sv01'";
		return jdbcTemplate.query(sql, new RowMapper<getLopHocBySv>() {
			public getLopHocBySv mapRow(ResultSet rs, int rownumber) throws SQLException {
				getLopHocBySv lhbsv = new getLopHocBySv();
				lhbsv.setMaMon(rs.getString(1));
				lhbsv.setTenMon(rs.getString(2));
				lhbsv.setMaLop(rs.getString(3));
				lhbsv.setMaKy(rs.getString(4));
				lhbsv.setDiemTb(rs.getFloat(5), rs.getFloat(6));
				lhbsv.setTrangThai();
				return lhbsv;
			}
		});
	}
	
	
}

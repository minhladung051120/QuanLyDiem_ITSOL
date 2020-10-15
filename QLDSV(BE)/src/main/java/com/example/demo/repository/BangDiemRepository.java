package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dto.BangDiem;
import com.example.demo.model.bangdiem;

public interface BangDiemRepository extends JpaRepository<bangdiem, String> {
	@Query("SELECT new com.example.demo.dto.BangDiem(k.tenKy,m.tenMon,l.tenLop,s.maSv,t.hoTen,b.diemTl,b.diemCk) FROM kyhoc k JOIN k.monhocs m JOIN m.lophocs l JOIN l.bangdiem b JOIN b.sinhvien s JOIN s.taikhoan t where t.chucVu like 'SV'")
    public List<BangDiem> getBangDiem();
}

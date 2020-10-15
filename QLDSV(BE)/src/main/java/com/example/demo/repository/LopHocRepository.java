package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.example.demo.dto.LopHoc;
import com.example.demo.model.lophoc;

public interface LopHocRepository extends JpaRepository<lophoc, String> {
	@Query("SELECT new com.example.demo.dto.LopHoc(k.tenKy,m.tenMon,l.maLop,l.tenLop,g.maGv,t.hoTen) FROM kyhoc k JOIN k.monhocs m JOIN m.lophocs l JOIN l.giangvien g JOIN g.taikhoan t")
	 public List<LopHoc> getLopHoc();
}

package com.example.demo.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ExcelLophoc;
import com.example.demo.dto.ExcelSinhvien;
import com.example.demo.dto.LopHoc;
import com.example.demo.dto.SinhVien;
import com.example.demo.model.bangdiem;
import com.example.demo.model.giangvien;
import com.example.demo.model.lophoc;
import com.example.demo.model.monhoc;
import com.example.demo.repository.BangDiemRepository;
import com.example.demo.repository.GiangVienRepo;
import com.example.demo.repository.GiangVienRepository;
import com.example.demo.repository.LopHocRepository;
import com.example.demo.repository.MonHocRepo;
import com.example.demo.repository.MonHocRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class lophocController {
	@Autowired
	private LopHocRepository lopHocRepository;
	private BangDiemRepository bangDiemRepository;
	@Autowired
	private GiangVienRepo giangVienRepository;
	@Autowired
	private MonHocRepo monHocRepository;
	
	
	@GetMapping("/getGiangVien2")
	public List<giangvien> getGiangVien2() {
		return giangVienRepository.findAll();
	}
	
	@GetMapping("/getMonHoc2")
	public List<monhoc> getMonHoc2() {
		return monHocRepository.findAll();
	}
	
	@GetMapping("/getLopHoc")
	public List<LopHoc> getLopHoc() {
		return lopHocRepository.getLopHoc();
	}
	
	
	
	@GetMapping("/getLopHocByAlive")
	public List<lophoc> getLopHocByAlive() {
		return lopHocRepository.findAllByisAlive(true);
	}
	
	@GetMapping("/getLopHocId/{maLop}")
	public lophoc getLopHocId(@PathVariable(value = "maLop") String maLop) {
		System.out.println(maLop);
		Optional<lophoc> optionalLh = lopHocRepository.findById(maLop);
		lophoc lh = optionalLh.get();
		return lh;
	}
	
	@PostMapping("/lopHoc")
	public lophoc createKyHoc(@RequestBody lophoc lophoc) {
		lophoc.setAlive(true);
		return lopHocRepository.save(lophoc);
	}
	
	@PutMapping("/updateLopHoc/{id}")
	public ResponseEntity<?> update(@PathVariable("id")String id, @RequestBody lophoc lophoc){
		if(!lopHocRepository.existsById(id)) {
			return new ResponseEntity("Không tồn tại", HttpStatus.NOT_FOUND);
		}
		
		lophoc lop = lopHocRepository.getOne(id);
		lop.setGiangvien(lophoc.getGiangvien());
		lop.setTenLop(lophoc.getTenLop());
		lop.setMaMonHoc(lophoc.getMaMonHoc());
		lopHocRepository.save(lop);
		
		return new ResponseEntity("Cập nhật thành công", HttpStatus.OK);
	}
	
	@PostMapping("/joinSinhVien")
	public bangdiem joinSinhVien(@RequestBody bangdiem bangdiem) {
		return bangDiemRepository.save(bangdiem);
	}

	@PutMapping("/updateAlive/{maLop}")
	public ResponseEntity<?> updateAlive(@PathVariable("maLop")String maLop, @RequestBody lophoc lophoc){
		System.out.println(maLop);

		
		lophoc lop = lopHocRepository.getOne(maLop);
		lop.setAlive(false);
		lopHocRepository.save(lop);
		
		return new ResponseEntity("Cập nhật thành công", HttpStatus.OK);
	}
	
	@GetMapping("export/lophoc")
	public void exportToexcel(HttpServletResponse response,@RequestParam(defaultValue = "")String date) throws IOException{
//		response.setContentType("application/octet-stream");
//		String date1= "2020-09";
//		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
//		String currentDatetime = dateFormatter.format(new Date());
		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=sinhvien.xlsx";
		response.setHeader(headerKey, headerValue);
		
		List<LopHoc> lophoc = lopHocRepository.getLopHoc();
		ExcelLophoc excellophoc = new ExcelLophoc(lophoc);
		excellophoc.export(response);
		
	}
}

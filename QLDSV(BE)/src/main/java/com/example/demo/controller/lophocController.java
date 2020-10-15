package com.example.demo.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ExcelLophoc;
import com.example.demo.dto.ExcelSinhvien;
import com.example.demo.dto.LopHoc;
import com.example.demo.dto.SinhVien;
import com.example.demo.model.bangdiem;
import com.example.demo.model.lophoc;
import com.example.demo.repository.BangDiemRepository;
import com.example.demo.repository.LopHocRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class lophocController {
	@Autowired
	private LopHocRepository lopHocRepository;
	private BangDiemRepository bangDiemRepository;
	
	
	@GetMapping("/getLopHoc")
	public List<LopHoc> getLopHoc() {
		return lopHocRepository.getLopHoc();
	}
	
	@GetMapping("/getLopHocId")
	public lophoc getLopHocId(@PathVariable(value = "id") String maLop) {
		System.out.println(maLop);
		Optional<lophoc> optionalLh = lopHocRepository.findById(maLop);
		lophoc lh = optionalLh.get();
		return lh;
	}
	
	@PostMapping("/lopHoc")
	public lophoc createKyHoc(@RequestBody lophoc lophoc) {
		return lopHocRepository.save(lophoc);
	}
	
	@PostMapping("/joinSinhVien")
	public bangdiem joinSinhVien(@RequestBody bangdiem bangdiem) {
		return bangDiemRepository.save(bangdiem);
	}
	
	@DeleteMapping("/lopHoc/{id}")
	public void deleteLopHoc(@PathVariable(value = "id") String maLop){
		Optional<lophoc> optionalLh = lopHocRepository.findById(maLop);
		lophoc lh = optionalLh.get();
		lopHocRepository.delete(lh);
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

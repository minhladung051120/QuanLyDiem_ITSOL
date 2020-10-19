package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dto.MonHoc;

import com.example.demo.model.monhoc;
import com.example.demo.repository.MonHocRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class monhocController {
	@Autowired
	private MonHocRepository monHocRepository;
	
	@GetMapping("/getMonHoc")
	public List<MonHoc> getMonHoc() {
		return monHocRepository.getMonHoc();
	}
	
	@GetMapping("/getMonHoc/{id}")
	public monhoc getMonHocId(@PathVariable(value = "id") String maMon) {
		return monHocRepository.getMonHocId(maMon);
	}
	
	@GetMapping("/searchMonHoc/{id}")
	public List<MonHoc> searchMonHoc(@PathVariable(value = "id") String maMon) {
		return monHocRepository.searchMonHoc(maMon);
	}
	
//	@PostMapping("/monHoc")
//	public void createMonHoc(@RequestBody monhoc monhoc) {
//		monHocRepository.createMonHoc(monhoc.getMaMon(), monhoc.getTenMon(), monhoc.getMaKy());
//	}
//	
//	@PutMapping("/updateMonHoc")
//	public void updateMonHoc(@RequestBody monhoc monhoc) {
//		monHocRepository.updateMonHoc(monhoc.getMaMon(), monhoc.getTenMon(), monhoc.getMaKy());
//	}
	
	@DeleteMapping("/monHoc/{id}")
	public void deleteMonHoc(@PathVariable(value = "id") String maMon){
		monHocRepository.deleteMonHoc(maMon);
	}
}

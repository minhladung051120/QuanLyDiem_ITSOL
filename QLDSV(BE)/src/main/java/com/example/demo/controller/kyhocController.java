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

import com.example.demo.dto.KyHoc;
import com.example.demo.model.kyhoc;
import com.example.demo.repository.KyHocRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class kyhocController {
	@Autowired
	private KyHocRepository kyHocRepository;
	
	@GetMapping("/getKyHoc")
	public List<KyHoc> getKyHoc() {
		return kyHocRepository.getKyHoc();
	}
	
	@GetMapping("/getKyHoc/{id}")
	public KyHoc getKyHocId(@PathVariable(value = "id") String maKy) {
		return kyHocRepository.getKyHocId(maKy);
	}
	
	@GetMapping("/searchKyHoc/{id}")
	public List<KyHoc> searchKyHoc(@PathVariable(value = "id") String tenKy) {
		return kyHocRepository.searchKyHoc(tenKy);
	}
	
	@PostMapping("/kyHoc")
	public void createKyHoc(@RequestBody kyhoc kyhoc) {
		kyHocRepository.createKyHoc(kyhoc.getMaKy(), kyhoc.getTenKy(), kyhoc.getThoiGian(), kyhoc.getThoiGianKt());
	}
	
	@PutMapping("/updateKyHoc")
	public void updateKyHoc(@RequestBody kyhoc kyhoc) {
		kyHocRepository.updateKyHoc(kyhoc.getMaKy(), kyhoc.getTenKy(), kyhoc.getThoiGian(), kyhoc.getThoiGianKt());
	}
	
	@DeleteMapping("/kyHoc/{id}")
	public void deleteKyHoc(@PathVariable(value = "id") String maKy){
		kyHocRepository.deleteKyHoc(maKy);
	}
}

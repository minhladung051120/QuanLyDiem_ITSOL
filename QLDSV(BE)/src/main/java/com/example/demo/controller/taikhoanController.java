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

import com.example.demo.dto.TaiKhoan;
import com.example.demo.dto.TaiKhoanDb;
import com.example.demo.model.taikhoan;
import com.example.demo.repository.TaiKhoanRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class taikhoanController {
	@Autowired
	private TaiKhoanRepository taiKhoanRepository;
	
	@GetMapping("/getTaiKhoanSv")
	public List<TaiKhoan> getTaiKhoanSv() {
		return taiKhoanRepository.getTaiKhoanSv();
	}

	@GetMapping("/getTaiKhoanGv")
	public List<TaiKhoan> getTaiKhoanGv() {
		return taiKhoanRepository.getTaiKhoanGv();
	}
	
	@GetMapping("/getTaiKhoanDt")
	public List<TaiKhoan> getTaiKhoanDt() {
		return taiKhoanRepository.getTaiKhoanDt();
	}
	
	@GetMapping("/getTaiKhoan")
	public List<TaiKhoan> getTaiKhoan() {
		return taiKhoanRepository.getTaiKhoan();
	}
	
	@GetMapping("/getTaiKhoan/{id}")
	public TaiKhoanDb getTaiKhoanId(@PathVariable(value = "id") String maTk) {
		return taiKhoanRepository.getTaiKhoanId(maTk);
	}
	
	@GetMapping("/getTaiKhoanGvId/{maTk}")
	public TaiKhoanDb getTaiKhoanGvId(@PathVariable(value = "maTk") String maTk) {
		return taiKhoanRepository.getTaiKhoanGvId(maTk);
	}
	
	@GetMapping("/getTaiKhoanSvId/{maTk}")
	public TaiKhoanDb getTaiKhoanSvId(@PathVariable(value = "maTk") String maTk) {
		return taiKhoanRepository.getTaiKhoanSvId(maTk);
	}
	
	@PostMapping("/createTaiKhoanDt")
	public void createTaiKhoanDt(@RequestBody taikhoan taikhoan) {
		taiKhoanRepository.createTaiKhoanDt(taikhoan);
	}
	
	@PostMapping("/createTaiKhoanDb")
	public void createTaiKhoanDb(@RequestBody TaiKhoanDb createTaiKhoanDb) {
		taiKhoanRepository.createTaiKhoanDb(createTaiKhoanDb);
	}
	
	@PutMapping("/updateTaiKhoan")
	public void updateTaiKhoanDt(@RequestBody TaiKhoanDb TaiKhoanDb) {
		taiKhoanRepository.updateTaiKhoan(TaiKhoanDb);
	}
	
	@PutMapping("/updateTaiKhoanDb")
	public void updateTaiKhoanDb(@RequestBody TaiKhoanDb TaiKhoanDb) {
		taiKhoanRepository.updateTaiKhoanDb(TaiKhoanDb);
	}
	
	@DeleteMapping("/deleteTaiKhoanDt/{id}")
	public void deleteTaiKhoan(@PathVariable(value = "id") String maTk){
		taiKhoanRepository.deleteTaiKhoanDt(maTk);
	}
}

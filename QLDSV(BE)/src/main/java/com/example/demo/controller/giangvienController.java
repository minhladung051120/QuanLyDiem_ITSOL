package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.getMonHocByGv;
import com.example.demo.dto.getSvByGv;
import com.example.demo.repository.GiangVienRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class giangvienController {
	@Autowired
	private GiangVienRepository giangVienRepository;

	@GetMapping("/getMonHocByGv")
	public List<getMonHocByGv> getMonHocByGv() {
		return giangVienRepository.getMonHocByGv();
	}
	
	@GetMapping("/getSvByGv/{id}")
	public List<getSvByGv> getSvByGv(@PathVariable(value = "id") String maLop) {
		System.out.println(maLop);
		return giangVienRepository.getSvByGv(maLop);
	}
}

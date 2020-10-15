
package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TestRestAPIs {
	
	@GetMapping("/api/sinhvien")
	@PreAuthorize("hasRole('SINHVIEN')")
	public String sinhVienAccess() {
		return "sinhvien";
	}

	@GetMapping("/api/giangvien")
	@PreAuthorize("hasRole('GIANGVIEN')")
	public String giangVienAccess() {
		return "giangvien";
	}
	
	@GetMapping("/api/daotao")
	@PreAuthorize("hasRole('DAOTAO')")
	public String daoTaoAccess() {
		return "daotao";
	}

}
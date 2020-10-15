package com.example.demo.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BangDiem;
import com.example.demo.dto.Excelbangdiem;
import com.example.demo.repository.BangDiemRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class bangdiemController {
	@Autowired
	private BangDiemRepository bangDiemRepository;
	
	@GetMapping("/getBangDiem")
	public List<BangDiem> getBangDiem() {
		return bangDiemRepository.getBangDiem();
	}
	@GetMapping("export/bangdiem")
	public void exportToexcel1(HttpServletResponse response,@RequestParam(defaultValue = "")String date) throws IOException{
		response.setContentType("application/octet-stream");
//		String date1= "2020-09";
//		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
//		String currentDatetime = dateFormatter.format(new Date());
		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=bangdiem.xlsx";
		response.setHeader(headerKey, headerValue);
		
		List<BangDiem> bangdiem = bangDiemRepository.getBangDiem();
		Excelbangdiem excelbangdiem = new Excelbangdiem(bangdiem);	
		excelbangdiem.export(response);
		
	}
}

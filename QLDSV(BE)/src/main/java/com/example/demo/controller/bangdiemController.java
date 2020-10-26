package com.example.demo.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BangDiem;
import com.example.demo.dto.Excelbangdiem;
import com.example.demo.model.bangdiem;
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
	
//	public static void main(String[] args) {
//		try {
//		      FileInputStream excelFile = new FileInputStream(new File("Demo-ApachePOI-Excel.xlsx"));
//		      Workbook workbook = new XSSFWorkbook(excelFile);
//		      Sheet datatypeSheet = workbook.getSheetAt(0);
//		      DataFormatter fmt = new DataFormatter();
//		      Iterator<Row> iterator = datatypeSheet.iterator();
//		      Row firstRow = iterator.next();
//		      Cell firstCell = firstRow.getCell(0);
//		      System.out.println(firstCell.getStringCellValue());
//		      List<BangDiem> listOfCustomer = new ArrayList<BangDiem>();
//		      while (iterator.hasNext()) {
//		        Row currentRow = iterator.next();
//		        BangDiem BangDiem = new com.example.demo.dto.BangDiem(null, null, null, null, null, 0, 0);
//		        BangDiem.setTenKy(currentRow.getCell(1).getStringCellValue());
//		        BangDiem.setTenMon(currentRow.getCell(2).getStringCellValue());
//		        BangDiem.setTenLop(currentRow.getCell(3).getStringCellValue());
//		        BangDiem.setMaSv(currentRow.getCell(4).getStringCellValue());
//		        BangDiem.setHoTen(currentRow.getCell(5).getStringCellValue());
//		        BangDiem.setDiemTl(Integer.parseInt(fmt.formatCellValue(currentRow.getCell(6))));
//		        BangDiem.setDiemCk(Integer.parseInt(fmt.formatCellValue(currentRow.getCell(7))));
//		        BangDiem.setDiemTb(Integer.parseInt(fmt.formatCellValue(currentRow.getCell(8))));
//		        BangDiem.setXepLoai(currentRow.getCell(9).getStringCellValue());
//		        listOfCustomer.add(BangDiem);
//		      }
//		      for (BangDiem customer : listOfCustomer) {
//		        System.out.println(customer);
//		      }
//		      workbook.close();
//		    } catch (FileNotFoundException e) {
//		      e.printStackTrace();
//		    } catch (IOException e) {
//		      e.printStackTrace();
//		    }
//	}
	
	
	
	
}

package com.example.demo.dto;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class ExcelSinhvien {
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private List<SinhVien> sinhviens;

	public ExcelSinhvien(List<SinhVien> sv) {
		this.sinhviens = sv;
		workbook = new XSSFWorkbook();
	}

	private void writeHeaderLine() {
		sheet = workbook.createSheet("Sinh Viên");

		Row row = sheet.createRow(0);
		CellStyle style = workbook.createCellStyle();
		XSSFFont font = workbook.createFont();
		font.setBold(true);
		font.setFontHeight(16);
		style.setFont(font);
		createCell(row, 0, "Stt", style);
		createCell(row, 1, "Mã sinh viên", style);
		createCell(row, 2, "Tên sinh viên", style);
		createCell(row, 3, "Khóa", style);
		createCell(row, 4, "Email", style);
		createCell(row, 5, "SĐT", style);
		createCell(row, 6, "Địa chỉ", style);
		createCell(row, 7, "Mã lớp", style);
		createCell(row, 8, "Tên lớp", style);

	}

	private void createCell(Row row, int columnCount, Object value, CellStyle style) {
		sheet.autoSizeColumn(columnCount);
		Cell cell = row.createCell(columnCount);
		if (value instanceof Integer) {
			cell.setCellValue((Integer) value);
		} else if (value instanceof Boolean) {
			cell.setCellValue((Boolean) value);
		} else {
			cell.setCellValue((String) value);
		}
		cell.setCellStyle(style);
	}

	private void writeDataLines() {
		int rowcount = 1;

		CellStyle style = workbook.createCellStyle();
		XSSFFont font = workbook.createFont();
		font.setFontHeight(14);
		style.setFont(font);
		int index = 1;

		for (SinhVien sv : sinhviens) {
			Row row = sheet.createRow(rowcount++);
			int columnCount = 0;

			createCell(row, columnCount++, index++, style);
			createCell(row, columnCount++, sv.getMaSv(), style);
			createCell(row, columnCount++, sv.getHoTen(), style);
			createCell(row, columnCount++, sv.getKhoa(), style);
			createCell(row, columnCount++, sv.getEmail(), style);
			createCell(row, columnCount++, sv.getSdt(), style);
			createCell(row, columnCount++, sv.getDiaChi(), style);
			createCell(row, columnCount++, sv.getMaLop(), style);
			createCell(row, columnCount++, sv.getTenLop(), style);
//			String formula = "D" + rowcount + " * E" + rowcount + " -G" + rowcount + "+H" + rowcount + "-I" + rowcount
//					+ "+J" + rowcount + "+K" + rowcount + "L";
//			row.createCell(8, CellType.FORMULA).setCellFormula(formula);

		}

	}

	public void export(HttpServletResponse response) throws IOException {
		writeHeaderLine();
		writeDataLines();
		
		ServletOutputStream outputStream = response.getOutputStream();
		workbook.write(outputStream);
		workbook.close();
		outputStream.close();
		
	}

}

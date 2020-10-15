package com.example.demo.dto;

import java.io.IOException;
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

public class Excelbangdiem {
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private List<BangDiem> bangDiems;

	public Excelbangdiem(List<BangDiem> bangdiem) {
		this.bangDiems = bangdiem;
		workbook = new XSSFWorkbook();
	}

	private void writeHeaderLine() {
		sheet = workbook.createSheet("Bảng Điểm");

		Row row = sheet.createRow(0);
		CellStyle style = workbook.createCellStyle();
		XSSFFont font = workbook.createFont();
		font.setBold(true);
		font.setFontHeight(16);
		style.setFont(font);
		createCell(row, 0, "Stt", style);
		createCell(row, 1, "Tên Kỳ", style);
		createCell(row, 2, "Tên Môn", style);
		createCell(row, 3, "Tên lớp", style);
		createCell(row, 4, "Mã Sinh Viên", style);
		createCell(row, 5, "Tên sinh viên", style);
		createCell(row, 6, "Điểm điều kiện", style);
		createCell(row, 7, "Điểm cuối kỳ", style);
		createCell(row, 8, "Điểm trung bình", style);
		createCell(row, 9, "Xếp loại", style);

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

		for (BangDiem sv : bangDiems) {
			Row row = sheet.createRow(rowcount++);
			int columnCount = 0;

			createCell(row, columnCount++, index++, style);
			createCell(row, columnCount++, sv.getTenKy(), style);
			createCell(row, columnCount++, sv.getTenMon(), style);
			createCell(row, columnCount++, sv.getTenLop(), style);
			createCell(row, columnCount++, sv.getMaSv(), style);
			createCell(row, columnCount++, sv.getHoTen(), style);
			createCell(row, columnCount++, String.valueOf(sv.getDiemTl()), style);
			createCell(row, columnCount++, String.valueOf(sv.getDiemCk()), style);
			createCell(row, columnCount++, String.valueOf(sv.getDiemTb()), style);
			createCell(row, columnCount++, sv.getXepLoai(), style);	
//			String formula = "IF(H" + rowcount + ">8"+",1,"+"2)";
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

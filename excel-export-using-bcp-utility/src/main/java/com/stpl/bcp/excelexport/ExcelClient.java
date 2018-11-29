package com.stpl.bcp.excelexport;

public class ExcelClient {

	public static void main(String[] args) {
		System.out.println("Copying file to excel...");
		ExcelExport excelExport = new ExcelExport();
		excelExport.exportToExcel();
	}
}

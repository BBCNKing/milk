package com.bbking.milk.controller;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPalette;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**  
 * Copyright: Copyright (c) 2018 Asiainfo
 * 
 * @ClassName: ExcelPortOutController.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: ruanxl
 * @date: 2018年5月9日 上午9:48:16 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年5月9日     ruanxl           v1.0.0               修改原因
 */
@SuppressWarnings("deprecation")
@Controller
public class ExcelPortOutController {
	
	@RequestMapping(value = "/createFile")
	public void createXls(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("测试Xls");
		// 在sheet里创建第一行，参数为行索引(excel的行)，可以是0～65535之间的任何一个
		HSSFRow row1 = sheet.createRow(0);
		// 创建单元格（excel的单元格，参数为列索引，可以是0～255之间的任何一个
		HSSFCell cell = row1.createCell(0);
		// 设置单元格内容
		cell.setCellValue("学员考试成绩一览表");
		// 合并单元格CellRangeAddress构造参数依次表示起始行，截至行，起始列， 截至列
		sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 3));
		// 在sheet里创建第二行
		HSSFRow row2 = sheet.createRow(1);
		// 创建单元格并设置单元格内容
		row2.createCell(0).setCellValue("姓名");
		row2.createCell(1).setCellValue("班级");	
		row2.createCell(2).setCellValue("笔试成绩");
		row2.createCell(3).setCellValue("机试成绩");
		// 在sheet里创建第三行
		HSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("李明");
		row3.createCell(1).setCellValue("As178");
		row3.createCell(2).setCellValue(87);
		row3.createCell(3).setCellValue(78);

		// 输出Excel文件
		OutputStream output = response.getOutputStream();
		response.reset();
		response.setHeader("Content-disposition",
				"attachment; filename=details.xls");
		response.setContentType("application/msexcel");
		wb.write(output);
		output.close();
	}

	/**
	 * 列表数据格式
	 * 
	 * @date 创建时间 2017年3月21日 下午4:32:13
	 * @param workbook
	 * @return
	 */
	public HSSFCellStyle getStyle(HSSFWorkbook workbook) {
		// 设置字体
		HSSFFont font = workbook.createFont();
		// 设置字体名字
		font.setFontName("宋体"); // 字体
		// 设置字体大小
		font.setFontHeightInPoints((short) 11);
		// 字体加粗
		// font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		// 设置样式;
		HSSFCellStyle style = workbook.createCellStyle();
		// 设置底边框;
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		// 设置底边框颜色;
		style.setBottomBorderColor(HSSFColor.BLACK.index);
		// 设置左边框;
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		// 设置左边框颜色;
		style.setLeftBorderColor(HSSFColor.BLACK.index);
		// 设置右边框;
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		// 设置右边框颜色;
		style.setRightBorderColor(HSSFColor.BLACK.index);
		// 设置顶边框;
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		// 设置顶边框颜色;
		style.setTopBorderColor(HSSFColor.BLACK.index);
		// 在样式用应用设置的字体;
		style.setFont(font);
		// 设置自动换行;
		style.setWrapText(true);
		// 设置水平对齐的样式为居中对齐;
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		// 设置垂直对齐的样式为居中对齐;
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		return style;
	}

	/**
	 * 列表表头用 数据格式表头
	 * 
	 * @date 创建时间 2017年3月21日下午4:32:13
	 * @param workbook
	 * @return
	 */
	public HSSFCellStyle getStyleTitle(HSSFWorkbook workbook) {

		// 设置字体
		HSSFFont font = workbook.createFont();
		// 设置字体名字
		font.setFontName("宋体"); // 字体
		// 设置字体大小
		font.setFontHeightInPoints((short) 10);
		// 字体加粗
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		// 设置样式;
		HSSFCellStyle style = workbook.createCellStyle();

		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillBackgroundColor(IndexedColors.RED.getIndex());

		// 设置底边框;
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		// 设置底边框颜色;
		style.setBottomBorderColor(HSSFColor.BLACK.index);
		// 设置左边框;
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		// 设置左边框颜色;
		style.setLeftBorderColor(HSSFColor.BLACK.index);
		// 设置右边框;
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		// 设置右边框颜色;
		style.setRightBorderColor(HSSFColor.BLACK.index);
		// 设置顶边框;
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		// 设置顶边框颜色;
		style.setTopBorderColor(HSSFColor.BLACK.index);
		// 在样式用应用设置的字体;
		style.setFont(font);
		// 设置自动换行;
		style.setWrapText(false);
		// 设置水平对齐的样式为居中对齐;
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		// 设置垂直对齐的样式为居中对齐;
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		return style;
	}

	/**
	 * 设定自定义字体颜色信息
	 * 
	 * @date 创建时间 2017年3月21日 下午12:01:09
	 * @param str
	 *            颜色
	 * @param index
	 *            编号
	 * @param wb
	 *            execl对象
	 */
	public void setHSSFPalette(String str, int index, HSSFWorkbook wb) {
		// 处理把它转换成十六进制并放入一个数
		int[] color = new int[3];
		color[0] = Integer.parseInt(str.substring(1, 3), 16);
		color[1] = Integer.parseInt(str.substring(3, 5), 16);
		color[2] = Integer.parseInt(str.substring(5, 7), 16);
		// 自定义颜色
		HSSFPalette palette = wb.getCustomPalette();
		// 设置自定义颜色的下标，接下来会用到
		palette.setColorAtIndex(((short) index), (byte) color[0],
				(byte) color[1], (byte) color[2]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

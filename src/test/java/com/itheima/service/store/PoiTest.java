package com.itheima.service.store;

import com.itheima.domain.store.Question;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class PoiTest {
    @Test
    public void testWriteByPoi() throws IOException {
        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("就这");
        Row row = sheet.createRow(1);
        Cell cell = row.createCell(1);
        cell.setCellValue("奥里给");

        FileOutputStream fos = new FileOutputStream(new File("test.xlsx"));
        wb.write(fos);
        wb.close();
        fos.close();
    }

    @Test
    public void testReadByPoi() throws IOException {
        Workbook wb = new XSSFWorkbook("test.xlsx");
        Sheet sheet = wb.getSheet("就这");
        Row row = sheet.getRow(1);
        Cell cell = row.getCell(1);
        String stringCellValue = cell.getStringCellValue();
        System.out.println(stringCellValue);
        wb.close();
    }

    @Test
    public void testProject() throws IOException {
        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("题目数据文件");

        //标题
        sheet.addMergedRegion(new CellRangeAddress(1, 1, 1, 12));

        Row row_1 = sheet.createRow(1);
        Cell cell_1_11 = row_1.createCell(1);
        cell_1_11.setCellValue("在线试题导出信息");

        //样式
        CellStyle cs_title = wb.createCellStyle();
        cs_title.setAlignment(HorizontalAlignment.CENTER);
        cs_title.setVerticalAlignment(VerticalAlignment.CENTER);
        cell_1_11.setCellStyle(cs_title);

        CellStyle cs_field = wb.createCellStyle();
        cs_field.setBorderBottom(BorderStyle.THIN);
        cs_field.setBorderTop(BorderStyle.THIN);
        cs_field.setBorderLeft(BorderStyle.THIN);
        cs_field.setBorderRight(BorderStyle.THIN);



        //表头
        Row row_2 = sheet.createRow(2);
        String[] fields = {"题目ID", "所属公司ID", "所属目录ID", "题目简介", "题干描述",
                "题干配图", "题目分析", "题目类型", "题目难度", "是否经典题", "题目状态", "审核状态"};
        for (int i = 0; i < fields.length; i++) {
            Cell cell_2_temp = row_2.createCell(1 + i);
            cell_2_temp.setCellValue(fields[i]);
            cell_2_temp.setCellStyle(cs_field);
        }


        //数据
        ArrayList<Question> list = new ArrayList<>();
        Question qq = new Question();
        qq.setId("1");
        qq.setPicture("12");
        qq.setReviewStatus("13");
        qq.setAnalysis("14");
        qq.setCatalogId("15");
        qq.setCompanyId("16");
        qq.setDifficulty("17");
        qq.setIsClassic("18");
        qq.setRemark("19");
        qq.setState("21");
        qq.setSubject("31");
        qq.setType("41");
        list.add(qq);

        Question qqq = new Question();
        qqq.setId("1");
        qqq.setPicture("12");
        qqq.setReviewStatus("13");
        qqq.setAnalysis("14");
        qqq.setCatalogId("15");
        qqq.setCompanyId("16");
        qqq.setDifficulty("17");
        qqq.setIsClassic("18");
        qqq.setRemark("19");
        qqq.setState("21");
        qqq.setSubject("31");
        qqq.setType("41");
        list.add(qqq);



        int row_field = 0;
        for (Question q: list) {
            int cell_index = 0;
            Row row_temp = sheet.createRow(3 + row_field++);

            Cell cell_data_1 = row_temp.createCell(1 + cell_index++);
            cell_data_1.setCellValue(q.getId());    //++
            cell_data_1.setCellStyle(cs_field);

            Cell cell_data_2 = row_temp.createCell(1 + cell_index++);
            cell_data_2.setCellValue(q.getCompanyId());    //++
            cell_data_2.setCellStyle(cs_field);

            Cell cell_data_3 = row_temp.createCell(1 + cell_index++);
            cell_data_3.setCellValue(q.getCatalogId());    //++
            cell_data_3.setCellStyle(cs_field);

            Cell cell_data_4 = row_temp.createCell(1 + cell_index++);
            cell_data_4.setCellValue(q.getRemark());    //++
            cell_data_4.setCellStyle(cs_field);

            Cell cell_data_5 = row_temp.createCell(1 + cell_index++);
            cell_data_5.setCellValue(q.getSubject());    //++
            cell_data_5.setCellStyle(cs_field);

            Cell cell_data_6 = row_temp.createCell(1 + cell_index++);
            cell_data_6.setCellValue(q.getPicture());    //++
            cell_data_6.setCellStyle(cs_field);

            Cell cell_data_7 = row_temp.createCell(1 + cell_index++);
            cell_data_7.setCellValue(q.getAnalysis());    //++
            cell_data_7.setCellStyle(cs_field);

            Cell cell_data_8 = row_temp.createCell(1 + cell_index++);
            cell_data_8.setCellValue(q.getType());    //++
            cell_data_8.setCellStyle(cs_field);

            Cell cell_data_9 = row_temp.createCell(1 + cell_index++);
            cell_data_9.setCellValue(q.getDifficulty());    //++
            cell_data_9.setCellStyle(cs_field);

            Cell cell_data_10 = row_temp.createCell(1 + cell_index++);
            cell_data_10.setCellValue(q.getIsClassic());    //++
            cell_data_10.setCellStyle(cs_field);

            Cell cell_data_11 = row_temp.createCell(1 + cell_index++);
            cell_data_11.setCellValue(q.getState());    //++
            cell_data_11.setCellStyle(cs_field);

            Cell cell_data_12 = row_temp.createCell(1 + cell_index);
            cell_data_12.setCellValue(q.getReviewStatus());    //++
            cell_data_12.setCellStyle(cs_field);

        }


        FileOutputStream fos = new FileOutputStream(new File("test.xlsx"));
        wb.write(fos);
        wb.close();
        fos.close();

    }
}

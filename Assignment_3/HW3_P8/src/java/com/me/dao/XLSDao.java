/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.dao;

import com.me.pojo.Store;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author mansiagrawal
 */
public class XLSDao {
    
     public  List<Store> getStoreData(String filePath) throws FileNotFoundException, IOException {
        List<Store> storeList = new ArrayList<>();
         //   String fpath = filePath;
         String extension = "xls";
        
                  String directory = "/Users/mansiagrawal/Downloads/HW3_P7/";
         FileInputStream file;
         file = new FileInputStream(new File(directory + filePath + "." + extension));
            HSSFWorkbook excelfile = new HSSFWorkbook(file);
            HSSFSheet currSheet = excelfile.getSheetAt(0);
            DataFormatter reformat = new DataFormatter();
         
            for (Row row : currSheet) { 
               
                 Store s = new Store();
                for (Cell cell : row) {
                   
                    if (cell.getColumnIndex() == 1) {
                                s.setOrder_id(String.valueOf(cell.getStringCellValue()));
                    }
                    else if (cell.getColumnIndex() == 5) {
                                s.setCustomer_id(String.valueOf(cell.getStringCellValue()));
                    }
                    else if (cell.getColumnIndex() == 6) {
                                s.setCustomer_name(String.valueOf(cell.getStringCellValue()));
                    }
                    else if (cell.getColumnIndex() == 13) {
                                s.setProduct_id(String.valueOf(cell.getStringCellValue()));
                    }
                    else if (cell.getColumnIndex() == 16) {
                                s.setProduct_name(String.valueOf(cell.getStringCellValue()));
                    }
                   
                }
               storeList.add(s);
            }
         
        return storeList;
     }

    
}

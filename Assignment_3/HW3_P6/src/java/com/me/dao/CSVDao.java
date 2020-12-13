/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.dao;

import com.me.pojo.CSVClass;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author deeptinigam
 */
public class CSVDao {
   
    public List<CSVClass> getCSVData(String filePath) {
        List<CSVClass> dataList = new ArrayList<>();
        try {

            String extension = "csv";
            String directory = "/Users/mansiagrawal/Downloads/HW3_P6";
            Class.forName("org.relique.jdbc.csv.CsvDriver");
            System.out.println("Inside CSV DAAAAAAO");
            try (Connection connection = DriverManager.getConnection("jdbc:relique:csv:" + directory)) {
                Statement stmt = connection.createStatement();

                ResultSet results = stmt.executeQuery("SELECT * FROM " + filePath);
           //     System.out.println("Row Count ---------> " + results.next());
                ResultSetMetaData metaData = results.getMetaData();
                String[] columnNames = null;
                int colCount = metaData.getColumnCount();

                while (results.next()) {

                    for (int i = 1; i <= colCount; ++i) {
                        CSVClass csv = new CSVClass();
                        csv.setSalesOrderID(Long.parseLong(results.getString("SalesOrderID")));
                        csv.setRevisionNumber(Long.parseLong(results.getString("RevisionNumber")));
                        csv.setOrderDate(results.getString("OrderDate"));
                        csv.setDueDate(results.getString("DueDate"));
                        csv.setShipDate(results.getString("ShipDate"));
                        csv.setStatus(results.getString("Status"));

                        csv.setOnlineOrderFlag(results.getString("OnlineOrderFlag"));
                        csv.setSalesOrderNumber(results.getString("SalesOrderNumber"));
                        csv.setPurchaseOrderNumber(results.getString("PurchaseOrderNumber"));
                        csv.setAccountNumber(results.getString("AccountNumber"));
                        csv.setSalesPersonID(results.getString("SalesPersonID"));
                        csv.setCustomerID(results.getString("CustomerID"));
                        csv.setTerritoryID(results.getString("TerritoryID"));
                        csv.setBillToAddressID(results.getString("BillToAddressID"));
                        csv.setShipToAddressID(results.getString("ShipToAddressID"));
                        csv.setShipMethodID(results.getString("ShipMethodID"));
                        csv.setCreditCardID(results.getString("CreditCardID"));
                        csv.setCreditCardApprovalCode(results.getString("CreditCardApprovalCode"));
                        csv.setCurrencyRateID(results.getString("CurrencyRateID"));
                        csv.setSubTotal(Double.parseDouble(results.getString("SubTotal")));
                        csv.setFreight(Double.parseDouble(results.getString("Freight")));
                        csv.setTaxAmt(Double.parseDouble(results.getString("TaxAmt")));
                        csv.setTotalDue(Double.parseDouble(results.getString("TotalDue")));
                        csv.setComment(results.getString("Comment"));
                        csv.setModifiedDate(results.getString("ModifiedDate"));
                        dataList.add(csv);

                    }

                }

            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Exception Occured " + e);
        }
        return dataList;

    }

}

<%-- 
    Document   : csvOutput
    Created on : Oct 19, 2019, 6:33:06 PM
    Author     : mansiagrawal
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="com.me.pojo.CSVClass"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <h1>CSV Data</h1>
            <h1>File name : <c:out value="${requestScope.fpath}"/></h1> 
        <table border="1">
          
                   <thead>
            <th>Sales Order ID</th>
            <th>Revision number</th>
             <th>OrderDate </th>
             <th>DueDate</th>
             <th>ShipDate</th>
             <th>Status</th>
             <th>OnlineOrderFlag</th>
             <th>SalesOrderNumber</th>
             <th>PurchaseOrderNumber</th>
             <th>AccountNumber</th>
             <th>CustomerID</th>
            <th>SalesPersonID</th>
             <th>TerritoryID</th>
            <th>BillToAddressID</th>
           <th>ShipToAddressID</th>
            <th>ShipMethodID</th>
            <th>CreditCardID</th>
             <th>CreditCardApprovalCode</th>
             <th>CurrencyRateID</th>
            <th>SubTotal</th>
            <th>TaxAmt</th>
            <th>Freight</th>
            <th>TotalDue</th>
            <th>Comment</th>
            <th>ModifiedDate</th>
        </thead> 
              
        
              <c:forEach items="${requestScope.csvdata}" var="item">
               
           
                 
                <tr>
                    <td><c:out value = "${item.getSalesOrderID()}"/></td>
                    <td><c:out value = "${item.getRevisionNumber()}"/></td>
                    <td><c:out value = "${item.getOrderDate()}"/></td>
                    <td><c:out value = "${item.getDueDate()}"/></td>
                    <td><c:out value = "${item.getShipDate()}"/></td>
                    <td><c:out value = "${item.getStatus()}"/></td>
                    <td><c:out value = "${item.getOnlineOrderFlag()}"/></td>
                    <td><c:out value = "${item.getSalesOrderNumber()}"/></td>
                    <td><c:out value = "${item.getPurchaseOrderNumber()}"/></td>
                    <td><c:out value = "${item.getAccountNumber()}"/></td>
                    <td><c:out value = "${item.getCustomerID()}"/></td>
                    <td><c:out value = "${item.getSalesPersonID()}"/></td>
                    <td><c:out value = "${item.getTerritoryID()}"/></td>
                    <td><c:out value = "${item.getBillToAddressID()}"/></td>
                    
                    <td><c:out value = "${item.getShipToAddressID()}"/></td>
                    <td><c:out value = "${item.getShipMethodID()}"/></td>
                    <td><c:out value = "${item.getCreditCardID()}"/></td>
                    <td><c:out value = "${item.getCreditCardApprovalCode()}"/></td>
                    <td><c:out value = "${item.getCurrencyRateID()}"/></td>
                    <td><c:out value = "${item.getSubTotal()}"/></td>
                    
                    
                    <td><c:out value = "${item.getTaxAmt()}"/></td>
                    <td><c:out value = "${item.getFreight()}"/></td>
                    <td><c:out value = "${item.getTotalDue()}"/></td>
                    <td><c:out value = "${item.getComment()}"/></td>
                    <td><c:out value = "${item.getModifiedDate()}"/></td>
              </tr>
                 </c:forEach>
        </table>
    </body>
</html>

<%-- 
    Document   : storeOutput
    Created on : Oct 20, 2019, 6:46:10 PM
    Author     : mansi agrawal
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.me.pojo.Store"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Store Data</h1>
            <h1>File name : <c:out value="${requestScope.filePath}"/></h1> 
         <table border="1">
        
            <c:forEach items="${requestScope.xlsdata}" var="item">
                <tr>
                <td><c:out value = "${item.getOrder_id()}"/></td>
                <td><c:out value = "${item.getCustomer_id()}"/></td>
                <td><c:out value = "${item.getCustomer_name()}"/></td>
                <td><c:out value = "${item.getProduct_id()}"/></td>
                <td><c:out value = "${item.getProduct_name()}"/></td>
                   </tr>
                 </c:forEach>
        </table>
    </body>
</html>

<%-- 
    Document   : fileInput
    Created on : Oct 20, 2019, 3:06:30 PM
    Author     : mansiagrawal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action = "CSVServlet.xls" method = "POST">
         Enter CSV File name: <input type = "text" name = "filePath">         
         <input type = "submit" value = "Submit" />
        </form>
    </body>
</html>

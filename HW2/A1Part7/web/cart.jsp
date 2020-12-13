    <%-- 
    Document   : cart
    Created on : Oct 11, 2019, 8:19:36 PM
    Author     : mansiagrawal 
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page import="java.util.Set"%>
<%@page import="java.util.HashSet"%>
<%@page import="Beans.Items"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                font-weight: bold;
            }
         h1{
                color: green;
            }
a:link, a:visited {
  background-color: hotpink;
  color: white;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a:hover, a:active {
  background-color: hotpink;
}
        </style>
    </head>
    <body>
        <h1>Cart</h1>

  
              <c:forEach items="${cart}" var="item" >
                    <input type="checkbox" class="t"name=id value=${item.item_id}>
             ${item.item_name}
            
             <a href='abc.do?selected=remove&id=${item.item_id}'>Remove</a>
             <br>
             <br>
      </c:forEach>
             <br>
                    <a href="home.jsp">Click here to go to home Page</a>   
    </body>
</html>

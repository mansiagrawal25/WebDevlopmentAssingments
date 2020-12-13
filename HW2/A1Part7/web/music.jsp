<%-- 
    Document   : music
    Created on : Oct 11, 2019, 8:19:36 PM
    Author     : Parth
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.Set"%>
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
            .b {
  background-color: firebrick;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
        </style>
    </head>
    <body>
        <h1>Music</h1>
        <form method="post" action = 'abc.do?selected=add'>
 <br>
       
                <c:forEach items="${Music}" var="item" >
                    <input type="checkbox" name="id" value=${item.item_id}>
             ${item.item_name} ${item.item_id}
             <br>
             <a href='abc.do?selected=add&id="${item.item_id}"'></a>
            
       <br>
</c:forEach>

        <input type="submit" class="b" value = "Add to cart">
        </form>
    </body>
</html>

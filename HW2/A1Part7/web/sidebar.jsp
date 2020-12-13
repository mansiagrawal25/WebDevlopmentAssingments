<%-- 
    Document   : sidebar
    Created on : Oct 11, 2019, 8:19:36 PM
    Author     : Parth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
      
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
        <h1>Online Shopping!</h1>
        <a href="abc.do?selected=Books">Books</a>&nbsp;&nbsp;
        <a href="abc.do?selected=Music">Music</a>&nbsp;&nbsp;
        <a href="abc.do?selected=Computer">Computers</a>&nbsp;&nbsp;
        <a href="cart.jsp">Cart</a>&nbsp;&nbsp;
        <a href="./Logout">Logout</a>
    </body>
</html>

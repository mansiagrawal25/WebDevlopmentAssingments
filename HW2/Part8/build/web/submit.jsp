<%-- 
    Document   : submit
    Created on : Oct 10, 2019, 2:39:59 PM
    Author     : mansiagrawal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
  background-color: honeydew;
width: 50%;
}
</style>
    </head>
    <body>
        <h1>Form</h1>
         <%--<%= request.getParameter("email") %>--%>
         <jsp:useBean id = "form1" class = "com.form.Form"> 
         <jsp:setProperty name = "form1" property = "email" param="email"/>
          <jsp:setProperty name = "form1" property = "password" param="password"/>
           <jsp:setProperty name = "form1" property = "pic" param="pic"/>
            <jsp:setProperty name = "form1" property = "gender" param="gender"/>
            <jsp:setProperty name = "form1" property = "country" param="country"/>
            <jsp:setProperty name = "form1" property = "hobby" value="${paramValues.hobby[0]},${paramValues.hobby[1]}"/>
            <jsp:setProperty name = "form1" property = "address" param="address"/>
            
         
      </jsp:useBean>
         <table style="width:100%">
  <tr>
    <th>Parameter</th>
    <th>Values</th> 
    
  </tr>
  <tr>
      <td>Email</td>
    <td><jsp:getProperty name = "form1" property = "email" /></td>
    
  </tr>
    <tr>
      <td>Password</td>
    <td><jsp:getProperty name = "form1" property = "email" /></td>
    
  </tr>
    <tr>
      <td>Picture</td>
<td>    <jsp:getProperty name = "form1" property = "pic" /></td>
    
  </tr>
    <tr>
      <td>Gender</td>
    <td><jsp:getProperty name = "form1" property = "gender" /></td>
    
  </tr>
      <tr>
      <td>Country</td>
    <td><jsp:getProperty name = "form1" property = "country" /></td>
    
  </tr>
      <tr>
      <td>Hobby</td>
    <td><jsp:getProperty name = "form1" property = "hobby" /></td>
    
  </tr>
      <tr>
      <td>Address</td>
    <td><jsp:getProperty name = "form1" property = "address" /></td>
    
  </tr>
 
</table>
    </body>
</html>

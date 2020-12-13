    <%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            h1{
                color: darkcyan;
            }
        </style>
    </head>

    <body>
        <h1> Trying to use JSTL tags </h1>
       
        <h3> The c:set and c:out example </h3>
        <c:out value="${'tags core testing'}" /> 
        
        <c:set var="testSet" value="worksFine" /><br>
        
        <h3> The c:forEach example is </h3>
        <c:forEach var="no" begin="1" end="10"> 
            <c:out value="${no}"  /> <br>
        </c:forEach>
            
       
        
       
        <h2> Formatting tags works fine </h2>
      <h3>The parse number tag example is:</h3>
        <c:set var="value" value="786.970" />  
  
        <fmt:parseNumber var="j" type="number" value="${value}" />  
        <p><i>Amount is:</i>  <c:out value="${j}" /></p>  
  
        <fmt:parseNumber var="j" integerOnly="true" type="number" value="${value}" />  
        <p><i>Amount is:</i>  <c:out value="${j}" /></p>
        
       
        
       
        
        <h3>formatDate and time example</h3>  
        
        <c:set var="Date" value="<%=new java.util.Date()%>" />  
        <p>  
            Formatted Time :  
            <fmt:formatDate type="time" value="${Date}" />  
        </p>  
        <p>  
            Formatted Date :  
            <fmt:formatDate type="date" value="${Date}" />  
        </p>  
        <p>  
            Formatted Date and Time :  
            <fmt:formatDate type="both" value="${Date}" />  
        </p>  
        <p>  
            Formatted Date and Time in short style :  
            <fmt:formatDate type="both" dateStyle="short" timeStyle="short"  
            value="${Date}" />  
        </p>  
        <p>  
            
        <h3>Parsed Date example </h3>  
        <c:set var="date" value="12-08-2016" />  
        <fmt:parseDate value="${date}" var="parsedDate"  pattern="dd-MM-yyyy" />  
         <p><c:out value="${parsedDate}" /></p>      
            
          
        
        
       
  
      

    
        
        <h2>  Function tags </h2>
        
         <h3> split example </h3>
        <c:set var="str1" value="First-example-for-function string."/>
        <c:set var="str2" value="${fn:split(str1, '-')}" />  
        <c:set var="str3" value="${fn:join(str2, ' ')}" />  

        <p>String-3 : ${str3}</p>  
        
        <c:set var="str4" value="${fn:split(str3, ' ')}" />  
        <c:set var="str5" value="${fn:join(str4, '-')}" />  

        <p>String-5 : ${str5}</p> 
        
        <h3> contains example </h3>
        <c:set var="String" value="example"/>  
  
        <c:if test="${fn:contains(String, 'ample')}">  
            <p>Found string<p>  
        </c:if>  
  
        <c:if test="${fn:contains(String, 'lala')}">  
            <p>Found string<p>  
        </c:if>
                
                
        <h3> indexOf example </h3>
        <c:set var = "string1" value = "lab assignment two."/>
        <c:set var = "string2" value = "homework assignment two.</abc>"/>
        <p>Index (1) : ${fn:indexOf(string1, "lab")}</p>
        <p>Index (2) : ${fn:indexOf(string2, "two")}</p>
        
        
           
        <h2> XML tags </h2>
        <h3> The parse tag and out tag example </h3>
        <c:set var="character">  
        <characters>  
            <character>  
              <name>harry</name>  
              <time>1</time>  
            </character>  
         <character>  
              <name>ron</name>  
              <time>2</time>  
            </character>  
         <character>  
              <name>hermoine</name>  
              <time>3</time>  
            </character>  
        </characters>  
        </c:set>  
        <x:parse xml="${character}" var="output"/>  
        <b>Name of the character is</b>:  
        <x:out select="$output/characters/character[1]/name" /><br>  
        <b>time of the hermoine is</b>:  
        <x:out select="$output/characters/character[2]/time" /> 
        
        
        <h2> Sql Tags</h2>
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://newton.neu.edu:3306/usersdb"  
     user="student"  password="p@ssw0rd"/>  
        <sql:query dataSource="${db}" sql="select * from usersdb.users;" var="rs" />
        
        <sql:update dataSource="${db}" var="count">  
INSERT INTO users VALUES (5000,'Mansi', 'Agrawal', 'agrawal.ma@husky.neu.edu');  
</sql:update>  
      <table border="1">
            <tr>
                <th>User ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
            </tr>
            <c:forEach items="${rs.rows}" var="user">
                <tr>
                    <td>${user.userId}</td>
                    <td>${user.lname}</td>
                    <td>${user.fname}</td>
                    <td>${user.email}</td>
                </tr>
            </c:forEach>
        </table>
   
        
        
    </body>
</html>

<%-- 
    Document   : browsepage
    Created on : 17 Oct, 2019, 4:13:08 PM
    Author     : Mansi Agrawal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>browsepage</title>
    </head>
    <body>
        <h1>Search Movies</h1>
        <form name='search' action="browse.htm">
               KeyWord:   <input type="text" name="keyword"  /><br/><br/>
                <input type="radio" name="search"  value="name" /> Search by Title<br/><br/>                
                <input type="radio" name="search"  value="actor" /> Search by Actor<br/><br/>
                <input type="radio" name="search"  value="actress" /> Search by Actress<br/><br/>  
                <input type="radio" name="search"  value="genre" /> Search by Genre<br/><br/>
                <input type="radio" name="search"  value="year" /> Search by Year<br/><br/>
                <input type="hidden" name="action" value="fetch" />
                <input type="submit" value="Search" />
            </form>
    </body>
</html>

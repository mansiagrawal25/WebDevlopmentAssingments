<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>    
    <head>        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <style>
            .dropbtn {
               
                
                padding: 16px;
                font-size: 16px;
                border: none;
            }

            .dropdown {
                position: relative;
                display: inline-block;
            }

            .dropdown-content {
                display: none;
                position: absolute;
                
                min-width: 160px;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;
            }

            .dropdown-content a {
                color: black;
                padding: 12px 16px;
                text-decoration: none;
                display: block;
            }

            .dropdown-content a:hover {}

            .dropdown:hover .dropdown-content {
                display: block;
            }

            .dropdown:hover .dropbtn {
                
            }
</style>
    </head>

    <body>
        <h1>My Movie Store!</h1>        
            <div class="dropdown">
            <button class="dropbtn">Please Make your selection here</button>
            <div class="dropdown-content">
            <a href="add.htm">Add Movies</a>
            <a href="browse.htm?action=browse">Browse Movies</a>  
            <a href="result.htm">Result</a>
            </div>
          </div>
    </body>
</html>

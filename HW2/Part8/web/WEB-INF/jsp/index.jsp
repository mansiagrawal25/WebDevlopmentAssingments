<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <style>
                    button{
                        color: red;
                    }
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
  background-color: floralwhite;
  width: 500px;
  height: 50px;
  
}
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=submit] {
  width: 35%;
  background-color: crimson;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
input[type=submit]:hover {
  background-color: #45a049;
}
</style>
    </head>

    <body>
        <h1>Form</h1>
        <!--<a href="submit.jsp">Display</a>-->
        <form action="submit.jsp" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td> Email </td>
                        <td><input type="text" name="email" value=""></td>
                    </tr>
                    <tr>
                        <td> Password </td>
                        <td><input type="text" name="password" value=""></td>
                    </tr>
                    <tr>
                        <td> Confirm Password </td>
                        <td><input type="text" name="cpassword" value=""></td>
                    </tr>
                    <tr>
                        <td> Upload your Picture </td>
                        <td><input type="file" name="pic" accept="image/gif, image/jpeg, image/png"></td>
                        
                        
                    </tr>
                    <tr>
                        <td> Gender </td>
                        <td><input type="radio" name="gender" value="Male"> MALE
                            <input type="radio" name="gender" value="Female">FEMALE
                        </td>
                    </tr>
                    <tr>
                        <td> Country </td>
                                <td><select name="country">
                                        <option name="country" value="United Kingdom">United Kingdom</option>
                                        <option name="country" value="United States">United States</option>
                                        <option name="country" value="India">India</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td> Hobby </td>
                        <td><input type="checkbox" name="hobby" value="Cricket">Cricket
                            <input type="checkbox" name="hobby" value="Football">Football
                            
                        </td>
                    </tr>
                    <tr>
                        <td> Address </td>
                        <td><input type="text" name="address" value="" </td>
                    </tr>
                    <tr>
                        
                           
                    
                    </tr>
                    
                </tbody>
                
            </table>
           <input type="submit" value="submit" />
            
        </form>
    </body>
</html>

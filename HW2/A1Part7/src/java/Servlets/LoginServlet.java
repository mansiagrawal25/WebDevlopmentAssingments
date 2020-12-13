/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mansiagrawal
 */
public class LoginServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        String action = request.getParameter("action");
        
        if (action.equals("login")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            if (username.equals("admin") && password.equals("admin")) {
                System.out.println("here in login");
                session.setAttribute("username", username);
                
                Cookie nameCookie = new Cookie("username", username);
                Cookie passwordCookie = new Cookie("password", password);
                
                nameCookie.setMaxAge(7 * 24 * 60 * 60);
                passwordCookie.setMaxAge(7 * 24 * 60 * 60);
                response.addCookie(nameCookie);
                response.addCookie(passwordCookie);
                
                response.sendRedirect("sidebar.jsp");
            }else {
                response.sendRedirect("sidebar.jsp");
            }
        }else if(action.equals("logout")){
            Cookie nameCookie = new Cookie("username", null);
            Cookie passwordCookie = new Cookie("password", null);
            
            nameCookie.setMaxAge(0);
            passwordCookie.setMaxAge(0);
            response.addCookie(nameCookie);
            response.addCookie(passwordCookie);
            session.invalidate();
            
            response.sendRedirect("index.jsp");
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String[] values = request.getParameterValues("rememberMe");
        if (values != null && !values[0].isEmpty()) {
            String username = request.getParameter("username");
        }
        
        HttpSession session = request.getSession(false);
        String action = request.getParameter("action");
        System.out.println("here in post");
        if (action.equals("login")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            if (username.equals("admin") && password.equals("admin")) {
                session.setAttribute("username", username);
                
                Cookie nameCookie = new Cookie("username", username);
                Cookie passwordCookie = new Cookie("password", password);
                
                nameCookie.setMaxAge(7 * 24 * 60 * 60);
                passwordCookie.setMaxAge(7 * 24 * 60 * 60);
                response.addCookie(nameCookie);
                response.addCookie(passwordCookie);
                
                response.sendRedirect("sidebar.jsp");
            }else {
                response.sendRedirect("index.jsp");
            }
        }else if(action.equals("logout")){
            Cookie nameCookie = new Cookie("username", null);
            Cookie passwordCookie = new Cookie("password", null);
            
            nameCookie.setMaxAge(0);
            passwordCookie.setMaxAge(0);
            response.addCookie(nameCookie);
            response.addCookie(passwordCookie);
            session.invalidate();
            
            response.sendRedirect("index.jsp");
        }
    }
}

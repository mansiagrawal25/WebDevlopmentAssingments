/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Beans.Items;
import java.io.IOException;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

/**
 *
 * @author mansiagrawal
 */
public class Controller extends HttpServlet {
    List<Items> items;
    @Override
    public void init() {
    items = new ArrayList<>();
    Items i = new Items();
    i.setItem_name("Java Servlet Programming");
    i.setItem_cost((float) 29.95);
    i.setItem_type("Books");
    items.add(i);
    Items i1 = new Items();
    i1.setItem_name("Oracle Database Programming");
    i1.setItem_cost((float) 48.95);
    i1.setItem_type("Books");
    items.add(i1);
    Items i2 = new Items();
    i2.setItem_name("System Analysis and Design with UML");
    i2.setItem_cost((float) 14.95);
    i2.setItem_type("Books");
    items.add(i2);
    Items i3 = new Items();
    i3.setItem_name("Object Oriented Software Engineering");
    i3.setItem_cost((float) 35.99);
    i3.setItem_type("Books");
    items.add(i3);
    Items i4 = new Items();
    i4.setItem_name("Java Web Services");
    i4.setItem_cost((float) 27.99);
    i4.setItem_type("Books");
    items.add(i4);
    Items i5 = new Items();
    i5.setItem_name("I'm going to tell you a secret by madonna");
    i5.setItem_cost((float) 26.99);
    i5.setItem_type("Music");
    items.add(i5);
    Items i6 = new Items();
    i6.setItem_name("Baby one more time by Britney Spears");
    i6.setItem_cost((float) 10.95);
    i6.setItem_type("Music");
    items.add(i6);
    Items i7 = new Items();
    i7.setItem_name("Justified by Justin Timberlake");
    i7.setItem_cost((float) 9.97);
    i7.setItem_type("Music");
    items.add(i7);
    Items i8 = new Items();
    i8.setItem_name("Loose by Nelly Furtado");
    i8.setItem_cost((float) 13.98);
    i8.setItem_type("Music");
    items.add(i8);
    Items i9 = new Items();
    i9.setItem_name("Gold Digger by Kanye West");
    i9.setItem_cost((float) 27.99);
    i9.setItem_type("Music");
    items.add(i9);
    Items i10 = new Items();
    i10.setItem_name("Apple MacBook Pro with 13.3' Display");
    i10.setItem_cost((float) 1299.99);
    i10.setItem_type("Computer");
    items.add(i10);
    Items i11 = new Items();
    i11.setItem_name("Asus Laptop with Centrino 2 Black");
    i11.setItem_cost((float) 949.95);
    i11.setItem_type("Computer");
    items.add(i11);
    Items i12 = new Items();
    i12.setItem_name("HP Pavillion Laptop with Centrino 2 DV7");
    i12.setItem_cost((float) 1199.95);
    i12.setItem_type("Computer");
    items.add(i12);
    Items i13 = new Items();
    i13.setItem_name("Toshiba Laptop with Centrino 2 - Copper");
    i13.setItem_cost((float) 899.99);
    i13.setItem_type("Computer");
    items.add(i13);
    Items i14 = new Items();
    i14.setItem_name("Sony VAIO Laptop with Core 2 Duo Cosmopoiltian Pink");
    i14.setItem_cost((float) 779.99);
    i14.setItem_type("Computer");
    items.add(i14);
    }
    protected void abc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Set<Items> items1 = null;
        Set<Items> cart = (HashSet<Items>)session.getAttribute("cart");
        if(cart == null) {
            session.setAttribute("cart", new HashSet<Items>());
        }
        String selected = request.getParameter("selected");
        if (selected.equals("login")) {
            response.sendRedirect("home.jsp");
        } 
        else if (selected.equals("logout")) {
            session.invalidate();
            response.sendRedirect("index.jsp");
        }
        else if(selected.equals("Books")) {
            items1 = new HashSet<Items>();
            for(Items it :items) {
                if(it.getItem_type().equals("Books")) {
                    items1.add(it);
                }  
            }
            request.setAttribute("Books", items1);
            RequestDispatcher rd = request.getRequestDispatcher("/books.jsp");
            rd.forward(request, response);
        }
        else if(selected.equals("Music")) {
            items1 = new HashSet<Items>();
            for(Items it :items) {
                if(it.getItem_type().equals("Music")) {
                    items1.add(it);
                }
            }
            request.setAttribute("Music", items1);
            RequestDispatcher rd = request.getRequestDispatcher("/music.jsp");
            rd.forward(request, response);
        }
        else if(selected.equals("Computer")) {
            items1 = new HashSet<Items>();
            for(Items it :items) {
                if(it.getItem_type().equals("Computer")) {
                    items1.add(it);
                }
            }
            request.setAttribute("Computer", items1);
            RequestDispatcher rd = request.getRequestDispatcher("/computers.jsp");
            rd.forward(request, response);
        }
        else if(selected.equals("add")) {
            String[] id = request.getParameterValues("id");
            for(String a: id) {
                for(Items it: items) {
                    if(it.getItem_id()== Integer.parseInt(a)) {
                        cart.add(it);
                    }
                }
            }
            RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
            rd.forward(request, response);
        }
        else if(selected.equals("remove")) {
            String d = request.getParameter("id");
           
            for(Items it: items) {
                int a= it.getItem_id();
                int b=Integer.parseInt(d);
                if(it.getItem_id()== Integer.parseInt(d)) {
                    cart.remove(it);
                }
            }
            RequestDispatcher rd = request.getRequestDispatcher("/cart.jsp");
            rd.forward(request, response);
        }
    }
    @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        abc(request, response);
    }
@Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        abc(request, response);
    }
        @Override
        public String getServletInfo() {
        return "Short description";
    }
}

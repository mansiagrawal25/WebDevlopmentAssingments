/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xlsload.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author mansiagrawal
 */
public class XLSServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet XLSServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet XLSServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            if(request.isUserInRole("AdminRole"))
            {
            PrintWriter out = response.getWriter();
            String filename = (String) request.getParameter("filename");
            String extension = "xls";
          //  String directory = "C:\\Users\\Saloni\\Documents\\NetBeansProjects\\Assignment2_Part6\\";
            String directory = "/Users/mansiagrawal/Downloads/HW3_P7/";
            FileInputStream file;
            file = new FileInputStream(new File(directory + filename + "." + extension));
            HSSFWorkbook excelfile = new HSSFWorkbook(file);
            HSSFSheet currSheet = excelfile.getSheetAt(0);
            //Iterator<Row> rowIterator = currSheet.iterator();
            DataFormatter reformat = new DataFormatter();

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Assignment2_Part6</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p> File name: " + filename + "." + extension + "</p>");
            out.println("<table border = '1' style='width:100%'>");

           
            for (Row row : currSheet) {
                out.println("<tr>");
                for (Cell cell : row) {
                    out.println("<td>" + reformat.formatCellValue(cell) + "</td>");
                }
                out.println("</tr>");
            }

            out.println("</table></body>");
            out.println("</html>");
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

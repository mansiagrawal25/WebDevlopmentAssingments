/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.controller;

import com.me.dao.XLSDao;
import com.me.pojo.Store;
import static java.lang.System.out;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author mansiagrawal
 */
public class LoadXlsController extends AbstractController {
    
    public LoadXlsController() {
    }
    @Override
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
         ModelAndView mv = null;
            // HttpSession session = request.getSession(false);
        try {
            if(request.isUserInRole("AdminRole"))
            {
                String fpath = request.getParameter("filePath");
                System.out.println("File Name -----------" + fpath);
                
                List<Store> storeList = new XLSDao().getStoreData(fpath);
                System.out.println("Size --- of XLS -- " + storeList.size());
                
                 request.setAttribute("xlsdata", storeList);
                 request.setAttribute("filePath", fpath);
                 mv = new ModelAndView("csvOutput");
    
                  request.setAttribute("xlsdata", storeList);
                  request.setAttribute("filePath", fpath);
                  mv = new ModelAndView("storeOutput");
    }
            else if(request.isUserInRole("UserRole")){
                 out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet XLSServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet XLSServlet at </h1>");
            out.println("</body>");
            out.println("</html>");
            }
        }
        catch (Exception e) {
            System.out.println("Error :" + e);
        }
        return mv;
         }
}

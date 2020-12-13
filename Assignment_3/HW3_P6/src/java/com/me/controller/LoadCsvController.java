/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.controller;

import com.me.dao.CSVDao;
import com.me.pojo.CSVClass;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author deeptinigam
 */
public class LoadCsvController extends AbstractController {
    
    public LoadCsvController() {
    }
    @Override
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
         
             ModelAndView mv = null;
            // HttpSession session = request.getSession(false);
        try {
                String fpath = request.getParameter("filePath");
                System.out.println("File Name -----------" + fpath);
                
                List<CSVClass> dataList = new CSVDao().getCSVData(fpath);
                System.out.println("Size --- of CSV -- " + dataList.size());
                
                 request.setAttribute("csvdata", dataList);
                 request.setAttribute("filePath", fpath);
                 mv = new ModelAndView("csvOutput");
              //  mv = new ModelAndView("csvOutput","csvdata",dataList);
           
        

        } catch (Exception e) {
            System.out.println("Error :" + e);
        }
        return mv;
         }
    
}

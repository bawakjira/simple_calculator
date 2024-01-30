/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
public class CalServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param req
     * @param res
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out=res.getWriter();
         double a =Integer.parseInt(req.getParameter("t1"));
        double b =Integer.parseInt(req.getParameter("t2"));
        double c= 0;
        String op =req.getParameter("btn");
        if(op.equals("+"))
            c=a+b;
        else if(op.equals("-"))
             c=a-b;
        else if(op.equals("*"))
             c=a*b;
        else if(op.equals("/"))                                   
             c=a/b;
        out.println("<b>"+a+op+b+"="+c+"<b>");
    }

}

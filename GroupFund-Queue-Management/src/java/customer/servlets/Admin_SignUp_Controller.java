/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer.servlets;

import database.UserExistsException;
import database.admin.InsertAdmin;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
public class Admin_SignUp_Controller extends HttpServlet {

    

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
            
            String userName = request.getParameter("username");
            String fullName = request.getParameter("fullname");
            
            // To allow parsing from the parameters.
            // TODO find a better/ cleaner way.
            String tempString = request.getParameter("country");
            int countryCode = Integer.parseInt(tempString);
            tempString = request.getParameter("state");
            int stateCode = Integer.parseInt(tempString);
            tempString = request.getParameter("branch");
//            System.out.println("Yes 2");
            int branchCode = Integer.parseInt(tempString);
            String password = request.getParameter("pass");
            
            InsertAdmin insertadmin = new InsertAdmin();
            insertadmin.setData(fullName, countryCode, stateCode, branchCode, userName, password);
//            System.out.println("Yes 4");
            out.println("SUCCESSFULLY SIGNED UP!");
            
//           RequestDispatcher rd = getServletContext().getRequestDispatcher("/acc2.html");
//           rd.include(request, response);
            response.sendRedirect("acc2.html"); 
//           System.out.println("Yes 4");
           
        }
        catch (SQLException ex) {
            Logger.getLogger(Admin_SignUp_Controller.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (UserExistsException ex) {
        Logger.getLogger(Admin_SignUp_Controller.class.getName()).log(Level.SEVERE, null, ex);
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

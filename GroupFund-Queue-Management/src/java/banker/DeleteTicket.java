/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banker;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DeleteTicket extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        if(request.getParameter("ticket").toString().equalsIgnoreCase("view"))
        {
            String x = banker.BankerOperations.getFirstTicket();
            request.setAttribute("view", x);
        }
        if(request.getParameter("ticket").toString().equalsIgnoreCase("delete"))
        {
            int y = banker.BankerOperations.deleteTicket();
            request.setAttribute("delete", y);
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}// </editor-fold>

    
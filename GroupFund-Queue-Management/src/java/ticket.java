/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADMIN
 */
public class ticket extends HttpServlet {

    int i;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try{
      String c = request.getParameter("name");
      
      
            HttpSession session = request.getSession();
      String str= null;
      switch(c)    
          {
              case "deposit": 
              { 
                  i = (Integer)((session.getAttribute("token")) == null ? 101:session.getAttribute("token"));
                  str = "D"+i;
                      session.setAttribute("token", ++i);
                  break;
              }
              
              case "withdraw": 
              { i = (Integer)((session.getAttribute("token1")) == null ? 101:session.getAttribute("token1"));
                  str = "W"+i;
                      session.setAttribute("token1", ++i);
              break;
              }
                      case "passbook": 
              { i = (Integer)((session.getAttribute("token2")) == null ? 101:session.getAttribute("token2"));
                  str = "P"+i;
                      session.setAttribute("token2", ++i);
                      break;
              }
              case "loan": 
              { i = (Integer)((session.getAttribute("token3")) == null ? 101:session.getAttribute("token3"));
                  str = "LF"+i;
                      session.setAttribute("token3", ++i);
                      break;
              }
              case "debit_credit_card": 
              { i = (Integer)((session.getAttribute("token4")) == null ? 101:session.getAttribute("token4"));
                  str = "DC"+i;
                      session.setAttribute("token4", ++i);
                      break;
              }
              case "rtgs_neft": 
              { i = (Integer)((session.getAttribute("token5")) == null ? 101:session.getAttribute("token5"));
                  str = "R"+i;
                      session.setAttribute("token1", ++i);
                      break;
              }
            }
      banker.BankerOperations.arrayListQueue.add(str);
      out.write(str);
//      RequestDispatcher rd = request.getRequestDispatcher("/custo.jsp");
//      request.setAttribute("name",str);
//      rd.forward(request, response);
      }catch(Exception e){
          response.getWriter().write(""+e);
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

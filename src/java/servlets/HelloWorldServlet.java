
package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 808735
 */
public class HelloWorldServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      getServletContext().getRequestDispatcher("/WEB-INF/helloworldForm.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String firstName=request.getParameter("firstname");
       String lastName=request.getParameter("lastname");
       
       request.setAttribute("firstname", firstName);
       request.setAttribute("lastname", lastName);
       
       
       getServletContext().getRequestDispatcher("/WEB-INF/sayHello.jsp").forward(request, response);
       
       
    }

  
   
}

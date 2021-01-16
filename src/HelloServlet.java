import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
          
        //String path = "/index.html";
        //ServletContext servletContext = getServletContext();
        //RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        //requestDispatcher.forward(request, response);
        
        String path = "/notfound";
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);
    }
}
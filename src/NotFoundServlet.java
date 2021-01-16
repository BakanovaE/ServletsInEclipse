import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
@WebServlet("/notfound")
public class NotFoundServlet extends HttpServlet {
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
          
    	String message = getServletContext().getInitParameter("message");
        
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        
        writer.println("<h2>" + message+ "</h2>");
        
        writer.close();
    }
}
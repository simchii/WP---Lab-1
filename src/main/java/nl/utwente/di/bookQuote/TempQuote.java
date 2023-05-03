package nl.utwente.di.bookQuote;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

/** Example of a Servlet that gets an ISBN number and returns the book price
 */


public class TempQuote extends HttpServlet {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Quoter quoter;
	
    public void init() throws ServletException {
    	quoter = new Quoter();
    }	
	
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String title = "Temp Quote";
    
    // Done with string concatenation only for the demo
    // Not expected to be done like this in the project
    out.println("<!DOCTYPE HTML>\n" +
                "<HTML>\n" +
                "<HEAD><TITLE>" + title + "</TITLE>" +
                "<LINK REL=STYLESHEET HREF=\"styles.css\">" +
                		"</HEAD>\n" +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1>" + title + "</H1>\n" +              
                "  <P>Temperature in Celsius: " +
                   request.getParameter("temp") + "\n" +
                "  <P>Temperature in Fahrenheit: " +
                   quoter.transformTemperature(request.getParameter("temp")) +
                "</BODY></HTML>");
  }
}

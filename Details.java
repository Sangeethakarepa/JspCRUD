

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Details")
public class Details extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	response.setContentType("text/html");
	
	PrintWriter out=response.getWriter();
	
	HttpSession session=request.getSession();
	
	String user=(String)session.getAttribute("user");
	out.println("<body bgcolor='#E3A093'>");	
	out.println("<h2 align='right'><marquee direction='right'>Hello:"+user+"</marquee></h2>");
	out.println("<hr color=red size=5>");
	out.println("<br><br><b>Your Session Id:"+session.getId());
	out.println("<table>");
	out.println("<center>");
	out.println("<br><br><div><img src='images/1.jpg' width=300 height=200 /></div>");
	out.println("<p><b>ID:S171174100001 </b></p>");
	out.println("<p><b>Name         : Krish_MKS</b></p>");
	out.println("<p><b>Profession   : Artist</b></p>");
	out.println("<p><b>Remuniration : 100000/-</b></p></table>");
	out.println("</center>");	
	
	out.println("<h2 align='right'><a href='ShortFilms'>Next Page</a></h2>");
			
	
	
	}

}

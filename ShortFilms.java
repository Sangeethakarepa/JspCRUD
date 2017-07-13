

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/ShortFilms")
public class ShortFilms extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		
		String user=(String)session.getAttribute("user");
		
		out.println("<body bgcolor='#9E1B01'>");	
		out.println("<h2 align='right'><marquee direction='right'>Hello:"+user+"</marquee></h2>");
		out.println("<hr color='yellow' size=5>");
		out.println("<br><br><b>Your Session Id:"+session.getId());
		out.println("<table>");
		out.println("<center>");
		out.println("<br><br><br><img src='images/5.jpg' height=400 width=800/>");
		out.println("<p><b>ID:S171174100001 </b></p>");
		out.println("<ul>");
		out.println("<li><b>Siri</b></li>");
		out.println("<li><b>Smile</b></li>");
		out.println("<li><b>Massacre</b></li>");
		out.println("<li><b>I Wanna Follow Follow you</b></li>");
		out.println("<li><b>Padhilam</b></li></table>");
		out.println("</center>");
		
		session.invalidate();
		
		
		out.println("<h2 align='right'><a href='index2.html'>Session Out</a></h2>");
				
	}

}



import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Validate")
public class Validate extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");	
		
		String name=request.getParameter("user");
		String pass=request.getParameter("pass");
		
		if(pass.equals("krish"))
		{
			HttpSession session=request.getSession();
			session.setAttribute("user", name);
			response.sendRedirect("Details");
			
		}
	
	}

}

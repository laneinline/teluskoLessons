package site.laneinline;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1831973239L;
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i +j;
		
		//PrintWriter out = res.getWriter();
		//out.println("Result is: " + k);
		
		res.sendRedirect("sqr");
		
		//req.setAttribute("k", k);
		
		//RequestDispatcher rd = req.getRequestDispatcher("sqr");
		//rd.forward(req, res);
	}
}

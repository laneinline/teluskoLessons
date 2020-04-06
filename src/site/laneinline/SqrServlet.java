package site.laneinline;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqrServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException  {
		
		int k = (int) req.getAttribute("k");
		
		k*=k;
		//second test for sendRedirect
		PrintWriter out = res.getWriter();
		out.println("Resalt of adding and then sum^2 is: " + k);
	}
}

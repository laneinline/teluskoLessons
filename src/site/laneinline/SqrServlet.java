package site.laneinline;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqrServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException  {
		
		int k = Integer.parseInt(req.getParameter("k"));
		
		k*=k;
		//test for send redirect brunch
		PrintWriter out = res.getWriter();
		out.println("Resalt of adding and then sum^2 is: " + k);
	}
}

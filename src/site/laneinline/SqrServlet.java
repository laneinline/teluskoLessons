package site.laneinline;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/sqr")
public class SqrServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException  {
		
		HttpSession sqrSession = req.getSession();
		
		int k = (int) sqrSession.getAttribute("k");
		//int k = Integer.parseInt(req.getParameter("k"));
		
		k*=k;
		
		
		//test for send redirect brunch
		PrintWriter out = res.getWriter();
		out.println("Resalt of adding and then sum^2 is: " + k);
	}
}

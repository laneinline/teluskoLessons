package site.laneinline;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqrServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException  {
		
		PrintWriter out = res.getWriter();
		int k = 0;
		
		
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c: cookies) {
			
			out.println("Cookie " + c.getName());
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		
		HttpSession sqrSession = req.getSession();

		
		k*=k;
		
		
		//test for send redirect brunch

		out.println("Resalt of adding and then sum^2 is: " + k);
	}
}

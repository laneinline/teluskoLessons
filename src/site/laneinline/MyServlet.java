package site.laneinline;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 123452345L;

	public void service(HttpServletRequest request, HttpServletResponse responce ) throws IOException {
		
		PrintWriter outPrintWriter =responce.getWriter();
		outPrintWriter.print("Hi ");
		
		ServletContext ctx =getServletContext();

		outPrintWriter.println(	ctx.getInitParameter("phone"));
		
	}
}


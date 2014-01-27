package ua.gb.shoppinglist;



import java.io.IOException;  
import java.io.PrintWriter;  


/**
 * Підключити зовнішню бібліотеу до c:\Tomcat_v7_0\lib\servlet-api.jar 
 */
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  


public class HelloWorld extends HttpServlet {
	public void doGet(HttpServletRequest request, 
		HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String docType =
		"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
		"Transitional//EN\">\n";
		out.println(docType +
			"<HTML>\n" +
			"<HEAD><TITLE>Assa Hello, World! ! ! ! !</TITLE></HEAD>\n" +
			"<BODY>\n" +
			"<H1>RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRHello, World!</H1>\n" +
			"</BODY></HTML>");
	}
}


//
//<!DOCTYPE web-app PUBLIC
//"-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
//"http://java.sun.com/dtd/web-app_2_3.dtd" >
//
//<web-app>
// <display-name>Archetype Created Web Application</display-name>
//</web-app>



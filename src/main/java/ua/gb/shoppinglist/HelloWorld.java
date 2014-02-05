package ua.gb.shoppinglist;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Deprecated
public class HelloWorld extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<SortableObject> list_vasja = new ArrayList<SortableObject>();

		{SortableObject obj = new SortableObject(5 , "Value c");
		list_vasja.add(obj);}
		{SortableObject obj = new SortableObject(5 , "Value b");
		list_vasja.add(obj);}
		{SortableObject obj = new SortableObject(5 , "Value a");
		list_vasja.add(obj);}
		{SortableObject obj = new SortableObject(7 , "Value a");
		list_vasja.add(obj);}
		{SortableObject obj = new SortableObject(9 , "Value 14");
		list_vasja.add(obj);}
		{SortableObject obj = new SortableObject(9 , "Value 10");
		list_vasja.add(obj);}
		{SortableObject obj = new SortableObject(3 , "Value 10");
		list_vasja.add(obj);}
		{SortableObject obj = new SortableObject(2 , "Value 10");
		list_vasja.add(obj);}	
		{SortableObject obj = new SortableObject(5 , "Value 16");
		list_vasja.add(obj);}
		{SortableObject obj = new SortableObject(5 , "Value 12");
		list_vasja.add(obj);}
		{SortableObject obj = new SortableObject(3 , "Value 11");
		list_vasja.add(obj);}		

		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String docType =
				"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
						"Transitional//EN\">\n";
		out.println(docType +
				"<HTML>\n" +
				"<HEAD><TITLE>Assa Hello, World! ! ! ! !</TITLE></HEAD>\n" +
				"<BODY>\n" +
				"<H1>Hello, World! </H1>\n" 
				);
		out.println("�� ���������� / List ��������<br>");
		for (SortableObject tmp : list_vasja) {
			out.println(tmp + "<br>");
		}
		Collections.sort(list_vasja, SortableObjectComparator.IdAscComparator);
		
		out.println("����� ���������� / List �������� �� Id<br>");
		for (SortableObject tmp : list_vasja) {
			out.println(tmp + "<br>"); 
		}		
		out.println("</BODY></HTML>");
	}
			 
//	    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	        getServletContext().getRequestDispatcher("/hello.jsp").forward(req, resp);
//	    }
}



package project1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChoiceServlet
 */
public class ChoiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ChoiceServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=request.getParameter("s1");
		if(s1.equals("GreaterValue"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("greater");
			rd.forward(request, response);
		}
		else if(s1.equals("SmallerValue"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("smaller");
			rd.forward(request, response);
		}
		else if(s1.equals("Add"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("add");
			rd.forward(request, response);
		}
		else if(s1.equals("Mul"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("mul");
			rd.forward(request, response);
		}
		else if(s1.equals("Sub"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("sub");
			rd.forward(request, response);
		}
		else if(s1.equals("Div"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("div");
			rd.forward(request, response);
		}
		else 
		{
			RequestDispatcher rd=request.getRequestDispatcher("moddiv");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

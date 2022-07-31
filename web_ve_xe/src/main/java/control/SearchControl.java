package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.digitalDAO;
import entity.trip;

/**
 * Servlet implementation class SearchControl
 */
@WebServlet(name = "SearchControl", urlPatterns= {"/search"})
public class SearchControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String routeFrom= request.getParameter("routeFrom");
		String routeTo= request.getParameter("routeTo");
		System.out.println(routeFrom);
		String timeFrom= request.getParameter("timeFrom");
		digitalDAO dao = new digitalDAO();
		List<trip> list = dao.searching(routeFrom,routeTo,timeFrom);
	
		request.setAttribute("listA", list);
		request.getRequestDispatcher("ShowInf.jsp").forward(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.processRequest(request, response);
	}

	


	
	

}

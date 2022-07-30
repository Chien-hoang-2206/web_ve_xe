package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;
import entity.ticket;

/**
 * Servlet implementation class InFoPayUserControl
 */
@WebServlet("/infopay")
public class InFoPayUserControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InFoPayUserControl() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
    	response.setContentType("text/html;charset=UTF-8");
    	request.setCharacterEncoding("utf-8");
    	String nameuser =  request.getParameter("nameuser");
    	String phone =  request.getParameter("phone");
    	String email =  request.getParameter("email");
    	String note =  request.getParameter("note");
    	int payment= Integer.parseInt(request.getParameter("payment"));
    	// tao thong tin ticket khach
	    DAO dao = new DAO();
	    dao.signupQuess(nameuser, phone, email);
	    int userId =  dao.getUserIdQuess( phone, email);
	    HttpSession session=request.getSession();
	    session.getAttribute("trip");
	    System.out.println(session.getAttribute("trip"));
	    
	    
//	   ticket t = new ticket(userId, carid , payment, userId);
	    
//    		request.setAttribute("tripdetail", p);
   		request.getRequestDispatcher("TicketDetal.jsp").forward(request, response);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.processRequest(request, response);
	}
	

}

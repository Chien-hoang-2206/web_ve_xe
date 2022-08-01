package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;
import entity.TicketManagement;
import entity.ticket;
import entity.trip;

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
    	int userId ;
//    	int  pay =  Integer.parseInt(request.getParameter("payment"));
    	// tao thong tin ticket khach
	    DAO dao = new DAO();
	    dao.signupQuess(nameuser, phone, email);
	    userId =  dao.getUserIdQuess( phone, email);
	   
	    HttpSession session=request.getSession();
	    trip t= (trip)session.getAttribute("trip");
	    
        int carid = dao.getCarIdByTripId(t.getTripID());
        int timeid = dao.getTimeIdByTripId(t.getTripID());
	    int routeid = dao.getRouteIdByTripId(t.getTripID());
	    ticket tff = new ticket(userId, carid, 4, routeid, timeid);
	    
	    dao.signupTicket(tff);
	    String ticketid  = Integer.toString( dao.getTicketIdSignUp()) ;
//	    System.out.println(ticketid + "  dfdidhf  " + phone);
//	    
//	    ticket ticketDetal = new Tic
	   
//	    session.setAttribute("ticketDetal",tff);
	    request.setAttribute("ticketid",ticketid);
	   
//	    System.out.println("car id "+  carid + " time id " + timeid + "user id " + userId + "trip id "  + "PAYMENT"   );
	    
   		request.getRequestDispatcher("TicketDetail.jsp").forward(request, response);
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

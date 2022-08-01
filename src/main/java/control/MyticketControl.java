package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;
import entity.Account;
import entity.TicketManagement;
import entity.trip;

/**
 * Servlet implementation class myticket
 */
@WebServlet("/myticket")
public class MyticketControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyticketControl() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
	    HttpSession session=request.getSession();
	    int userID; 
	    Account acc= (Account)session.getAttribute("acc");
        DAO dao = new DAO();
        userID = acc.getId();
        List <TicketManagement> listTicketDetal = dao.findTicketByUserID(userID);
        System.out.println(listTicketDetal);
        if (listTicketDetal == null) {
        	request.setAttribute("mess","Bạn chưa mua vé xe nào cả");
        	request.getRequestDispatcher("FindTicket.jsp").forward(request, response);
        }else {
        	request.setAttribute("listTicketDetal", listTicketDetal);
        	request.getRequestDispatcher("Ticketinfo.jsp").forward(request, response);
        }
        
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
		doGet(request, response);
	}

}

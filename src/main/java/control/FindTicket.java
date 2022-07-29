package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import entity.Account;
import entity.TicketManagement;

/**
 * Servlet implementation class TicketSearch
 */
public class FindTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindTicket() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String ticket_ID= request.getParameter("ticketID");
        String phone = request.getParameter("phone");
        DAO dao = new DAO();
        TicketManagement ticketDetal = dao.findTicket(ticket_ID, phone);
        if (ticketDetal == null) {
        	request.setAttribute("mess","Sai mã vẽ hoặc số điện thoại");
        	request.getRequestDispatcher("FindTicket.jsp").forward(request, response);
        }else {
        	request.setAttribute("ticketDetal", ticketDetal);
        	request.getRequestDispatcher("TicketDetal.jsp").forward(request, response);
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
		this.processRequest(request, response);
	}

}

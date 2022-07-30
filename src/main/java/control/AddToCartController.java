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
import entity.Cart;
import entity.trip;

@WebServlet("/AddToCartController")
public class AddToCartController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void processRequest(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
    	response.setContentType("text/html;charset=UTF-8");
    	HttpSession session=request.getSession();
    	Cart cart=null;
    	Object o= session.getAttribute("cart");
    	if(o!=null) {
    		cart=(Cart)o;
    	}else {
    		cart= new Cart();
    	}
//    		String tamid=request.getParameter("id");
    		int id=2;
//    		id=Integer.parseInt(tamid);

    		DAO dao = new DAO();
    		cart.setTrips( dao.getAllTrip());
    		trip p = cart.getTripById(1);
    		System.out.println(p);   			
    	
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

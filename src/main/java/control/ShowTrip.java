package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;
import entity.Account;

/**
 * Servlet implementation class ShowTrip
 */
@WebServlet("/ShowTrip")
public class ShowTrip extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowTrip() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String t= request.getParameter("email");
        String routefrom= request.getParameter("routeFrom");
        String routeto= request.getParameter("routeTo");
        String datefrom= request.getParameter("dateFrom");
        System.out.println("den show trip" + t );
//        DAO dao = new DAO();
//        Account account = dao.login(email, password);
//        if (account == null) {
//        	request.setAttribute("mess","Sai tên email hoặc mật khẩu");
//        	request.getRequestDispatcher("Login.jsp").forward(request, response);
//        }else {
//        	HttpSession secsion = request.getSession();
//        	secsion.setAttribute("acc", account);
//        	request.setAttribute("user", account);
//        	response.sendRedirect("Home.jsp");
//        }
//        
//        response.sendRedirect("ShowTrip.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}

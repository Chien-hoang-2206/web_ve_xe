package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import entity.Account;

/**
 * Servlet implementation class RegisterControl
 */
@WebServlet(urlPatterns = { "/register" })
public class RegisterControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterControl() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	response.setContentType("text/html;charset=UTF-8");
    	request.setCharacterEncoding("utf-8");
        String username= request.getParameter("name");
        String phone= request.getParameter("phone");
        String email= request.getParameter("email");
        String password= request.getParameter("password");
        String repassword= request.getParameter("repassword");
        Boolean sex = Boolean.parseBoolean(request.getParameter("sex"));
        if (!password.equals(repassword)) {
        	request.setAttribute("mess","Nhập lại mật khẩu không đúng.");
        	request.getRequestDispatcher("Register.jsp").forward(request, response);
        }
        else {
        	   DAO dao = new DAO();
               Account a = dao.checkAcccountExist(email);
               if(a==null) {
            	   dao.signup(username, phone, email, password, sex);
            	   response.sendRedirect("ThanksForSignUp.jsp");
               }else {
            	    request.setAttribute("mess","Email đã được đăng kí tài khoản.");
               		request.getRequestDispatcher("Register.jsp").forward(request, response);
               		}
        }
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.processRequest(request, response);
	}

}

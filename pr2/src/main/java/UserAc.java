

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserAc
 */
@WebServlet("/UserAccount.jsp")
public class UserAc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserAc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //getServletContext().getRequestDispatcher("/UserAccount.jsp").forward(request, response);

		  Cookie[] cookies = request.getCookies();
	        String cookieName = "Time";
	        Cookie cookie = null;
	        if(cookies !=null) {
	            for(Cookie c: cookies) {
	                if(cookieName.equals(c.getName())) {
	                    cookie = c;
	                    break;
	                }
	            }
	        }
	        PrintWriter out = response.getWriter();
	        try {
	            out.println("Time: " + cookie.getValue());
	        }
	        finally {
	            out.close();
	        }
	    }
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}

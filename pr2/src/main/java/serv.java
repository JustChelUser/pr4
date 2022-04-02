
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sqlapp.UserAuths;
import sqlapp.exampledb;
import sqlapp.users;


@WebServlet("/Authorization")
public class serv extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serv() {
        super(); 
        // TODO Auto-generated constructor stub
    }
		// TODO Auto-generated method stub
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
    		 getServletContext().getRequestDispatcher("/Authorization.jsp").forward(request, response);
        }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {   
            try {
            	//check
            	String  login = request.getParameter("username");
            	String  password = request.getParameter("password");
            	UserAuths UserAuths = new UserAuths(login,password); 
            	int result = exampledb.check(UserAuths); 
            	if(result==0)
            	{
            	    
                    HttpSession session = request.getSession();                
                    String name = (String) session.getAttribute("userName");
                    PrintWriter out = response.getWriter();
                    try {
                        
                        if(name == null) {
                        	 out.println("Your username was saved "); 
                            session.setAttribute("userName", login);
                        }
                        else {
                            out.println("Hello , userName: " + name);                       
                            session.removeAttribute("name");
                        }
                    }
                    finally {
                        out.close();
                    }
                	Date date = new Date();
                	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            		Cookie cookie = new Cookie ("Time",formatter.format(date).toString());
            		cookie.setMaxAge(24*60*60);
            		response.addCookie(cookie);                                     
	      	        PrintWriter out2 = response.getWriter();
	      	        try {
	      	        	System.out.println("Time: " + cookie.getValue());
	      	            
	      	        }
	      	        finally {
	      	            out2.close();
	      	        }	
            	}
            	//insert
               /* String name = request.getParameter("name");
                String surname = request.getParameter("surname");
                String patronymic = request.getParameter("patronymic");
                String city = request.getParameter("city");
                String street = request.getParameter("street");
                String telnumb = request.getParameter("telnumb"); 
                String email = request.getParameter("email");
                String wifi = request.getParameter("wifi");
                String mobileinternet = request.getParameter("mobileint");
                String TV = request.getParameter("tv");
                String password = request.getParameter("password");  
                String tarif = request.getParameter("tarif");  
                String urgentcall = request.getParameter("call");  
	            users users = new users(name, surname, patronymic, city, street, telnumb, email, wifi, mobileinternet, TV,password,tarif,urgentcall);
	            exampledb.insert(users);               
              // response.sendRedirect(request.getContextPath()+"/create");
               * */               
            }
            catch(Exception ex) {
                
            }
        }
    
}

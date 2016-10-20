package jrout.tutorial.servlet.sessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookiesServlet
 */
@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String fname = request.getParameter("fname");
		
		
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(Cookie cook : cookies) {
				if("myCookieID".equals(cook.getName()) && "5678910".equals(cook.getValue())) {
					out.println("Welcome back "+fname+"  to this WebSite");
				}
			}
		}else {
			Cookie cookie = new Cookie("myCookieID","5678910");
			response.addCookie(cookie);
			out.println("Welcome "+fname+" firstime to this WebSite");
		}
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

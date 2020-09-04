package cookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CookieServlet") 
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie cookie = new Cookie("username", "ramesh");
		cookie.setMaxAge(1000 * 60 * 60 * 24 * 365);
		response.addCookie(cookie);

		Cookie cookie2 = new Cookie("SearchItem1", "Laptop");
		cookie.setMaxAge(1000 * 60 * 60 * 24 * 365);
		response.addCookie(cookie2);

		Cookie cookie3 = new Cookie("SearchItem2", "Watch");
		cookie.setMaxAge(1000 * 60 * 60 * 24 * 365);
		response.addCookie(cookie3);

		System.out.println(" ---- Cookie Added ---");
	}
}

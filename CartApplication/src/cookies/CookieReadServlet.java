package cookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CookieReadServlet") 
public class CookieReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie arr[] = request.getCookies();

		for (Cookie cookie : arr) {
			Cookie c = cookie;

			if (c.getName().equals("username")) {
				response.getWriter().append(c.getValue());
			}
		}
	}
}

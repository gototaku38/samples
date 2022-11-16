import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class TestServlet extends HttpServlet {
	public void service(HttpServletRequest request,
											HttpServletResponse response)
		throws ServletException,
					 IOException {
		response.setContentType(
			"text/html; charset=Shift_JIS");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>Servlet Test</body>");
		out.println("</html>");
	}
}

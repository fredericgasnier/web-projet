package lan.fred;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myhello")
public class ListeServlerTest extends HttpServlet {
        private static final long serialVersionUID = 1L;

        public ListeServlerTest() {
                super();
        }

        protected void fredo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                String yourName = (String) request.getParameter("nom");
                out.println("<h1>Hello " + yourName + "</h1>");
                out.println("<p> Salut " + yourName + ", ça va ?</p>");
                out.println("<p>Comment vas tu ?</p>");
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        fredo(request, response);
        }
}


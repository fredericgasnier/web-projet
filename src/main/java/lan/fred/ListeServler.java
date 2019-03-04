package lan.fred;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class ListeServler extends HttpServlet {
        private static final long serialVersionUID = 1L;

        public ListeServler() {
                super();
        }

        protected void fredo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                String yourName = request.getParameter("nom");
                if (yourName == "fred") {
                PrintWriter writer = response.getWriter();
                writer.println("<h1>Hello " + yourName + "</h1>");
                writer.println("<p> Salut " + yourName + ", ça va ?</p>");
                writer.println("<p>Comment vas tu ?</p>");
                writer.close();
                } else {
                writer.println("<p>Comment vas tu " + yourName + "?</p>");
                }
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        fredo(request, response);
        }
}


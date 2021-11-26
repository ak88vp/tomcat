import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TuDien", value = "/TuDien")
public class TuDien extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String word=request.getParameter("txtSearch");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        if(word.equals("hello")){
            writer.println("Xin Chào");
        }else {
            writer.println("Chưa có");
        }
        writer.println("</html>");

    }
}

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "tong", value = "/tong")
public class tong extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int a=Integer.parseInt(request.getParameter("a"));
//        int b=Integer.parseInt(request.getParameter("b"));
//        int c=a+b;
//        PrintWriter printWriter=response.getWriter();
//        printWriter.println("<html>");
//        printWriter.println("<head>");
//        printWriter.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
//        printWriter.println("</head>");
//        printWriter.println("<body>");
//        printWriter.println("tỔNG"+a+"+"+b+"="+c);
//        printWriter.println("</body>");
//        printWriter.println("</html>");
        PrintWriter printWriter=response.getWriter();
        printWriter.println("<!DOCTYPE HTML>");
        printWriter.println("<html lang=\"en\">");
        printWriter.println("<head>");
        printWriter.println("<meta charset=\"UTF-8\" >");
       printWriter.println("<title>Title</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        String name=request.getParameter("name");
        String pass=request.getParameter("pass");

        if(name.equals("admin")&&pass.equals("123")){
            printWriter.println("đăng nhap thanh cong");
        }else
        printWriter.println("not");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

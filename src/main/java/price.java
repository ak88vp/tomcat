import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "price", value = "/price")
public class price extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        double price=Double.parseDouble(request.getParameter("price"));
        double Percent=Double.parseDouble(request.getParameter("Percent"));
        double display=price*Percent*0.01;
        double price2=price-display;
        PrintWriter printWriter= response.getWriter();
        printWriter.println("Tên sản phẩm : "+name);
        printWriter.println("Giá cũ : "+price);
        printWriter.println("Lượng chiết khấu : "+ display);
        printWriter.println("giá sau khi chiết khấu : "+price2);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

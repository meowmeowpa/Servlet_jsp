package com.example.servertime;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "CheckAgeServlet" ,urlPatterns = "/checkAge")
public class CheckAgeServlet extends HttpServlet {
    @Override
    protected void doPost (HttpServletRequest request , HttpServletResponse response)throws
            IOException{
        response.setContentType("text/html;charset=UTF-8");
        String numberStr = request.getParameter("number");  
        int number = Integer.parseInt(numberStr);
        boolean isAdult = isAdult(number);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head><title>Kiểm Tra Tuổi Hợp Lệ</title></head>");
        writer.println("<body>");
        if (isAdult) {
            writer.println("<h1>" + number + " tuổi: Bạn đã đủ tuổi trưởng thành </h1>");
        } else {
            writer.println("<h1> " + number + " tuổi: Bạn chưa đủ tuổi trưởng thành.</h1>");
        }
        writer.println("</body>");
        writer.println("</html>");
    }
    private boolean isAdult(int age) {
        return age >= 18;
    }
}

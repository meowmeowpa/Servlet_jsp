package com.example.servertime;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountTheStringServlet", urlPatterns = "/CountString")
public class CountTheStringServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            IOException {
        response.setContentType("text/html;charset=UTF-8");
        String text = request.getParameter("chuỗi");
        int length = text.length();
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head><title>Đếm số ký tự</title></head>");
        writer.println("<body>");
        writer.println("<h1>Độ dài của chuỗi: " + length + "</h1>");
        writer.println("</body>");
        writer.println("</html>");
    }
}

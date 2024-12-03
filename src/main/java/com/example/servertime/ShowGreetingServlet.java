package com.example.servertime;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "showGreetingServlet", urlPatterns = "/login")
public class ShowGreetingServlet extends HttpServlet {
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {
       String username = request.getParameter("username");
       String password = request.getParameter("password");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
       if ("admin".equalsIgnoreCase(username) && "admin".equalsIgnoreCase(password)) {
            writer.println("<h1> Welcome to website, " + username + "</h1>");
       } else {
           writer.println("<h1> Login error </h1>");
       }
       writer.println("</html>");
    }
}

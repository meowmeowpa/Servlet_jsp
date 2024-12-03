package com.example.servertime;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ComputerExerciseServlet", urlPatterns = "/ComputerEx")
public class ComputerExerciseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            IOException {
        double number1 = Double.parseDouble(request.getParameter("number1"));
        double number2 = Double.parseDouble(request.getParameter("number2"));
        String operation = request.getParameter("operation");
        double result = 0;
        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;

        }
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        writer.println("<html>");
        writer.println("<h1>" + result + "</h1>");
        writer.println("</html>");
    }
}

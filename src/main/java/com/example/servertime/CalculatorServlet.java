package com.example.servertime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/Calculate")
public class CalculatorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperand = Float.parseFloat(request.getParameter("soThuNhat"));
        float secondOperand = Float.parseFloat(request.getParameter("soThuHai"));
        String operator = request.getParameter("toanTu");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result:</h1>");
        try {
            float result = calculate(firstOperand, secondOperand, operator);
            writer.println(firstOperand + " " + operator + " " + secondOperand + " = " + result);
        } catch (Exception ex) {
            writer.println("Error: " + ex.getMessage());
        }
        writer.println("</html>");
    }


    private float calculate(float soThuNhat, float soThuHai, String toanTu) {
        switch (toanTu) {
            case "+":
                return soThuNhat + soThuHai;
            case "-":
                return soThuNhat - soThuHai;
            case "*":
                return soThuNhat * soThuHai;
            case "/":
                if (soThuHai != 0)
                    return soThuNhat / soThuHai;
                else
                    throw new RuntimeException("Không thể chia cho số không.");
            default:
                throw new RuntimeException("Nhập số không hợp lệ");
        }
    }
}




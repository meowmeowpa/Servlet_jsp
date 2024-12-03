package com.example.servertime;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PrimeCheckerServlet", urlPatterns = "/checkPrime")
public class PrimeCheckerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        String numberStr = request.getParameter("number");
        int number = Integer.parseInt(numberStr);
        boolean isPrime = isPrime(number);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head><title>Kiểm Tra Số Nguyên Tố</title></head>");
        writer.println("<body>");
        if (isPrime) {
            writer.println("<h1>Số " + number + " là số nguyên tố.</h1>");
        } else {
            writer.println("<h1>Số " + number + " không phải là số nguyên tố.</h1>");
        }
        writer.println("</body>");
        writer.println("</html>");
    }
    private boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}


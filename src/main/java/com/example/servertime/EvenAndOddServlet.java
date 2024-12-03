package com.example.servertime;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "EvenAndOddServlet", value = "/EvenAndOdd")
public class EvenAndOddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request , HttpServletResponse response) throws
           IOException{
         String numberStr=request.getParameter("number");
         int number=Integer.parseInt(numberStr);

         String result;
         if (number%2==0){
             result= " số " + number +" là số chẵn";
         }else {
             result=" số " + number + " là số lẻ";
         }
        PrintWriter writer = response.getWriter();
         writer.println("<html><body>");
         writer.println("<h1>" + result + "</h1>");
         writer.println("</html></body>");
    }
}

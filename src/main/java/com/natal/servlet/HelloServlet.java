package com.natal.servlet;

import com.natal.helloworld.ejb.HelloWorldRemote;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = {"/HelloServlet"})
public class HelloServlet extends HttpServlet {
    
    @EJB
    HelloWorldRemote helloWorldRemote;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        PrintWriter output = response.getWriter();
        output.println("<h2>Teste</h2>");
        try{
            output.println("<h2>" + helloWorldRemote.sayHello() + "</h2>");
        }
        catch(Exception e){
            output.println("Erro: " + e.getLocalizedMessage());
        }
    }

}

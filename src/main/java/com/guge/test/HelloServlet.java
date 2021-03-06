package com.guge.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Guge on 2017/4/6.
 */
@WebServlet(name = "/hello")
public class HelloServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime=dateFormat.format(new Date());
        request.setAttribute("dateTime",dateTime);
        request.getRequestDispatcher("/WEB_INF/jsp/hello.jsp").forward(request,response);
    }
}

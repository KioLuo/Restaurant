package com.netease;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.netease.Kitchen;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class NoodlesServlet extends HttpServlet {
	
	public static Logger log = null;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
        String vegetable = request.getParameter("vegetable");
		String noodles = Kitchen.makeNoodles(vegetable);
		writer.println(noodles);
		PropertyConfigurator.configure("C:\\Users\\qy_lu\\workspace\\maven-restaurant\\Restaurant\\src\\main\\java\\log4j.properties");
		log = Logger.getLogger(getClass());
		log.info("The vegetable is: " + vegetable);
    }
}


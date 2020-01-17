package com.sds.date;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serverDate")
public class ServletDate extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}
	
	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//System.out.println("Hello Servlet");
		resp.setCharacterEncoding("UTF-8"); // 한글깨짐 처리
		Calendar c = Calendar.getInstance(); // 시스템이 갖고 있는 날짜를 얻어옴
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		PrintWriter pw = resp.getWriter();
		pw.write("<html><head><title>서버측 시간을 얻어서 씁니다.</title></head>");
		pw.write("<body><h1>Hello Servlet</h1>");
		pw.write("<h2>현재 시간은 ");
		pw.write(Integer.toString(hour)+" 시 ");
		pw.write(Integer.toString(minute)+" 분 ");
		pw.write(Integer.toString(second)+" 초 입니다.");
		pw.write("</h2></body></html>");
		
		pw.write("<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"UTF-8\">\r\n" + 
				"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n" + 
				"<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\r\n" + 
				"<title>loginForm </title>\r\n" + 
				"\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"	<div>\r\n" + 
				"		<form>\r\n" + 
				"			ID<input type=\"text\" name=\"ID\" placeholder=\"ID 입력\"> <br>\r\n" + 
				"			PWD<input type=\"password\" name=\"PWD\" placeholder=\"PWD 입력\"> <br>\r\n" + 
				"			<input type=\"submit\" value=\"전송\">\r\n" + 
				"			<input type=\"reset\" value=\"취소\">\r\n" + 
				"		</form>\r\n" + 
				"	</div>\r\n" + 
				"</body>\r\n" + 
				"</html>");
		
				
	}
}

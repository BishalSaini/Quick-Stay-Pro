package com.jsp.controller;

 
	import java.io.IOException;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import com.jsp.dto.Manager;
	import com.jsp.service.ManagerService;

	@WebServlet("/saveM")
	public class ManagerSaveController extends HttpServlet {  
		
		ManagerService managerService=new ManagerService();
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String name=req.getParameter("name"); 
			String email=req.getParameter("email"); 
			String phone_no=req.getParameter("contact"); 
			String username=req.getParameter("username"); 
			String password=req.getParameter("pass");  
			
			long phone_no1= Long.parseLong(phone_no); 
			
			Manager manager =new Manager(); 
			manager.setName(name); 
			manager.setEmail(email);  
			manager.setPh_no(phone_no1);  
			manager.setUsername(username); 
			manager.setPassword(password); 
			
			
			Manager m= managerService.saveManagerDetails(manager);
			if(m!=null) {   
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("managerLogin.jsp"); 
				requestDispatcher.forward(req, resp);
			}
				
			else { 
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("saveManager.jsp"); 
				requestDispatcher.include(req, resp);

			}

		}
}

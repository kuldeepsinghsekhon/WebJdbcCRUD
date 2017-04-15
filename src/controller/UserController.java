package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crud.User;
import crud.UserDAOImp;

/**
 * Servlet implementation class UserController
 */
@WebServlet({"/allusers","/register"})
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      UserDAOImp daoImp= new UserDAOImp(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		List<User> users= daoImp.getAllUsers();
		out.write("<table border=1><tr>"
				+ "<th>ID</th>"
				+ "<th>Name</th>"
				+ "<th>Email</th>"
				+ "<th>Password</th>"
				+ "</tr>");
		for(User user: users) {
			out.write("<tr><td>"+user.getId()+"</td>"
					+ "<td>"+user.getName()+"</td>"
							+ "<td>"+user.getEmail()+"</td>"
									+ "<td>"+user.getPassword()+"</td></tr>");
		}
		out.write("</table>");
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		User user= new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		boolean status=daoImp.addUser(user);
		if(status) {
			out.write("user Added Successfully");
		}else {
			out.write("failed to add user");
		}
	
	}

}

package com.another.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.another.dao.StudentDao;
import com.another.domain.Student;
import com.another.impl.StudentDaoImpl;
import com.another.util.PathEnum;

public class RegisterServlet extends HttpServlet {

	/**
		 * Destruction of the servlet. <br>
		 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
		 * The doPost method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to post.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        System.out.println(id+"\t"+userName+"\t"+password);
        //参数检测
        boolean flag = paramsCheck(id, password, userName);
        if (flag) {
        	Student student = new Student();
        	student.setId(id);
        	student.setName(userName);
        	student.setPassword(password);
        	StudentDao studentDao = new StudentDaoImpl();
            boolean registerState = false;
        	try {
				registerState = studentDao.register(student);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	if (registerState) {
        		//注册成功
        		request.getRequestDispatcher(PathEnum.OTHER.getPath()+"login.jsp").forward(request, response);
        	} else {
        		//注册失败
        		request.setAttribute("message", "账号已经注册过了、、、");
        		request.getRequestDispatcher(PathEnum.OTHER.getPath()+"register.jsp").forward(request, response);
        	}
        } else {
        	//参数错误，重新注册
        	request.setAttribute("message", "参数错误");
        	request.getRequestDispatcher(PathEnum.OTHER.getPath()+"register.jsp").forward(request, response);
        }    
	}

	/**
		 * Initialization of the servlet. <br>
		 *
		 * @throws ServletException if an error occurs
		 */
	public void init() throws ServletException {
		// Put your code here
	}
	public boolean paramsCheck(String id, String password, String name){
    	String regex = "[0-9]{12}";
    	Pattern pattern = Pattern.compile(regex);
    	boolean flag = pattern.matcher(id).matches();
    	if (flag && password != null && !"".equals(password) && !"".equals(name)) {
    		return true;
    	}
    	return false;
    }
}

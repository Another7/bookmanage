package com.another.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.another.dao.StudentDao;
import com.another.domain.BorrowInfo;
import com.another.domain.Student;
import com.another.impl.StudentDaoImpl;
import com.another.util.PathEnum;

public class LoginServlet extends HttpServlet {
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
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);

	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		// 参数检测
		boolean paramsCheckFlag = paramsCheck(id, password);
		if (paramsCheckFlag) {
			Student student = new Student();
			student.setId(id);
			student.setPassword(password);
			StudentDao studentDao = new StudentDaoImpl();
			try {
				boolean flag = studentDao.login(student);
				if (flag) {
					request.getSession().setAttribute("user", student);
					List<BorrowInfo> bookInfoList = studentDao.queryLendedBookInfomation(student);
					request.setAttribute("bookInfoList", bookInfoList);
					// 登录成功到homePage
					request.getRequestDispatcher(PathEnum.STUDENTVIEW.getPath() + "homepage.jsp").forward(request,
							response);
				} else {
					//密码错误
					request.setAttribute("message", "账号密码不匹配");
					request.getRequestDispatcher(PathEnum.OTHER.getPath() + "login.jsp").forward(request, response);
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} else {
			// 转发到登录界面
			request.getRequestDispatcher(PathEnum.OTHER.getPath() + "login.jsp").forward(request, response);
		}

	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

	public boolean paramsCheck(String id, String password) {
		String regex = "[0-9]{12}";
		Pattern pattern = Pattern.compile(regex);
		boolean flag = pattern.matcher(id).matches();
		if (flag && password != null && !"".equals(password)) {
			return true;
		}
		return false;
	}
}

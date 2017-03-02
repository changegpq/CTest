package com.hh.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dean.bean.Problem;
import com.dean.dao.ProblemDao;
import com.dean.daoimpl.ProblemDaoimpl;


public class Problem_Preview_Servlet extends HttpServlet {

	public Problem_Preview_Servlet() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��Ŀ�ļ���
		List<Problem> prolist = new ArrayList<Problem>();
		
		// ��Ŀ
		Problem pro = null;
		
		try {
			// ��Ŀ��dao
			ProblemDao prodao = new ProblemDaoimpl();
			
			// �õ���ѡ���ֵ�ļ���
			String[] select = request.getParameterValues("select_problem");
			String p_id = null;
			
			// ��problem����ȡ��һ��Problem����
			int i = 0;
			while(i < select.length)
			{
				pro = new Problem();
				p_id = select[i];
				pro = prodao.FindProblemByP_id(p_id);
				prolist.add(pro);
				i++;
			}
			
			HttpSession session = request.getSession();
			session.setAttribute("problemlist",prolist);
			
			response.sendRedirect("../hh/jsp/tea_paper_preview.jsp");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
	}
		
	
		
	}

	public void init() throws ServletException {

	}

}

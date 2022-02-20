package com.sdz.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sdz.javabean.Coyote;

/**
 * Servlet implementation class TestServlet2
 */
@WebServlet("/testservlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//this.getServletContext().getRequestDispatcher("/WEB-INF/TestJsp.jsp").forward(request, response);
		
		// création et initialisation du message
		String paramAuteur = request.getParameter("auteur");
		String message = "Transmission de message : OK!" + paramAuteur;
		
		// création et initialisation du bean
		Coyote coyote = new Coyote();
		coyote.setNom("Bip bip");
		coyote.setPrenom("Runner");
		
		// stockage des informations
		request.setAttribute("texte", message);
		request.setAttribute("bean", coyote);
		
		request.getRequestDispatcher("/WEB-INF/TestJsp.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.IPiloteDAO;

import DAO.PiloteDAO;

import Model.Pilote;


/**
 * Servlet implementation class listepilote
 */
@WebServlet("/listepilote")
public class listepilote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listepilote() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Pilote> liste= new ArrayList<Pilote>();
		IPiloteDAO daoP=new PiloteDAO();
		liste=daoP.getPilote();
		request.setAttribute("pilote", liste);
		this.getServletContext().getRequestDispatcher("/WEB-INF/listePilote.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Pilote> liste= new ArrayList<Pilote>();
		IPiloteDAO daoP=new PiloteDAO();
		liste=daoP.getPilote();
		request.setAttribute("pilote", liste);
		this.getServletContext().getRequestDispatcher("/WEB-INF/listePilote.jsp").forward(request, response);
	}

}

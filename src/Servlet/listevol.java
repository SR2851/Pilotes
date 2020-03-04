package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import DAO.IVolDAO;
import DAO.VolDAO;
import Model.Vol;

/**
 * Servlet implementation class listevol
 */
@WebServlet("/listevol")
public class listevol extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listevol() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Vol> liste= new ArrayList<Vol>();
		IVolDAO daoV=new VolDAO();
		liste=daoV.getVol();
		request.setAttribute("vol", liste);
		this.getServletContext().getRequestDispatcher("/WEB-INF/listeVol.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Vol> liste= new ArrayList<Vol>();
		IVolDAO daoV=new VolDAO();
		liste=daoV.getVol();
		request.setAttribute("vol", liste);
		this.getServletContext().getRequestDispatcher("/WEB-INF/listeVol.jsp").forward(request, response);
	}

}

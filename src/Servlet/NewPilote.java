package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.IPiloteDAO;
import DAO.PiloteDAO;
import Model.Pilote;

/**
 * Servlet implementation class NewPilote
 */
@WebServlet("/NewPilote")
public class NewPilote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewPilote() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/NewPilote.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Pilote pilote = new Pilote();
pilote.setNom(request.getParameter("nom"));
pilote.setPrenom(request.getParameter("prenom"));
pilote.setTel(request.getParameter("tel"));
IPiloteDAO daoP=new PiloteDAO();
daoP.addPilote(pilote);

request.setAttribute("pilote", pilote);

		this.getServletContext().getRequestDispatcher("/WEB-INF/pilotesucces.jsp").forward(request, response);
	}

}

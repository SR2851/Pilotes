package Servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.IPiloteDAO;
import DAO.IVolDAO;
import DAO.PiloteDAO;
import DAO.VolDAO;
import Model.Pilote;
import Model.Vol;

/**
 * Servlet implementation class NewVol
 */
@WebServlet("/NewVol")
public class NewVol extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewVol() {
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
		this.getServletContext().getRequestDispatcher("/WEB-INF/NewVol.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Pilote pilote=new Pilote();
		request.setAttribute("pilote", pilote);
		Date date=null;
		pilote.setIdPilote(Integer.parseInt(request.getParameter("idPilote")));
		
		Vol vol=new Vol();
		
		try {
			date=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vol.setDateVol(date);
		
		vol.setPilote(pilote);
		IVolDAO daoV=new VolDAO();
		daoV.addVol(vol);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/volsucces.jsp").forward(request, response);
	}

}

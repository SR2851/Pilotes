package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Model.Pilote;



public class PiloteDAO implements IPiloteDAO{
	SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
	Session session = sessionfactory.openSession();
	@Override
	public int addPilote(Pilote pilote) {
		try {
			session.beginTransaction();
			session.save(pilote);
			session.getTransaction().commit();
			System.out.println("Pilote ajouté");
			return 1;
		} catch (HibernateException e) {
			System.out.println("Pilote non ajouté");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deletePilote(int idPilote) {
		try {
			session.beginTransaction();
			Pilote pilote = new Pilote();
			pilote.setIdPilote(idPilote);
			session.delete(pilote);
			session.getTransaction().commit();
			System.out.println("Pilote supprimé");
			return 1;
		} catch (HibernateException e) {
			System.out.println("Pilote non supprimé");
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int updatePilote(int idPilote, String nom, String prenom, String tel) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Pilote> getPilote() {
		List<Pilote> liste= new ArrayList<Pilote>();
		try {
			session.beginTransaction();
			String q="Select * from Pilote";
			SQLQuery query =session.createSQLQuery(q);
			query.addEntity(Pilote.class);
			liste=query.list();
			
			
			return liste;
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
	}
	}

}

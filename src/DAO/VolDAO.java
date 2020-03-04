package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Model.Vol;


public class VolDAO implements IVolDAO {
	SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
	Session session = sessionfactory.openSession();
	@Override
	public int addVol(Vol vol) {
		try {
			session.beginTransaction();
			session.save(vol);
			session.getTransaction().commit();
			System.out.println("Vol ajouté");
			return 1;
		} catch (HibernateException e) {
			System.out.println("Vol non ajouté");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Vol> getVol() {
		List<Vol> liste= new ArrayList<Vol>();
		try {
			session.beginTransaction();
			String q="Select * from Vol";
			SQLQuery query =session.createSQLQuery(q);
			query.addEntity(Vol.class);
			liste=query.list();
			
			
			return liste;
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
	}
	}

}

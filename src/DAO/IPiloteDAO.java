package DAO;

import java.util.List;

import Model.Pilote;

public interface IPiloteDAO {
public int addPilote(Pilote pilote);
public int deletePilote(int idPilote);
public int updatePilote(int idPilote, String nom, String prenom, String tel);
public List<Pilote> getPilote();
}

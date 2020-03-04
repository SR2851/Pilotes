package Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Vol {
@Id
@GeneratedValue
	private int IdVol;
@Temporal(TemporalType.DATE)
	private Date dateVol;
	@JoinColumn(name="idPilote")
	@ManyToOne
	private Pilote pilote;
	
	public Vol(int idVol, Date dateVol) {
		super();
		IdVol = idVol;
		this.dateVol = dateVol;
	}
	public Vol() {
		super();
	}
	public int getIdVol() {
		return IdVol;
	}
	public void setIdVol(int idVol) {
		IdVol = idVol;
	}
	public Date getDateVol() {
		return dateVol;
	}
	public void setDateVol(Date dateVol) {
		this.dateVol = dateVol;
	}
	public Pilote getPilote() {
		return pilote;
	}
	public void setPilote(Pilote pilote) {
		this.pilote = pilote;
	}
	@Override
	public String toString() {
		return "Vol [IdVol=" + IdVol + ", dateVol=" + dateVol + "]";
	}
	
	
}

package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_proveedorcl2 database table.
 * 
 */
@Entity
@Table(name="tbl_proveedorcl2")
@NamedQuery(name="TblProveedorcl2.findAll", query="SELECT t FROM TblProveedorcl2 t")
public class TblProveedorcl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	private String emailproveecl2;

	@Temporal(TemporalType.DATE)
	private Date feingproveecl2;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idprooveedorcl2;

	private String nomproveecl2;

	private String rsocialproveecl2;

	private String rucproveecl2;

	public TblProveedorcl2() {
	}

	public String getEmailproveecl2() {
		return this.emailproveecl2;
	}

	public void setEmailproveecl2(String emailproveecl2) {
		this.emailproveecl2 = emailproveecl2;
	}

	public Date getFeingproveecl2() {
		return this.feingproveecl2;
	}

	public void setFeingproveecl2(Date feingproveecl2) {
		this.feingproveecl2 = feingproveecl2;
	}

	public int getIdprooveedorcl2() {
		return this.idprooveedorcl2;
	}

	public void setIdprooveedorcl2(int idprooveedorcl2) {
		this.idprooveedorcl2 = idprooveedorcl2;
	}

	public String getNomproveecl2() {
		return this.nomproveecl2;
	}

	public void setNomproveecl2(String nomproveecl2) {
		this.nomproveecl2 = nomproveecl2;
	}

	public String getRsocialproveecl2() {
		return this.rsocialproveecl2;
	}

	public void setRsocialproveecl2(String rsocialproveecl2) {
		this.rsocialproveecl2 = rsocialproveecl2;
	}

	public String getRucproveecl2() {
		return this.rucproveecl2;
	}

	public void setRucproveecl2(String rucproveecl2) {
		this.rucproveecl2 = rucproveecl2;
	}

}
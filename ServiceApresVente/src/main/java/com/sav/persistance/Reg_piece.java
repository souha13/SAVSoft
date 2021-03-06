package com.sav.persistance;





// Generated 22 janv. 2015 15:05:41 by Hibernate Tools 3.4.0.CR1

/**
 * Client generated by hbm2java
 */
public class Reg_piece implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idreg_piece;
	private Integer qte;
	private Piece piece;
	private Reparation reparation;
	private Utilisateur utilisateur;
	
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Integer getIdreg_piece() {
		return idreg_piece;
	}
	public void setIdreg_piece(Integer idreg_piece) {
		this.idreg_piece = idreg_piece;
	}
	public Integer getQte() {
		return qte;
	}
	public void setQte(Integer qte) {
		this.qte = qte;
	}
	public Piece getPiece() {
		return piece;
	}
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	
	public Reparation getReparation() {
		return reparation;
	}
	public void setReparation(Reparation reparation) {
		this.reparation = reparation;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idreg_piece == null) ? 0 : idreg_piece.hashCode());
		result = prime * result + ((qte == null) ? 0 : qte.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reg_piece other = (Reg_piece) obj;
		if (idreg_piece == null) {
			if (other.idreg_piece != null)
				return false;
		} else if (!idreg_piece.equals(other.idreg_piece))
			return false;
		if (qte == null) {
			if (other.qte != null)
				return false;
		} else if (!qte.equals(other.qte))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Reg_piece [idreg_piece=" + idreg_piece + ", qte=" + qte + "]";
	}
	
	


	
	



	

	



	}


package com.sav.persistance;





// Generated 22 janv. 2015 15:05:41 by Hibernate Tools 3.4.0.CR1

/**
 * Client generated by hbm2java
 */
public class App_acc implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idapp_acc;
	
	private Appel appel;
	private Accessoire accessoire;
	
	


	
	



	

	public Appel getAppel() {
		return appel;
	}


	public void setAppel(Appel appel) {
		this.appel = appel;
	}


	public Accessoire getAccessoire() {
		return accessoire;
	}


	public void setAccessoire(Accessoire accessoire) {
		this.accessoire = accessoire;
	}


	public App_acc() {
	}


	public Integer getIdapp_acc() {
		return idapp_acc;
	}

	public void setIdapp_acc(Integer idapp_acc) {
		this.idapp_acc = idapp_acc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idapp_acc == null) ? 0 : idapp_acc.hashCode());
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
		App_acc other = (App_acc) obj;
		if (idapp_acc == null) {
			if (other.idapp_acc != null)
				return false;
		} else if (!idapp_acc.equals(other.idapp_acc))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "App_acc [idapp_acc=" + idapp_acc + "]";
	}

	



	}


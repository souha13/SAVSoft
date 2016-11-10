package com.sav.persistance;

import java.util.HashSet;
import java.util.Set;

// Generated 22 janv. 2015 15:05:41 by Hibernate Tools 3.4.0.CR1

/**
 * Client generated by hbm2java
 */
public class Type implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idtype;
	private String designationType;
	
	private Set<Machine> machines= new HashSet<Machine>();
	
	
	
	public Set<Machine> getMachines() {
		return machines;
	}

	public void setMachines(Set<Machine> machines) {
		this.machines = machines;
	}

	public Type() {
	}

	public Type( String designationType) {
		
		this.designationType = designationType;
		
		
		
	}

	public Integer getIdtype() {
		return idtype;
	}

	public void setIdtype(Integer idtype) {
		this.idtype = idtype;
	}

	public String getDesignationType() {
		return designationType;
	}

	public void setDesignationType(String designationType) {
		this.designationType = designationType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idtype == null) ? 0 : idtype.hashCode());
		result = prime * result + ((designationType == null) ? 0 : designationType.hashCode());
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
		Type other = (Type) obj;
		if (idtype == null) {
			if (other.idtype != null)
				return false;
		} else if (!idtype.equals(other.idtype))
			return false;
		if (designationType == null) {
			if (other.designationType != null)
				return false;
		} else if (!designationType.equals(other.designationType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Type [idtype=" + idtype + ", designationType=" + designationType + "]";
	}
	
	
	
	

	
}
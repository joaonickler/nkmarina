package com.nkmarina.domain;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table (name = "embarcacao", schema = "public")
public class Embarcacao  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private Integer id;
	private String  nm_embarc;
	private String  id_situacao;
	
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm")
	private Date    dh_registro;
		

	public Embarcacao() {
		
	}

	
	public Embarcacao(Integer id, String nm_embarc, String id_situacao, Date dh_registro) {
		super();
		this.id = id;
		this.nm_embarc = nm_embarc;
		this.id_situacao = id_situacao;
		this.dh_registro = dh_registro;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNm_embarc() {
		return nm_embarc;
	}


	public void setNm_embarc(String nm_embarc) {
		this.nm_embarc = nm_embarc;
	}


	public String getId_situacao() {
		return id_situacao;
	}


	public void setId_situacao(String id_situacao) {
		this.id_situacao = id_situacao;
	}


	public Date getDh_registro() {
		return dh_registro;
	}


	public void setDh_registro(Date dh_registro) {
		this.dh_registro = dh_registro;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Embarcacao other = (Embarcacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	
	
	

	
	
	
	
	
	
}

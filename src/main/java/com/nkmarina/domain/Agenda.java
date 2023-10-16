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
@Table (name = "agenda", schema = "public")
public class Agenda   implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private Integer id_agenda;
	
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm")
	private Date dh_cadastro;
	
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm")
	private Date dh_solicitacao;
	
	private String id_situacao;
	
	
	public Agenda() {
		
	}
	

	public Integer getId_agenda() {
		return id_agenda;
	}

	public void setId_agenda(Integer id_agenda) {
		this.id_agenda = id_agenda;
	}

	public Date getDh_cadastro() {
		return dh_cadastro;
	}

	public void setDh_cadastro(Date dh_cadastro) {
		this.dh_cadastro = dh_cadastro;
	}

	public Date getDh_solicitacao() {
		return dh_solicitacao;
	}

	public void setDh_solicitacao(Date dh_solicitacao) {
		this.dh_solicitacao = dh_solicitacao;
	}

	public String getId_situacao() {
		return id_situacao;
	}

	public void setId_situacao(String id_situacao) {
		this.id_situacao = id_situacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
		

	public Agenda(Integer id_agenda, Date dh_cadastro, Date dh_solicitacao, String id_situacao) {
		super();
		this.id_agenda = id_agenda;
		this.dh_cadastro = dh_cadastro;
		this.dh_solicitacao = dh_solicitacao;
		this.id_situacao = id_situacao;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_agenda == null) ? 0 : id_agenda.hashCode());
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
		Agenda other = (Agenda) obj;
		if (id_agenda == null) {
			if (other.id_agenda != null)
				return false;
		} else if (!id_agenda.equals(other.id_agenda))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	

}
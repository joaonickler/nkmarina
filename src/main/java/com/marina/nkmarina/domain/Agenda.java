package com.marina.nkmarina.domain;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.marina.nkmarina.domain.enums.TipoAgendaSituacao;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "agenda", schema = "public")
public class Agenda   implements Serializable   {

	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_agenda;		
	
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm")
	private Date dh_cadastro_agenda ;		
	
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm")
	private Date dh_solicit_agenda;		
	
	private Integer situacao_agenda;
		
	
	
	@ManyToOne(cascade = {CascadeType.REFRESH})  
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
		
	@ManyToOne(cascade = {CascadeType.REFRESH})  
	@JoinColumn (name = "embarc_id")
	private Embarcacao embarcacao;		
		
	
	public Embarcacao getEmbarcacao() {
		return embarcacao;
	}


	public void setEmbarcacao(Embarcacao embarcacao) {
		this.embarcacao = embarcacao;
	}

	
	public Agenda() {
		
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public Agenda(Integer id_agenda, 
				Date dh_cadastro_agenda, 
				Date dh_solicit_agenda, 
				Integer situacao_agenda,
				Cliente cliente,
				Embarcacao embarcacao ) {
		super();
		this.id_agenda = id_agenda;
		this.dh_cadastro_agenda = dh_cadastro_agenda;
		this.dh_solicit_agenda = dh_solicit_agenda;
		this.situacao_agenda = situacao_agenda;
		this.cliente = cliente;
		this.embarcacao = embarcacao;
	}

	public Integer getId_agenda() {
		return id_agenda;
	}



	public void setId_agenda(Integer id_agenda) {
		this.id_agenda = id_agenda;
	}



	public Date getDh_cadastro_agenda() {
		return dh_cadastro_agenda;
	}



	public void setDh_cadastro_agenda(Date dh_cadastro_agenda) {
		this.dh_cadastro_agenda = dh_cadastro_agenda;
	}



	public Date getDh_solicit_agenda() {
		return dh_solicit_agenda;
	}



	public void setDh_solicit_agenda(Date dh_solicit_agenda) {
		this.dh_solicit_agenda = dh_solicit_agenda;
	}



	public Integer getSituacao_agenda() {
		return situacao_agenda;
	}



	public void setSituacao_agenda(Integer situacao_agenda) {
		this.situacao_agenda = situacao_agenda;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public TipoAgendaSituacao  getSituacaoAgenda() {		
		return TipoAgendaSituacao.toEnum(situacao_agenda);
	}

	
	public void setSituacaoAgenda(TipoAgendaSituacao situacao) {
		this.situacao_agenda = situacao.getCod();
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

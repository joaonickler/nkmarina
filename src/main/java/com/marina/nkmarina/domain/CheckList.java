package com.marina.nkmarina.domain;

import java.io.Serializable;

///import com.fasterxml.jackson.annotation.JsonIgnore;
import com.marina.nkmarina.domain.enums.TipoItemCheck;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "checklist", schema = "public")
public class CheckList    implements Serializable {

	
	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_check;	
	
	private Integer tipo_check;	
	private String  situacao_check;
	
	
	@ManyToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "embarcacao_id")
	private Embarcacao embarcacao;
	
	
	
	public Integer getTipo_check() {
		return tipo_check;
	}


	public void setTipo_check(Integer tipo_check) {
		this.tipo_check = tipo_check;
	}


	public CheckList(Integer id_check, Integer tipo_check, String situacao_check, Embarcacao embarcacao) {
		super();
		this.id_check = id_check;
		this.tipo_check = tipo_check;
		this.situacao_check = situacao_check;
		this.embarcacao = embarcacao;
	}


	public Integer getId_check() {
		return id_check;
	}


	public void setId_check(Integer id_check) {
		this.id_check = id_check;
	}

	public String getSituacao_check() {
		return situacao_check;
	}


	public void setSituacao_check(String situacao_check) {
		this.situacao_check = situacao_check;
	}


	public Embarcacao getEmbarcacao() {
		return embarcacao;
	}


	public void setEmbarcacao(Embarcacao embarcacao) {
		this.embarcacao = embarcacao;
	}
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_check == null) ? 0 : id_check.hashCode());
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
		CheckList other = (CheckList) obj;
		if (id_check == null) {
			if (other.id_check != null)
				return false;
		} else if (!id_check.equals(other.id_check))
			return false;
		return true;
	}


	public CheckList(){
		
	}
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	public TipoItemCheck getTipoCheck() {
		return TipoItemCheck.toEnum(tipo_check);
		
	}

	public void setTipoCheck(TipoItemCheck tipo) {
		this.tipo_check = tipo.getCod();
	}
	
		
	
	
	
	
}

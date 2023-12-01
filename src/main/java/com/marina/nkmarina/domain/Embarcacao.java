package com.marina.nkmarina.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.marina.nkmarina.domain.enums.TipoEmbarcacao;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "embarcacao", schema = "public")
public class Embarcacao    implements Serializable {

	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_embarc;	
	
	private String nm_embarc;		
	private Integer tipo_embarc;
	private String nrmarinha_embarc;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cliente_id")	
	@JsonBackReference
	private Cliente cliente;
		
	
	
	
	
	public Embarcacao(){
		
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
				
		
	
	public Embarcacao(Integer id_embarc, String nm_embarc, 
						String situacao_embarc, Integer tipo_embarc,
						String nrmarinha_embarc, Cliente cliente ) {
		super();
		this.id_embarc = id_embarc;
		this.nm_embarc = nm_embarc;		
		this.tipo_embarc = tipo_embarc;
		this.nrmarinha_embarc = nrmarinha_embarc;
		this.cliente = cliente;		
		
	}

	public Integer getId_embarc() {
		return id_embarc;
	}

	public void setId_embarc(Integer id_embarc) {
		this.id_embarc = id_embarc;
	}

	public String getNm_embarc() {
		return nm_embarc;
	}

	public void setNm_embarc(String nm_embarc) {
		this.nm_embarc = nm_embarc;
	}

	

	public Integer getTipo_embarc() {
		return tipo_embarc;
	}

	public void setTipo_embarc(Integer tipo_embarc) {
		this.tipo_embarc = tipo_embarc;
	}

	public String getNrmarinha_embarc() {
		return nrmarinha_embarc;
	}

	public void setNrmarinha_embarc(String nrmarinha_embarc) {
		this.nrmarinha_embarc = nrmarinha_embarc;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	

	public TipoEmbarcacao getTipo() {
		return TipoEmbarcacao.toEnum(tipo_embarc);
	}

	public void setTipo(TipoEmbarcacao tipo) {
		this.tipo_embarc = tipo.getCod();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_embarc == null) ? 0 : id_embarc.hashCode());
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
		if (id_embarc == null) {
			if (other.id_embarc != null)
				return false;
		} else if (!id_embarc.equals(other.id_embarc))
			return false;
		return true;
	}	
	
	
	
	
}

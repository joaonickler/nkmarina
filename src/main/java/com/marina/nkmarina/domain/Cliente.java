package com.marina.nkmarina.domain;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table (name = "cliente", schema = "public")
public class Cliente  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id_cliente;
	
	private String nm_cliente;
	private String end_cliente;
	private String tel_cliente;
	private String email_cliente;			
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)	
	private List<Embarcacao> embarcacoes = new ArrayList<>();
	

	public Cliente() {
		
	}
		
	
	public Integer getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}


	public String getNm_cliente() {
		return nm_cliente;
	}

	public void setNm_cliente(String nm_cliente) {
		this.nm_cliente = nm_cliente;
	}

	public String getEnd_cliente() {
		return end_cliente;
	}

	public void setEnd_cliente(String end_cliente) {
		this.end_cliente = end_cliente;
	}

	public String getTel_cliente() {
		return tel_cliente;
	}

	public void setTel_cliente(String tel_cliente) {
		this.tel_cliente = tel_cliente;
	}

	public String getEmail_cliente() {
		return email_cliente;
	}

	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}

	
	public Cliente(Integer id_cliente, String nm_cliente, 
					String end_cliente, String tel_cliente, 
					String email_cliente,
					List<Embarcacao> embarcacoes) {
		super();
		this.id_cliente = id_cliente;
		this.nm_cliente = nm_cliente;
		this.end_cliente = end_cliente;
		this.tel_cliente = tel_cliente;
		this.email_cliente = email_cliente;
		this.embarcacoes = embarcacoes;
		
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
	public List<Embarcacao> getEmbarcacoes() {
		return embarcacoes;
	}

	public void setEmbarcacoes(List<Embarcacao> embarcacoes) {
		this.embarcacoes = embarcacoes;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_cliente == null) ? 0 : id_cliente.hashCode());
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
		Cliente other = (Cliente) obj;
		if (id_cliente == null) {
			if (other.id_cliente != null)
				return false;
		} else if (!id_cliente.equals(other.id_cliente))
			return false;
		return true;
	}
	
	
	
	

	

	
	
	
	
}

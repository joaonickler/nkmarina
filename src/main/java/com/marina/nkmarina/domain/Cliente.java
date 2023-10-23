package com.marina.nkmarina.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
	private Integer id;
	
	private String nm_cliente;
	private String end_cliente;
	private String tel_cliente;
	private String email_cliente;
	
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm")
	private Date dt_inclusao;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cliente")
	private List<Embarcacao> embarcacoes = new ArrayList<>();
	
		
	
	public Cliente() {
		
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Date getDt_inclusao() {
		return dt_inclusao;
	}

	public void setDt_inclusao(Date dt_inclusao) {
		this.dt_inclusao = dt_inclusao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Cliente(Integer id, String nm_cliente, String end_cliente, String tel_cliente, String email_cliente,
			Date dt_inclusao) {
		super();
		this.id = id;
		this.nm_cliente = nm_cliente;
		this.end_cliente = end_cliente;
		this.tel_cliente = tel_cliente;
		this.email_cliente = email_cliente;
		this.dt_inclusao = dt_inclusao;
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
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	public List<Embarcacao> getEmbarcacoes() {
		return embarcacoes;
	}

	public void setEmbarcacoes(List<Embarcacao> embarcacoes) {
		this.embarcacoes = embarcacoes;
	}
	
	
	
	
}

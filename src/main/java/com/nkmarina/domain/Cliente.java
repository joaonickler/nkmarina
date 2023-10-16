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
@Table (name = "cliente", schema = "public")
public class Cliente     implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private Integer id_cliente;
	
	private String nm_cliente;
	private String end_cliente;
	private String tel_cliente;
	private String email_cliente;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date   dt_inclusao;
	
	
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


	public String getTel_clente() {
		return tel_cliente;
	}


	public void setTel_clente(String tel_clente) {
		this.tel_cliente = tel_clente;
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
	
	
	


	public Cliente(Integer id_cliente, String nm_cliente, String end_cliente, String tel_clente, String email_cliente,
			Date dt_inclusao) {
		super();
		this.id_cliente = id_cliente;
		this.nm_cliente = nm_cliente;
		this.end_cliente = end_cliente;
		this.tel_cliente = tel_clente;
		this.email_cliente = email_cliente;
		this.dt_inclusao = dt_inclusao;
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


	public String getTel_cliente() {
		return tel_cliente;
	}


	public void setTel_cliente(String tel_cliente) {
		this.tel_cliente = tel_cliente;
	}
	
	
	
	
	
	
}

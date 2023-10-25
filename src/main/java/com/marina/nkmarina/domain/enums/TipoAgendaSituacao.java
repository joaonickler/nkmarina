package com.marina.nkmarina.domain.enums;


public enum TipoAgendaSituacao {

	ATIVA(1, "Pendente"),
	CANCELADA (2, "Cancelada"),
	CONCLUIDA (3, "Concluida");
	
	
	private int cod;
	private String  descricao;
	
		
	
	private TipoAgendaSituacao(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
		
	public static TipoAgendaSituacao toEnum(Integer cod) {
		if (cod==null) {
			return null;
		}
		
		for (TipoAgendaSituacao x :TipoAgendaSituacao.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("ID Invalido: " + cod);
	}
	
	
	
	
	
}

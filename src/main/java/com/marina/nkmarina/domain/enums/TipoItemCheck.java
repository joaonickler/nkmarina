package com.marina.nkmarina.domain.enums;


public enum TipoItemCheck {

	GASOLINA	(1, "GASOLINA"),
	SEGURANÇA 	(2, "SEGURANÇA"),
	MOTOR 		(3, "MOTOR"),
	CORDAS 		(4, "CORDAS"),
	CASCO 		(5, "CASCO"),
	AGUA         (6, "AGUA");
		
	private int cod;
	private String  descricao;	
		
	
	private TipoItemCheck(int cod, String descricao) {
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
	
	
	public static TipoItemCheck toEnum(Integer cod) {
		if (cod==null) {
			return null;
		}
		
		for (TipoItemCheck x :TipoItemCheck.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("ID Invalido: " + cod);
	}	
	
}

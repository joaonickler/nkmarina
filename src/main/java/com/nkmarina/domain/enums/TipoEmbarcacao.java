package com.nkmarina.domain.enums;

	

public enum TipoEmbarcacao {

	
	LANCHA(1, "Lancha"),
	VELEIRO (2, "Veleiro"),
	NAVIO (3, "Navio"),
	IATE (4, "Iate"),
	BOTE (5, "Bote"),
	CAIAQUE (6, "Caiaque"),
	JETSKI (7, "Jetski");
	
	
	private int cod;
	private String  descricao;
	
	private TipoEmbarcacao(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	
	public static TipoEmbarcacao toEnum(Integer cod) {
		if (cod==null) {
			return null;
		}
		
		for (TipoEmbarcacao x :TipoEmbarcacao.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("ID Invalido: " + cod);
	}
	
	
}

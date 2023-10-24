package com.marina.nkmarina.domain.enums;


public enum TipoEmbarcacao {

	BARCO(1, "Barco"),
	NAVIO (2, "Navio"),
	IATE (3, "Iate"),
	CAIQUE (4, "Caiaque"),
	JETSIKI (5, "Jetski"),
	BOTE (3, "Bote");
	
	private int cod;
	private String  descricao;
	
		
	
	private TipoEmbarcacao(int cod, String descricao) {
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

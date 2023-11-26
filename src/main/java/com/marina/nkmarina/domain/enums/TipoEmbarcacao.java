package com.marina.nkmarina.domain.enums;


public enum TipoEmbarcacao {

	BARCO	(1, "Barco"),
	NAVIO 	(2, "Navio"),
	IATE 	(3, "Iate"),
	JETSIKI (4, "Jetski");
	
	
	private Integer  cod;
	private String  descricao;	
		
	
	private TipoEmbarcacao(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public Integer getCod() {
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
	
		
	public static TipoEmbarcacao  toEnum(Integer tipo_embarc) {
		if (tipo_embarc==null) {
			return null;
		}
		
		for (TipoEmbarcacao x :TipoEmbarcacao.values()) {
			if (tipo_embarc.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Código Invalido: " + tipo_embarc);
	}
	
	
	
	
	
}

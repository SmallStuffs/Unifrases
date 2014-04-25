package br.com.unifrases.entity;

public class Frase {
	
	private String descricao;
	private String codigo;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return getDescricao();
	}

}

package br.com.jv.estudos.produto;

import java.math.BigDecimal;

public class ProdutoBuilder {
	
	private Produto instancia;
	
	public ProdutoBuilder() {
		this.instancia = new Produto();
	}
	
	public ProdutoBuilder comDescricao(String descricao) {
		this.instancia.setDescricao(descricao);
		return this;
	}
	
	public ProdutoBuilder comQuantidade(Integer quantidade) {
		this.instancia.setQuantidade(quantidade);;
		return this;
	}
	
	public ProdutoBuilder comValor(BigDecimal valor) {
		this.instancia.setValor(valor);
		return this;
	}
	
	public Produto construir() {
		return this.instancia;
	}
	
}

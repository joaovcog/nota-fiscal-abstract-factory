package br.com.jv.estudos.venda;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.jv.estudos.boleto.Boleto;
import br.com.jv.estudos.nfe.NFe;
import br.com.jv.estudos.produto.Produto;
import br.com.jv.estudos.produto.ProdutoBuilder;
import br.com.jv.estudos.venda.impl.LojaFactory;

public class GerarVenda {
	
	public static void main(String[] args) throws IOException {
		GerarVenda gerarVenda = new GerarVenda();
		ModuloVendaFactory moduloVendaFactory = gerarVenda.criarModuloVendaFactory();
		
		List<Produto> produtos = new ArrayList<>();
		Produto produto1 = new ProdutoBuilder()
				.comDescricao("Cadeira Gamer")
				.comQuantidade(1)
				.comValor(new BigDecimal("1800"))
				.construir();
		Produto produto2 = new ProdutoBuilder()
				.comDescricao("Pendrive 128GB")
				.comQuantidade(3)
				.comValor(new BigDecimal("80"))
				.construir();
		
		produtos.add(produto1);
		produtos.add(produto2);
		
		NFe nfe = moduloVendaFactory.criarNFe();
		Boleto boleto = moduloVendaFactory.criarBoleto();
		
		boleto.emitir(produtos, nfe);
	}
	
	public ModuloVendaFactory criarModuloVendaFactory() throws IOException {
		return new LojaFactory();
	}
	
}

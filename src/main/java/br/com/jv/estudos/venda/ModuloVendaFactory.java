package br.com.jv.estudos.venda;

import br.com.jv.estudos.boleto.Boleto;
import br.com.jv.estudos.nfe.NFe;

public interface ModuloVendaFactory {
	
	public NFe criarNFe();
	
	public Boleto criarBoleto();
	
}

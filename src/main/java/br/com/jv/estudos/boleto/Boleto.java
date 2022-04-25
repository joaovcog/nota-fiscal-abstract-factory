package br.com.jv.estudos.boleto;

import java.util.List;

import br.com.jv.estudos.nfe.NFe;
import br.com.jv.estudos.produto.Produto;

public interface Boleto {
	
	public void emitir(List<Produto> produtos, NFe nfe);
	
}

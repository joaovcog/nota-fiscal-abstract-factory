package br.com.jv.estudos.venda.impl;

import java.io.IOException;
import java.util.Properties;

import br.com.jv.estudos.boleto.Boleto;
import br.com.jv.estudos.nfe.NFe;
import br.com.jv.estudos.venda.ModuloVendaFactory;

public class LojaFactory implements ModuloVendaFactory {

	private final Properties prop;

	public LojaFactory() throws IOException {
		this.prop = new Properties();
		this.prop.load(this.getClass().getResourceAsStream("/config.properties"));
	}

	@Override
	public NFe criarNFe() {
		NFe nfe = null;

		try {
			nfe = (NFe) Class.forName(prop.getProperty("nfe")).getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			throw new IllegalStateException("Não foi possível carregar a classe para NFe.", e);
		}

		return nfe;
	}

	@Override
	public Boleto criarBoleto() {
		Boleto boleto = null;

		try {
			boleto = (Boleto) Class.forName(prop.getProperty("boleto")).getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			throw new IllegalStateException("Não foi possível carregar a classe para Boleto.", e);
		}

		return boleto;
	}

}

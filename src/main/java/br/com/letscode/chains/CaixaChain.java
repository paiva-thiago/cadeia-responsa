package br.com.letscode.chains;

public interface CaixaChain {

	void setNextChain(CaixaChain nextChain);
	
	void obter(GranaDoCaixa grn);
}
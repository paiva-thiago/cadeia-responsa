package br.com.letscode.chains;

public interface CaixaChain {

	void setNextChain(CaixaChain nextChain);
	
	void executeNext(GranaDoCaixa grn);

	void obter(GranaDoCaixa grn);
}
package br.com.letscode.chains;

public class CaixaEletronico {
    private CaixaChain primeiroElo;

    public CaixaEletronico(){
        this.primeiroElo = new NotaDe50Elo();
		CaixaChain segundoElo = new NotaDe20Elo();
		CaixaChain terceiroElo = new NotaDe10Elo();

		// set the chain of responsibility
		primeiroElo.setNextChain(segundoElo);
		segundoElo.setNextChain(terceiroElo);
    }

    public CaixaChain getPrimeiroElo(){
        return this.primeiroElo;
    }
}
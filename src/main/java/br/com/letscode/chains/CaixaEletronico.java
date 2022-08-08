package br.com.letscode.chains;

public class CaixaEletronico {
    private CaixaChain primeiroElo;

    public CaixaEletronico(){
        this.primeiroElo = new ValidarMultiplosDe10Elo();
		CaixaChain segundoElo = new NotaDe50Elo();
		CaixaChain terceiroElo = new NotaDe20Elo();
		CaixaChain quartoElo = new NotaDe10Elo();

		primeiroElo.setNextChain(segundoElo);
		segundoElo.setNextChain(terceiroElo);
        terceiroElo.setNextChain(quartoElo);
    }

    public CaixaChain getPrimeiroElo(){
        return this.primeiroElo;
    }
}
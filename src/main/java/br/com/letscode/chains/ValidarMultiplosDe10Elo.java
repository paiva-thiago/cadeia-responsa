package br.com.letscode.chains;

public class ValidarMultiplosDe10Elo implements CaixaChain {

	private CaixaChain chain;
	
	@Override
	public void setNextChain(CaixaChain nextChain) {
		this.chain=nextChain;
	}

	@Override
	public void executeNext(GranaDoCaixa grn){
		if(this.chain!=null){
			this.chain.obter(grn);
		}
	}

	@Override
	public void obter(GranaDoCaixa cur) {
		if(cur.getGrana() % 10 != 0){
			System.out.println("Valor deve ser Múltiplo de 10!");
		}else{
			this.executeNext(cur);
		}
	}

}

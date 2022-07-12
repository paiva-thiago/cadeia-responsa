package br.com.letscode.chains;

public class NotaDe10Elo implements CaixaChain {

	private CaixaChain chain;
	
	@Override
	public void setNextChain(CaixaChain nextChain) {
		this.chain=nextChain;
	}

	@Override
	public void obter(GranaDoCaixa cur) {
		if(cur.getGrana() >= 10){
			int num = cur.getGrana()/10;
			int restante = cur.getGrana() % 10;
			System.out.println("Temos  "+num+" notas de R$10");
			if(restante !=0) this.chain.obter(new GranaDoCaixa(restante));
		}else{
			this.chain.obter(cur);
		}
	}

}
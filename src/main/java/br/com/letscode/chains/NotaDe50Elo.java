package br.com.letscode.chains;

public class NotaDe50Elo implements CaixaChain {

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
		if(cur.getGrana() >= 50){
			int num = cur.getGrana()/50;
			int restante = cur.getGrana() % 50;
			System.out.println("Temos  "+num+" notas de R$50");
			if(restante !=0){
				this.executeNext(new GranaDoCaixa(restante));
			} 
		}else{
			this.executeNext(cur);
		}
	}

}
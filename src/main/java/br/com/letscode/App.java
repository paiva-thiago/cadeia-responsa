package br.com.letscode;

import br.com.letscode.chains.*;
import java.util.Scanner;

public class App 
{
    private static CaixaEletronico caixa24Horas = new CaixaEletronico();

    public static void main( String[] args )
    {
        int iValorObter = 0;
		System.out.println("Digite o valor em Reais!");
		Scanner input = new Scanner(System.in);
		iValorObter = input.nextInt();
		if (iValorObter % 10 != 0) {
			System.out.println("Valor deve ser Múltiplo de 10!");
		}else{
            caixa24Horas.getPrimeiroElo().obter(new GranaDoCaixa(iValorObter) );
        }
    }
}

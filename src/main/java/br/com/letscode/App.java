package br.com.letscode;

import br.com.letscode.chains.*;
import java.util.Scanner;

public class App 
{
    private static CaixaEletronico caixa24Horas;

    public static void main( String[] args )
    {
        caixa24Horas=new CaixaEletronico();
        int iValorObter = 0;
		System.out.println("Digite o valor em Reais!");
		Scanner input = new Scanner(System.in);
		iValorObter = input.nextInt();
		caixa24Horas.getPrimeiroElo().obter(new GranaDoCaixa(iValorObter) );        
        input.close();
    }
}

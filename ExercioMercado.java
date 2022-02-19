package Exercicios;

import java.util.Scanner;

public class ExercioMercado {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o nome: ");
		String nome = leitura.next();
		
		System.out.println("Digite o RG: ");				
		double rg = sc.nextDouble();
		sc.nextLine();
		System.out.println("Voçe é Cliente : ");
		String cliente = sc.nextLine();
		boolean rgval = rgval1 (rg,nome);
		
		
		if ((rgval) && (cliente.equals("sim")))
		{
		System.out.println("voce esta apto a fazer compras");
		}else	{
			System.out.println("Reprovado, voce não tem cadastro");
		}
	   

	}
		public static boolean
			rgval1 ( Double Rg_val , String nome){
			return Rg_val!=Rg_val || nome.equals("aroldo");
		}				
}

package Exercicios;

import java.util.Scanner;

public class TemperaturaRegiao {
	
		
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		float temperatura;
		String regiao;
		
		System.out.println("Digite a regiao");
		regiao = sc.nextLine();
		
		System.out.println("Digite a Temperatura");
		temperatura = sc.nextFloat();

		if (temperatura <=15) { 
			System.out.println("esta muito frio na regi�o " + regiao );
		}
		else if ( temperatura > 15 && temperatura <= 20){ 
			System.out.println("Frio moderado na regi�o " + regiao);
		}
		else if (temperatura > 20 && temperatura <=25) { System.out.println("Clima Moderado na Regi�o " + regiao);}
		else if (temperatura > 25 && temperatura <=30) { System.out.println("Clima Quente na Regi�o " + regiao);}
		else System.out.println(" Clima muito quente na Regi�o " + regiao);
		
	}

}
			
			
			
			

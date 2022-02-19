package Exercicios;
 
import java.util.Scanner;

 public class aposentadoria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("digite o seu registro");
		int registro = sc.nextInt();

		System.out.println("digite o seu nome");
		String nome = sc.nextLine();

		
		System.out.println("digite o data de adimissão");
	    double dtadm = sc.nextDouble();
	    
	    */
	    
	    System.out.println("digite o seu tempo de serviço");
	    int temposervico = sc.nextInt();
	    
	   
	    System.out.println("digite a sua idade");
	    int idade = sc.nextInt();
	    
	    //System.out.println("digite o seu genero (apenas M ou F)");
		//String genero = sc.next();
		
	    //if (idade >= 60 && temposervico >=35)
	    	System.out.println("digite o seu genero (apenas M ou F)");
		 	String genero = sc.next();{
	    
		 	 
		 	
	    switch (genero) {
	    	case ("m") :
	    		if (idade >= 65 && temposervico >= 30)
	    			System.out.println("Apto para aposentadoria");
	    		else System.out.println("Não Apto para aposentadoria");
	    	break;
	    	
	    	case ("f") :
	    		if (idade >= 60 && temposervico >= 25)
	    			System.out.println("Apto para aposentadoria");
	    		else System.out.println("Não Apto para aposentadoria");
	    	break;
	    	
	    	default: System.out.println("Genero Invalido");
	    	
	    	break;
	    	
	    	
	    }	    	
	    	
	    
	    
	    	/*
	    	 * if
			( altura[b] <= 150) System.out.println("voce é ");
			else
				System.out.println("voce é ");
	    	
	    	 */
		 	}
	    		
	}

}

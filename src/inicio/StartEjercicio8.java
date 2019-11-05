package inicio;

import java.util.Scanner;

public class StartEjercicio8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número:");
		int numeroIntro = teclado.nextInt();
		int numero1=1;
		int numero2=1;
		int resultado=0;
		
		if(numeroIntro==1) {
			System.out.print(numero1+" ");
		}
		else if(numeroIntro==2) {
			System.out.print(numero1+" ");
			System.out.print(numero2+" ");
		}
		else if (numeroIntro>=3) {
			
			System.out.print(numero1+" ");
			System.out.print(numero2+" ");
			
			for (int i=3;i<=numeroIntro;i++) {
				resultado=numero1+numero2;
				numero1=numero2;
				numero2=resultado;
				
				
				System.out.print(resultado+" ");
		}
		
		
		
		
		
		}
		teclado.close();
	}

}

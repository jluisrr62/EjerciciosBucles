package inicio;

import java.util.Scanner;

public class StartEjercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escribe minutos para el tramo:");
		int tramo = teclado.nextInt();
		int total = 0;
		
		
		while(tramo>0) {
			total +=tramo;
			
			System.out.println("Escribe minutos para el tramo:");
			tramo = teclado.nextInt();
		}
		System.out.println("Has usado "+total+" minutos");
		System.out.println(total/60+"h "+total%60+"min");
		
		teclado.close();
	}

}

package inicio;

import java.util.Scanner;

public class StartEjercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		int numero = teclado.nextInt();
		
		while(numero>1) {
			if (numero%2==0) {
				numero/=2;
			}
			else {
				numero*=3;
				numero++;
			}
			System.out.print(numero+" ");
		}
		teclado.close();

	}

}

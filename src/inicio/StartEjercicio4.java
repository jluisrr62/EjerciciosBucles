package inicio;

import java.util.Scanner;

public class StartEjercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un número");
		int numeroIntro = teclado.nextInt();
		int numero=1;
		for (int i=1;i<=numeroIntro;i++) {
			System.out.print(i);
			System.out.print("*");
			while(numero>1) {
				if(numero%2==0) {
					
					numero/=2;
				}
				else {
					
					numero*=3;
					numero++;
				}
				System.out.print("*");
			}
			numero=i;
			numero++;
			System.out.println();
		}
		
		teclado.close();

	}

}

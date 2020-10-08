package exercicios;
import java.util.*;
public class ex2 {
	public static void main(String args[]) {
		Random random = new Random ();
		int numero, total = 10, par=0, impar=0;
		numero = random.nextInt(10);
		
		
		for(total = 0; total < 10; total++) {
			numero = random.nextInt(10);
			System.out.print(numero + "-");
			if(numero % 2 == 0 ) {
				par++;
			}
			if(numero % 2 != 0) {
				impar ++;
			}
		}
		System.out.println("\nTemos "+ par +" numeros pares, e "+ impar+ " numeros impares");
	}

}

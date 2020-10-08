package exercicios;
import java.util.*;
public class ex6 {
		public static void main(String args[]) {
			/*Escrever um programa que receba vários números inteiros no teclado. E no
			final imprimir a média dos números múltiplos de 3. Para sair digitar
			0(zero).(DO...WHILE)*/
			int num, media, soma=0, quant=0;
			Scanner Sc = new Scanner(System.in);
			
				do {
					System.out.printf("Digite um numero");
					num = Sc.nextInt();
					if(num % 3 == 0) {
						soma = num +soma;
						quant++;
					}
				}while(num != 0);
				
			System.out.println("a soma é "+soma);
			media = soma /quant;
			System.out.println("a media é "+media);
		}
}

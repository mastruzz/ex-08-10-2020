package exercicios;
import java.util.*;

public class ex3 {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		Random random = new Random();
		int idade, repeat,novo=0, velho=0;
		repeat = 0;
		
		while(repeat <50) {
			repeat++;
			idade = random.nextInt(100);
			if(idade <= 21) {
				novo++;
			}else if(idade >= 50) {
				velho++;
			}else if(idade == 99) {
				
				System.out.print("Programa encerrado");
				
			}
			
		}
		System.out.print("a quantidade abaixo de 21 é "+ novo);
		System.out.print(" a quantidade acima de 50 é "+ velho);
	}
}

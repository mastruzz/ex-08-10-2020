package exercicios;
import java.util.*;
public class ex5 {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		int num, soma=0;
	
		
		do {
			System.out.printf("Digite os numeros \n");
			num = Sc.nextInt();
			soma += num;
			
			
		}while(num != 0) ;
			System.out.println("a soma é "+soma);
			
	}
	
}

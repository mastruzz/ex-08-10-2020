package exercicios;
import java.util.*;
public class ex1 {
	public static void main (String args[]) {
		Scanner Sc = new Scanner(System.in);
		int num1 = 1000;
		
		for(int limite = 1999; num1 < limite; num1++) {
			if(num1 % 11 == 5) {
				System.out.print("\n"+num1);
			}
		}
	}

}

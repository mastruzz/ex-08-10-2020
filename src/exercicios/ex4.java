package exercicios;
import java.util.*;

public class ex4 {

	public static void main(String arg[]) {
		Random random = new Random();
		Scanner Sc = new Scanner(System.in);
		
		int idade;
		int temp;
		int sexo;
		int num=0;
		int quantidade =0;
		int temperamento = 0;
		int mulhernervosa = 0;
		int homemagressivo = 0;
		int outrocalmo = 0;
		int mais40 = 0;
		int menos18 = 0;
		
		System.out.println("Quantas pessoas deseja cadastrar? ");
		quantidade = Sc.nextInt();
		
		
		if(quantidade > 150) {
			System.out.println("Não efetuamos mais de 150 cadastros, por favor insira uma quantidade válida!");
		}
		
		while(num < quantidade) {
			System.out.printf("Informe sua idade: ");
			idade = Sc.nextInt();
			System.out.println("Informe seu sexo: ");
			sexo = Sc.nextInt();
			System.out.printf("Voce se considera uma pessoa,1 - calma , 2 - nervosa ou 3 - agressiva? ");
			temp = Sc.nextInt();
			
			
			if(temp == 1 ) {
				temperamento++;
			if(sexo == 1 && temp == 2) {
				mulhernervosa++;
			}
			if(sexo == 2 && temp == 3) {
				homemagressivo++;
			}
			if(sexo == 3 && temp == 1) {
				outrocalmo++;
			}
			if(temp == 2 && idade >= 40) {
				mais40++;
			}
			if(temp == 1 && idade < 18) {
				menos18++;
			}
			num++;
			
		}
		
		
	}
		System.out.println("quantidade de mulheres nervosas:--> "+mulhernervosa);
		System.out.println("quantidade de pessoas calmas:--> " +temperamento);
		System.out.println("quantidade de homens agressivos:--> " +homemagressivo);
		System.out.println("quantidade de outros calmos:--> " + outrocalmo);
		System.out.println("quantidade de nervosas com mais de 40 anos:--> "+mais40);
		System.out.println("quantidade de calmos com menos de 18 anos:--> "+menos18);

	}}

package labs;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota");
		double nota1 = sc.nextDouble();
		
		System.out.println("Entre com a segunda nota");
		double nota2 = sc.nextDouble();
		
		System.out.println("Entre com a terceira nota");
		double nota3 = sc.nextDouble();
		
		System.out.println("Entre com a quarta nota");
		double nota4 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A media do aluno é: " + media);
	}

}

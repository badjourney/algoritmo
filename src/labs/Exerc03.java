package labs;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro numero");
		int a = sc.nextInt();
		
		System.out.println("Entre com o segundo numero");
		int b = sc.nextInt();
		
		int resultado = a + b;
		System.out.println("A soma dos numeros é: " + resultado);
		
		sc.close();
	}

}

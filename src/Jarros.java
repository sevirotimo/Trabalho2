/*
 *	Autor: souzags
 *
 *	Dados dois jarros com capacidades A e B, é possivel encher um deles com C litros?
 */

import java.util.Scanner;

public class Jarros {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int t;
		String[] ans;

		t = sc.nextInt();
		ans = new String[t];

		for (int i = 0; i < t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			ans[i] = giveAns(a, b, c);
		}

		for (int i = 0; i < t; i++) System.out.println(ans[i]);

	}

	// Este método diz se é possivel encher A ou B com C litros
	public static String giveAns(int a, int b, int c) {

		if (c == a || c == b) return "SIM"; // Se qualquer um dos recipientes tiver o volume desejado, é possível

		else if (c > a && c > b) return "NÃO"; // Se os dois recipientes forem menores que o volume desejado, não é possivel

		else if (a == b) return "NÃO"; // Se os recipientes forem iguais, não é possível

		else if (a < b && b % a == 0) return "NÃO"; // Se o maior recipiente for múltiplo do menor...

		else if (a > b && a % b == 0) return "NÃO"; // Não é possível

		else return "SIM"; // Para qualquer outro caso, é possivel

	}
}
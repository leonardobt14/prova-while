import java.util.Locale;
import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		int horastrabalhadas, opcaomenu, totalhoras;
		double valorhora, custototal, custocada;
		char outrofuncionario;
		
		totalhoras = 0;
		custototal = 0;

		do {System.out.print("Nome: ");
		nome = sc.next();

		System.out.print("Horas trabalhadas: ");
		horastrabalhadas = sc.nextInt();
		while (horastrabalhadas < 0) {
			System.out.print("Tentativa Inválida! Digite um valor positivo: ");
			horastrabalhadas = sc.nextInt();
		}

		System.out.print("Valor por hora: ");
		valorhora = sc.nextDouble();
		while (valorhora < 0) {
			System.out.print("Tentativa Inválida! Digite um valor positivo: ");
			valorhora = sc.nextDouble();
		}

		System.out.print("Digitar outro (S/N)? ");
		outrofuncionario = sc.next().charAt(0);
		while (outrofuncionario != 'S' && outrofuncionario != 's'&& outrofuncionario != 'N'&& outrofuncionario != 'n') {
			System.out.print("Tentativa Inválida! Digite apenas S (sim) ou N (não)");
			outrofuncionario = sc.next().charAt(0);
		}
		totalhoras = totalhoras + horastrabalhadas;
		custocada = horastrabalhadas * valorhora;
		custototal = custototal + custocada;
		} while (outrofuncionario == 'S' || outrofuncionario == 's');
		
		
		do {
		System.out.println();	
		System.out.println("MENU");
		System.out.println("1 - Total de horas trabalhadas");
		System.out.println("2 - Custo total");
		System.out.print("Digite uma opção: ");
		opcaomenu = sc.nextInt();
		
		if (opcaomenu == 1) {
			System.out.println();
			System.out.println("Total de horas = " + totalhoras);
		}
		if (opcaomenu == 2) {
			System.out.println();
			System.out.printf("Custo total = R$ %.2f%n" , custototal);
		}
		
		} while (opcaomenu != 4);

		sc.close();
	}

}

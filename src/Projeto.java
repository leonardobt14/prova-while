import java.util.Locale;
import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		int horastrabalhadas;
		double valorhora;
		char outrofuncionario;

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
		} while (outrofuncionario == 'S' || outrofuncionario == 's');

		sc.close();
	}

}

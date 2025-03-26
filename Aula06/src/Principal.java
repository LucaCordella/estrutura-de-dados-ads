import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		Deque objDeque = new Deque();
		int opcao = 0;
		
		// Processamento
		while (opcao != 4 ) {
			System.out.println("+=========================+");
			System.out.println("|      Menu de Opções     |");
			System.out.println("+=========================+");
			System.out.println("|  1 - Fila Normal        |");
			System.out.println("|  2 - Fila Preferencial  |");
			System.out.println("|  3 - Atendimento        |");
			System.out.println("|  4 - Encerramento       |");
			System.out.println("+=========================+");
			System.out.println("|>- Digite a sua opção: ");
			opcao = leitor.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite um número: ");
				objDeque.entrar(leitor.nextInt(), false);
			}else if (opcao == 2) {
				System.out.println("Digite um número: ");
				objDeque.entrar(leitor.nextInt(), true);
			}else if (opcao == 3) {
				System.out.println(objDeque.atender());
			}
		}
		
		leitor.close();
	}
}
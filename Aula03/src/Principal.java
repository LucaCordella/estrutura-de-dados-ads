import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		Lista objLista = new Lista();
		int opcao = 0;
		
		// Menu de opções
		while (opcao != 4) {
			System.out.println("+================+");
			System.out.println("| Menu de Opções |");
			System.out.println("+================+");
			System.out.println("|  1- Inserir    |");
			System.out.println("|  2- Remover    |");
			System.out.println("|  3- Imprimir   |");
			System.out.println("|  4- Sair       |");
			System.out.println("+================+");
			System.out.println("|-> Digite a sua opção: ");
			opcao = leitor.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite um número: ");
				objLista.inserir(leitor.nextInt());
			} else if (opcao == 2) {
				System.out.println("Digite um número: ");
				objLista.remover(leitor.nextInt());
			} else if (opcao == 3) {
				objLista.imprimir();
			}
		}
		leitor.close();
	}
}
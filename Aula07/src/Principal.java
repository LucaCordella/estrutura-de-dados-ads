import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		MatrizEsparsa objMatrizEsparsa = new MatrizEsparsa();
		int opcao = 0;
		
		// Processamento
		while (opcao != 4) {
			System.out.println("+================+");
			System.out.println("| Menu de Opções |");
			System.out.println("+================+");
			System.out.println("| 1 - Inserir    |");
			System.out.println("| 2 - Excluir    |");
			System.out.println("| 3 - Imprimir   |");
			System.out.println("| 4 - Sair       |");
			System.out.println("+================+");
			System.out.print("Digite a sua opção: ");
			opcao = leitor.nextInt();
			
			if (opcao == 1) {
				System.out.print("Digite um número: ");
				objMatrizEsparsa.inserir(leitor.nextInt());
			} else if (opcao == 2) {
				System.out.print("Digite um número: ");
				objMatrizEsparsa.excluir(leitor.nextInt());
			} else if (opcao == 3) {
				objMatrizEsparsa.imprimir();
			}
		}
		leitor.close();
	}
}
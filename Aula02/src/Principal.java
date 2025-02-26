import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Declaração de variáveis 
		Lista objLista = new Lista();
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		
		// Processamento
		while (opcao != 4) {
			System.out.println("==================");
			System.out.println("| Menu de Opções |");
			System.out.println("+================+");
			System.out.println("| 1 - Inserir    |");
			System.out.println("| 2 - Remover    |");
			System.out.println("| 3 - Imprimir   |");
			System.out.println("| 4 - Sair       |");
			System.out.println("+================+");
			System.out.println("Digite a sua opção: ");
			opcao = leitor.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.print("Digite um número: ");
				objLista.inserir(leitor.nextInt());
				break;
			case 2:
				System.out.print("Digite um número: ");
				objLista.remover(leitor.nextInt());
				break;
			case 3:
				objLista.imprimir();
				break;
			}
		}
		
		leitor.close();
	}
}

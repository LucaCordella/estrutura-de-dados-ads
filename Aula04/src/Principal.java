import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Lista objLista = new Lista();
		int opcao = 0;
		
		while (opcao != 4) {
			System.out.println("+================+");
			System.out.println("| Menu de Opções |");
			System.out.println("+================+");
			System.out.println("|  1- Inserir    |");
			System.out.println("|  2- Excluir    |");
			System.out.println("|  3- Imprimir   |");
			System.out.println("|  4- Sair       |");
			System.out.println("|  5- Explodir   |");
			System.out.println("+================+");
			System.out.println("|-> Digite a sua opção: ");
			opcao = leitor.nextInt();
			
			switch (opcao) {
			case 1: 
				System.out.print("Digite um número");
				objLista.inserir(leitor.nextInt());
				break;
			case 2: 
				System.out.print("Digite um número");
				objLista.excluir(leitor.nextInt());
				break;
			case 3: 
				objLista.imprimir();
				break;
			case 5: 
				for (int i = 0 ; i < 100000 ; i++) {
					objLista.inserir(i);
				}
				break;
			}
		}
		
		leitor.close();
	}
}

		//Imprimir lista vazia
		//objLista.imprimir();
		
		// Imprimir lista com apenas 1 nó
		//objLista.inserir(1);
		//objLista.imprimir();
		
		// Imprimir lista com vários nós
		//objLista.inserir(2);
		//objLista.inserir(3);
		//objLista.inserir(4);
		//objLista.imprimir();
		
		// Excluir o primeiro
		//objLista.excluir(1);
		//objLista.imprimir();
		
		// Excluir o último
		//objLista.excluir(4);
		//objLista.imprimir();
		
		// Excluir o meio
		//objLista.excluir(2);
		//objLista.imprimir();
		
		// Excluir o inexistente
		//objLista.excluir(100);
		//objLista.imprimir();
		
		// Excluir o último
		//objLista.excluir(3);
		//objLista.imprimir();
		
		// Excluir lista vazia
		//objLista.excluir(100);
		//objLista.imprimir();
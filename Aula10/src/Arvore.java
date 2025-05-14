public class Arvore {
	// Propriedades da classe
	private No raiz = null;
	
	// Métodos da classe
	public void buscar(int numero) {
		buscar(raiz, numero);
	}
	
	private void buscar(No raiz, int numero) {
		// Caso MUITO fácil: procurou a árvore inteira e não achou
		if (raiz == null) {
			System.out.println("Não achei !!!");
			return;
		}
		
		// Caso fácil: sorte de encontrar na raíz
		if (raiz.getNumero() == numero) {
			System.out.println("ACHEI PORRA !!!!!");
			return;
		}
		
		// Caso difícil: procurar na esquerda ou na direita
		if (raiz.getNumero() > numero) {
			buscar(raiz.getEsquerda(), numero);
		} else {
			buscar(raiz.getDireita(), numero);
		}
	}
	
	public void inserir(int numero) {
		raiz = inserir(raiz, numero);
	}
	
	private No inserir(No raiz, int numero) {
		// Caso fácil: árvore vazia
		if (raiz == null) {
			return new No(numero, null, null);
		}
		
		// Caso difícil: árvore NÃO vazia
		if (raiz.getNumero() > numero) {
			raiz.setEsquerda(inserir(raiz.getEsquerda(), numero));
		} else {
			raiz.setDireita(inserir(raiz.getDireita(), numero));
		}
		
		return raiz;
	}
	
	public void navegarEmOrdem() {
		System.out.println("Navegação EM-ORDEM");
		navegarEmOrdem(raiz);
		System.out.println();
	}
	
	private void navegarEmOrdem(No raiz) {
		if (raiz == null) {
			return;
		}
		
		navegarEmOrdem(raiz.getEsquerda());
		System.out.print(raiz.getNumero() + ", ");
		navegarEmOrdem(raiz.getDireita());
	}
}
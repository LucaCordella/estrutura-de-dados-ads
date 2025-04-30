public class Arvore {
	// Propriedades da classe
	private No raiz = null;
	
	// Métodos da classe
	public void inserir(int numero) {
		raiz = inserir(raiz, numero);
	}
	
	private No inserir(No raiz, int numero) {
		// Caso fácil: árvore vazia
		if (raiz == null) {
			return new No(numero, null, null);
		}
		
		// Caso difícil: árvore NÃO vazia
		int sorteio = ((int) (2 * Math.random()));
		if (sorteio == 0) {
			raiz.setEsquerda(inserir(raiz.getEsquerda(), numero));
		}else {
			raiz.setDireita(inserir(raiz.getDireita(), numero));
		}
		
		return raiz;
	}
	
	// Navegação em Pré-Ordem
	public void navegarPreOrdem() {
		System.out.print("Navegação em Pré-Ordem: ");
		navegarPreOrdem(raiz);
		System.out.println();
	}
	
	public void navegarPreOrdem(No raiz) {
		if (raiz == null) {
			return;
		}
		
		System.out.print(raiz.getNumero() + ", ");
		navegarPreOrdem(raiz.getEsquerda());
		navegarPreOrdem(raiz.getDireita());
	}
	
	// Navegação Em-Ordem
	public void navegarEmOrdem() {
		System.out.print("Navegação Em-Ordem: ");
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
	
	// Navegação em Pós-Ordem
	public void navegarPosOrdem() {
		System.out.print("Navegação em Pós-Ordem: ");
		navegarPosOrdem(raiz);
		System.out.println();
	}
	
	private void navegarPosOrdem(No raiz) {
		if (raiz == null) {
			return;
		}
		
		navegarPosOrdem(raiz.getEsquerda());
		navegarPosOrdem(raiz.getDireita());
		System.out.print(raiz.getNumero() + ", ");
	}
}
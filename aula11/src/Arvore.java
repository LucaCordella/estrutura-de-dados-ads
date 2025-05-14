public class Arvore {
	// Propriedades da classe
	private No raiz = null;
	
	// Métodos da classe
	private No rotacionarEsquerda(No raizVelha) {
		No raizNova = raizVelha.getDireita();
		raizVelha.setDireita(raizNova.getEsquerda());
		raizNova.setEsquerda(raizVelha); // quem era filho virou filho, e o pai virou filho da esquerda
		
		raizNova.setCor(raizVelha.isCor());
		raizVelha.setCor(true);
		
		return raizNova;
	}
	
	private No rotacionarDireita(No raizVelha) {
		No raizNova = raizVelha.getEsquerda();
		raizVelha.setEsquerda(raizNova.getDireita());
		raizNova.setDireita(raizVelha); 
		
		raizNova.setCor(raizVelha.isCor());
		raizVelha.setCor(true);
		
		return raizNova;
	}
	
	private void subirVermelho(No raiz) {
		raiz.setCor(true);
		raiz.getEsquerda().setCor(false);
		raiz.getDireita().setCor(false);
	}
	
	private boolean vermelho(No raiz) {
		if (raiz == null) {
			return false;
		}
		
		return raiz.isCor();
	}
	
	public void inserir(int numero) {
		raiz = inserir(raiz, numero);
	}
	
	private No inserir(No raiz, int numero) {
		// Caso fácil: árvore vazia
		if (raiz == null) {
			return new No(numero, null, null, true);
		}
		
		// Caso difícil: árvore NÃO vazia
		if (numero < raiz.getNumero()) {
			raiz.setEsquerda(inserir(raiz.getEsquerda(), numero));
		} else {
			raiz.setDireita(inserir(raiz.getDireita(), numero));
		}
		
		// Correções de balanceamento da árvore
		if ((! vermelho(raiz.getEsquerda())) && (vermelho(raiz.getDireita()))) {
			raiz = rotacionarEsquerda(raiz);
		}
		if ((vermelho(raiz.getEsquerda())) && (vermelho(raiz.getEsquerda().getEsquerda()))) {
			raiz = rotacionarDireita(raiz);
		}
		if ((vermelho(raiz.getEsquerda())) && (vermelho(raiz.getDireita()))) {
			subirVermelho(raiz);
		}
		
		return raiz;
	}
	
	public void imprimir() {
		imprimir(raiz, "");
	}
	
	private void imprimir(No raiz, String indentacao) {
		if (raiz == null) {
			return;
		}
		
		System.out.println(indentacao + raiz.getNumero() + " (" + (raiz.isCor() ? "V" : "P") + ")");
		
		imprimir(raiz.getEsquerda(), indentacao + "---");
		imprimir(raiz.getDireita(), indentacao + "---");
	}
}
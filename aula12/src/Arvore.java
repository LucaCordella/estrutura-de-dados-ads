public class Arvore {
	
	// Propriedades da classe
	private No raiz = null;
	
	// Métodos da classe
	private int getAlturaDoNo(No raiz) {
		if (raiz == null) {
			return 0;
		}
		
		return raiz.getAltura();
	}
	
	private int getMaximoEntreDoisNumeros(int a, int b) {
		return (a > b) ? a : b;
	}
	
	private int getBalanco(No raiz) {
		if (raiz == null) {
			return 0;
		}
		
		return (getAlturaDoNo(raiz.getEsquerda()) - getAlturaDoNo(raiz.getDireita()));
	}
	
	private No rotacaoEsquerda(No raiz) {
		No novaRaiz = raiz.getDireita();
		No temp = novaRaiz.getEsquerda();
		novaRaiz.setEsquerda(raiz);
		raiz.setDireita(temp);
		
		raiz.setAltura(getMaximoEntreDoisNumeros(getAlturaDoNo(raiz.getEsquerda()),
												 getAlturaDoNo(raiz.getDireita())) + 1);
		
		novaRaiz.setAltura(getMaximoEntreDoisNumeros(getAlturaDoNo(novaRaiz.getEsquerda()),
													 getAlturaDoNo(novaRaiz.getDireita())) + 1);
		
		return novaRaiz;
	}
	
	private No rotacaoDireita(No raiz) {
		No novaRaiz = raiz.getEsquerda();
		No temp = novaRaiz.getDireita();
		novaRaiz.setDireita(raiz);
		raiz.setEsquerda(temp);
		
		raiz.setAltura(getMaximoEntreDoisNumeros(getAlturaDoNo(raiz.getEsquerda()),
												 getAlturaDoNo(raiz.getDireita())) + 1);
		
		novaRaiz.setAltura(getMaximoEntreDoisNumeros(getAlturaDoNo(novaRaiz.getEsquerda()),
													 getAlturaDoNo(novaRaiz.getDireita())) + 1);
		
		return novaRaiz;
	}
	
	public void inserir(int numero) {
		raiz = inserir(raiz, numero);
	}
	
	private No inserir(No raiz, int numero) {
		
		// Caso fácil, árvore vazia
		if(raiz == null) {
			return new No (numero, null, null, 1);
		}
		
		// Caso difícil, árvore NÃO vazia
		if (raiz.getNumero() > numero) {
			raiz.setEsquerda(inserir(raiz.getEsquerda(), numero));
		} else {
			raiz.setDireita(inserir(raiz.getDireita(), numero));
		}
		
		// Correções do balanceamento
		raiz.setAltura(1 + getMaximoEntreDoisNumeros(getAlturaDoNo(raiz.getEsquerda()),
													 getAlturaDoNo(raiz.getDireita())));
		
		int balanco = getBalanco(raiz);
		
		if ((balanco > 1) && (numero < raiz.getEsquerda().getNumero())) {
			raiz = rotacaoDireita(raiz);
		}
		if ((balanco < -1) && (numero > raiz.getDireita().getNumero())) {
			raiz = rotacaoEsquerda(raiz);
		}
		if ((balanco > 1) && (numero > raiz.getEsquerda().getNumero())) {
			raiz.setEsquerda(rotacaoEsquerda(raiz.getEsquerda()));
			raiz = rotacaoDireita(raiz);
		}
		if ((balanco < -1) && (numero < raiz.getDireita().getNumero())) {
			raiz.setDireita(rotacaoDireita(raiz.getDireita()));
			raiz = rotacaoEsquerda(raiz);
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
		
		System.out.println(indentacao + raiz.getNumero());
		imprimir(raiz.getEsquerda(), indentacao + "---");
		imprimir(raiz.getDireita(), indentacao + "---");
	}
}
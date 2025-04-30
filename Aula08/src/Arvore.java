public class Arvore {
	// Propriedades da classe
	private No raiz = null;
	
	// Métodos da classe
	public void inserir(int numero) {
		raiz = inserir(raiz, numero);
	}
	
	private No inserir(No raiz, int numero) {
		// Cenário fácil: árvore vazia
		if (raiz == null) {
			return new No(numero, null, null, null, null, null);
		}
		
		// Cenário difícil: árvore NÃO vazia
		int sorteio = (1 + ((int) (5 * Math.random())));
		
		if (sorteio == 1) {
			raiz.setFilho1(inserir(raiz.getFilho1(), numero));
		} else if (sorteio == 2) {
			raiz.setFilho2(inserir(raiz.getFilho2(), numero));
		} else if (sorteio == 3) {
			raiz.setFilho3(inserir(raiz.getFilho3(), numero));
		} else if (sorteio == 4) {
			raiz.setFilho4(inserir(raiz.getFilho4(), numero));
		} else {
			raiz.setFilho5(inserir(raiz.getFilho5(), numero));
		}
		
		return raiz;
	}
	
	public void imprimir() {
		imprimir(raiz, "", " (raiz)");
	}
	
	private void imprimir(No raiz, String indentacao, String filho) {
		if (raiz == null) {
			return;
		}
		
		System.out.println(indentacao + raiz.getNumero() + filho);
		
		imprimir(raiz.getFilho1(), indentacao + "---", " (F1)");
		imprimir(raiz.getFilho2(), indentacao + "---", " (F2)");
		imprimir(raiz.getFilho3(), indentacao + "---", " (F3)");
		imprimir(raiz.getFilho4(), indentacao + "---", " (F4)");
		imprimir(raiz.getFilho5(), indentacao + "---", " (F5)");
	}
}
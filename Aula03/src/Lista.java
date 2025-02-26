public class Lista {
	// Propriedades da classe 
	private No cabeca = null;
	
	// Métodos da classe
	public void inserir(int numero) {
		cabeca = new No(numero, null, cabeca);
		if (cabeca.getProximo() != null) {
			cabeca.getProximo().setAnterior(cabeca);
		}
	}
	
	public void imprimir() { 
		No ponteiro = cabeca;
		
		while (ponteiro != null) {
			System.out.println(ponteiro.getNumero());
			ponteiro = ponteiro.getProximo();
		}
	}
	
	public void remover(int numero) {
		// Caso muito fácil: lista vazia
		if (cabeca == null) {
			return;
		}
		
		// Caso médio facíl: excluir o primeiro (ou único)
		if (cabeca.getNumero() == numero) {
			cabeca = cabeca.getProximo();
			if (cabeca != null) { // primeiro
				cabeca.setAnterior(null);
			}
			return;
		}
		
		// Caso difícil: excluir no meio (ou no fim)
		No ponteiro = cabeca;
		while ((ponteiro != null) && (ponteiro.getNumero() != numero)) {
			ponteiro = ponteiro.getProximo();
		}
		if (ponteiro == null) { // procurei e não achei
			return;
		}
		ponteiro.getAnterior().setProximo(ponteiro.getProximo());
		if (ponteiro.getProximo() != null) { // não é o último
			ponteiro.getProximo().setAnterior(ponteiro.getAnterior());
		}
	}
}
public class Lista {
	// Propriedades da classe
	private No cabeca = null;
	
	// Métodos da classe
	public void inserir(int numero) {
		// Instanciação/Alocação de um novo nó
		No novoNo = new No(numero, null);
		
		// Caso muito fácil: Lista vazia
		if (cabeca == null) {
			cabeca = novoNo;
			novoNo.setProximo(cabeca);
			return;
		}
		
		// Caso difícil: Lista NÃO vazia
		No ultimo = cabeca;
		while (ultimo.getProximo() != cabeca) {
			ultimo = ultimo.getProximo();
		}
		ultimo.setProximo(novoNo);
		novoNo.setProximo(cabeca);
	}
	
	public void imprimir() {
		// Caso fácil: Lista vazia
		if (cabeca == null) {
			return;
		}
		
		// Caso difícil: Lista NÃO vazia
		No ponteiro = cabeca;
		do {
			System.out.println(ponteiro.getNumero());
			ponteiro = ponteiro.getProximo();
		}while (ponteiro != cabeca);
	}
	
	public void excluir(int numero) {
		// Cenário 1: Lista vazia
		if (cabeca == null) {
			return;
		}
		
		// Cenário 2: Lista tem apenas 1 único nó
		if ((cabeca.getNumero() == numero) && (cabeca.getProximo() == cabeca)) {
			cabeca = null;
			return;
		}
		
		// Cenário 3: Lista tem mais de um nó, excluir o primeiro
		if (cabeca.getNumero() == numero) {
			No ultimo = cabeca;
			while (ultimo.getProximo() != cabeca) {
				ultimo = ultimo.getProximo();
			}
			cabeca = cabeca.getProximo();
			ultimo.setProximo(cabeca);
		}
		
		// Cenário 4: Lista tem mais de um nó, excluir no meio ou no fim
		No anterior = cabeca;
		while ((anterior.getProximo() != cabeca) && 
			   (anterior.getProximo().getNumero() != numero)) {
			anterior = anterior.getProximo();
		}
		if (anterior.getProximo() == cabeca) {
			return; // Cenário 6: Não foi encontrado o nó na lista
		}
		anterior.setProximo(anterior.getProximo().getProximo()); // Cenário 4 e 5
	}
}
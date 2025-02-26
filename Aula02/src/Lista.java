public class Lista {
	
	// Propriedades da classe
	private No cabeca = null;
	
	// Métodos da classe
	public void inserir(int numero) {
		// Caso fácil: lista vazia
		if (cabeca == null) {
			cabeca = new No(numero, null); 
			return;
		}
		
		// Caso médio: lista só tem um único nó
		if (cabeca.getProximo() == null) {
			cabeca.setProximo(new No (numero, null));
			return;
		}
		
		// Caso difícil: lsita tem vários nós, tem de procurar o último
		// Estudar esse Caso difícil
		No ultimo = cabeca;
		while (ultimo.getProximo() != null) {
			ultimo = ultimo.getProximo();
		}
		ultimo.setProximo(new No(numero, null));
	}
	
	public void imprimir() {
		No ponteiro = cabeca;
		while (ponteiro != null) {
			System.out.println(ponteiro.getNumero());
			ponteiro = ponteiro.getProximo();
		}
	}
	
	public void remover(int numero ) {
		// Caso muito fácil: Lista vazia
		if (cabeca == null) {
			return;
		}
		
		// Caso fácil: Excluir o primeiro nó
		if (cabeca.getNumero() == numero) {
			cabeca = cabeca.getProximo();
			return;
		}
		
		// Caso difícil: Excluir no meio ou no fim
		//Estudar esse caso
		No anterior = cabeca;
		while ((anterior.getProximo() != null) && // Cheguei no fim da lista, e não achei
			   (anterior.getProximo().getNumero() != numero)) {
			anterior = anterior.getProximo();
		}
		if (anterior.getProximo() == null) { // Caso (iv) número inexistente
			return;
		}
		anterior.setProximo(anterior.getProximo().getProximo());
	}
}
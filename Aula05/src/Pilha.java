public class Pilha {
	// Propriedades da classe
	private No cabeca = null;
	
	// Métodos da classe 
	public void push(int numero) {
		cabeca = new No(numero, cabeca);
	}
	
	public void pop() {
		// Cenário MUITO fácil: pilha vazia
		if (cabeca == null) {
			return;
		}
		
		// Cenário fácil: pilha cheia
		System.out.println(cabeca.getNumero());
		cabeca = cabeca.getProximo();
	}
}
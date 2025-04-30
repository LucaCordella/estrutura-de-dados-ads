public class No {
	// Propriedades da classe
	private int numero = 0;
	private No esquerda = null;
	private No direita = null;
	
	
	// Métodos construtores da classe
	public No() {
		super();
	}
	public No(int numero, No esquerda, No direita) {
		super();
		this.numero = numero;
		this.esquerda = esquerda;
		this.direita = direita;
	}
	
	// Métodos de acesso da classe
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public No getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}
	public No getDireita() {
		return direita;
	}
	public void setDireita(No direita) {
		this.direita = direita;
	}
}

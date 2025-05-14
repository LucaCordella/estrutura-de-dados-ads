public class No {
	// Propriedades da classe
	private int numero = 0;
	private No esquerda = null;
	private No direita = null;
	private boolean cor = false; // vermelho é TRUE, preto é FALSE
	
	// Métodos construtores da classe
	public No() {
		super();
	}
	
	public No(int numero, No esquerda, No direita, boolean cor) {
		super();
		this.numero = numero;
		this.esquerda = esquerda;
		this.direita = direita;
		this.cor = cor;
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

	public boolean isCor() {
		return cor;
	}

	public void setCor(boolean cor) {
		this.cor = cor;
	}
}
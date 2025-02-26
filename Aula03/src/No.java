public class No {
	// Propriedades da classe
	private int numero = 0;
	private No anterior = null;
	private No proximo = null;
	
	// Métodos construtores da classe 
	public No() {
		super();
	}
	
	public No(int numero, No anterior, No proximo) {
		super();
		this.numero = numero;
		this.proximo = proximo;
		this.anterior = anterior;
	}
	
	// Métodos de acesso a classe
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	
}
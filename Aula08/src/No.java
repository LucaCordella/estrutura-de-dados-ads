public class No {
	// Propriedades da classe
	private int numero = 0;
	private No filho1 = null;
	private No filho2 = null;
	private No filho3 = null;
	private No filho4 = null;
	private No filho5 = null;

	// Métodos construtores da classe
	public No() {
		super();
	}

	public No(int numero, No filho1, No filho2, No filho3, No filho4, No filho5) {
		super();
		this.numero = numero;
		this.filho1 = filho1;
		this.filho2 = filho2;
		this.filho3 = filho3;
		this.filho4 = filho4;
		this.filho5 = filho5;
	}

	// Métodos de acesso da classe
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public No getFilho1() {
		return filho1;
	}

	public void setFilho1(No filho1) {
		this.filho1 = filho1;
	}

	public No getFilho2() {
		return filho2;
	}

	public void setFilho2(No filho2) {
		this.filho2 = filho2;
	}

	public No getFilho3() {
		return filho3;
	}

	public void setFilho3(No filho3) {
		this.filho3 = filho3;
	}

	public No getFilho4() {
		return filho4;
	}

	public void setFilho4(No filho4) {
		this.filho4 = filho4;
	}

	public No getFilho5() {
		return filho5;
	}

	public void setFilho5(No filho5) {
		this.filho5 = filho5;
	}
}
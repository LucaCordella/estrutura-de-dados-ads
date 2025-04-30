public class No {
	// Propriedades da classe
	private int numero = 0;
	private No proximoNo = null;
	
	// Métodos construtores da classe
	public No() {
		super();
	}

	public No(int numero, No proximoNo) {
		super();
		this.numero = numero;
		this.proximoNo = proximoNo;
	}

	// Métodos de acesso da classe
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public No getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}
}
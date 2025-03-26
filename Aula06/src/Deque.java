public class Deque {
	// Constantes da classe
	private static final int TAXA_ATENDIMENTO_PREFERENCIAL = 3;
	
	// Propriedades da classe
	private No filaNormal = null;
	private No filaPreferencial = null;
	
	// Métodos da classe 
	public void entrar(int numero, boolean preferencial) {
		if (preferencial) {
			filaPreferencial = new No(numero, filaPreferencial);
		}else {
			filaNormal = new No(numero, filaNormal);
		}
	}
	
	public int sair(No fila) {
		// Cenário MUITO fácil: fila vazia
		if(fila == null) {
			return -1;
		}
		
		// Cenário fácil: fila só tem um único Nó
		if (fila.getProximo() == null) {
			int retorno = fila.getNumero();
			if (fila.equals(filaNormal)) {
				filaNormal = null;
			}else {
				filaPreferencial = null;
			}
			return retorno;
		}
		
		// Cenário difícil: fila tem mais de um Nó
		No penultimo = fila;
		while (penultimo.getProximo().getProximo() != null) {
			penultimo = penultimo.getProximo();
		}
		int retorno = penultimo.getProximo().getNumero();
		penultimo.setProximo(null);
		return retorno;
	}
	
	private int contadorAtendimentoPreferencial = 0;
	public int atender() {
		// Caso MUITO fácil: só tem gente na normal
		if (filaPreferencial == null) {
			return sair(filaNormal);
		}
		
		// Caso MUITO fácil: só tem gente na preferencial
		if (filaNormal == null) {
			return sair(filaPreferencial);
		}
		
		// Caso difícil: tem gente em ambas filas
		if (contadorAtendimentoPreferencial == TAXA_ATENDIMENTO_PREFERENCIAL) {
			contadorAtendimentoPreferencial = 0;
			return sair(filaNormal);
		}else {
			contadorAtendimentoPreferencial++;
			return sair(filaPreferencial);
		}
	}
}
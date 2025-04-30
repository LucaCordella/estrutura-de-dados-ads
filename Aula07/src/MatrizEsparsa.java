public class MatrizEsparsa {
	// Constantes da classe
	private static final int MODULO = 16;
	
	// Propriedades da classe
	private Diretor cabeca = null;
	
	// Métodos da classe
	private Diretor procurarDiretor(int resto) {
		// Procurar o diretor até encontrar ou até acabar a lista de diretores
		Diretor ponteiroDiretor = cabeca;
		while ((ponteiroDiretor != null) && (ponteiroDiretor.getResto() != resto)) {
			ponteiroDiretor = ponteiroDiretor.getProximoDiretor();
		}
		
		// Cenário fácil: não encontrei, tenho de criar
		if (ponteiroDiretor == null) {
			cabeca = new Diretor(resto, cabeca, null);
			return cabeca;
		}
		
		// Cenário MUITO fácil: encontrei, devolver o encontrado
		return ponteiroDiretor;
	}
	
	public void inserir(int numero) {
		Diretor ponteiroDiretor = procurarDiretor(numero % MODULO);
		
		ponteiroDiretor.setProximoNo(new No(numero, ponteiroDiretor.getProximoNo()));
	}
	
	public void imprimir() {
		Diretor ponteiroDiretor = cabeca;
		
		System.out.println("Índice\tCluster");
		while (ponteiroDiretor != null) {
			System.out.print(ponteiroDiretor.getResto() + "\t");
			
			No ponteiroNo = ponteiroDiretor.getProximoNo();
			while (ponteiroNo != null) {
				System.out.print(ponteiroNo.getNumero() + ", ");
				ponteiroNo = ponteiroNo.getProximoNo();
			}
			
			System.out.println();
			ponteiroDiretor = ponteiroDiretor.getProximoDiretor();
		}
	}
	
	public void excluir(int numero) {
		Diretor ponteiroDiretor = procurarDiretor(numero % MODULO);
		
		// Caso MUITO fácil: lista de nós vazia
		if (ponteiroDiretor.getProximoNo() == null) {
			return;
		}
		
		// Caso fácil: excluir o primeiro nó da lista
		if (ponteiroDiretor.getProximoNo().getNumero() == numero) {
			ponteiroDiretor.setProximoNo(ponteiroDiretor.getProximoNo().getProximoNo());
			return;
		}
		
		// Caso difícil: excluir um nó no meio ou no final da lista
		No ponteiroNo = ponteiroDiretor.getProximoNo();
		while ((ponteiroNo.getProximoNo() != null) &&
			   (ponteiroNo.getProximoNo().getNumero() != numero)) {
			ponteiroNo = ponteiroNo.getProximoNo();
		}
		
		if (ponteiroNo.getProximoNo() == null) {
			return;
		}
		
		ponteiroNo.setProximoNo(ponteiroNo.getProximoNo().getProximoNo());
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Grafo {
	// Propriedades da classe
	boolean[][] grafo = null;
	
	// Método construtor da classe
	public Grafo(int tamanho) {
		grafo = new boolean[tamanho][tamanho];
	}
	
	// Métodos da classe
	public void construir(boolean aleatoriedade) throws Exception {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0 ; i < (grafo.length - 1) ; i++) {
			for (int j = (i + 1) ; j < grafo.length ; j++) {
				boolean adjacencia = false;
				if (aleatoriedade) {
					adjacencia = (((int) (100 * Math.random())) == 1);
				} else {
					System.out.print("Digite <1> se " + i +
									 " for adjacente a " + j + ": ");
					adjacencia = (Integer.parseInt(leitor.readLine()) == 1);
				}
				grafo[i][j] = adjacencia;
				grafo[j][i] = adjacencia;
			}
		}
	}
	
	private boolean procurarPercursoRecursivo(boolean visitado[], int inicio, int fim) {
		if (inicio == fim) {
			return true;
		}
		
		visitado[inicio] = true;
		for (int vizinho = 0 ; vizinho < grafo.length ; vizinho++) {
			if ((grafo[inicio][vizinho]) && (! visitado[vizinho])) {
				if (procurarPercursoRecursivo(visitado, vizinho, fim)) {
					System.out.print(vizinho + " <- ");
					return true;
				}
			}
		}
		
		return false;
	}
	
	public void procurarPercurso(int inicio, int fim) {
		if (procurarPercursoRecursivo(new boolean[grafo.length], inicio, fim)) {
			System.out.println(inicio);
		} else {
			System.out.println("Não há caminho entre esses vértices !");
		}
	}
}
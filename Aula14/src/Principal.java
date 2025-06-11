import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Principal {
	public static void main(String[] args) {
		// Declaração de variáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Grafo objGrafo = new Grafo(10000);
		int inicio = 0;
		int fim = 0;
		
		// Processamento
		try {
			objGrafo.construir(true);
			do {
				System.out.print("Digite vértice inicial: ");
				inicio = Integer.parseInt(leitor.readLine());
				
				System.out.print("Digite vértice final: ");
				fim = Integer.parseInt(leitor.readLine());
				
				objGrafo.procurarPercurso(inicio, fim);
			} while (inicio != fim);
		} catch (Exception erro) {
			System.out.println(erro);
		}
	}
}
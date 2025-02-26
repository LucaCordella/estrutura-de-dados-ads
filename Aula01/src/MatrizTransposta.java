import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MatrizTransposta {
	public static void main(String[] args) {
		
		// Declaração de Variáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		int[][] matrizOriginal = new int [2][3];
		int[][] matrizTransposta = new int[3][2];
		
		// Entrada de dados
		try {
			for (int i = 0 ; i < matrizOriginal.length ; i++) {
				for (int j = 0 ; j < matrizOriginal[i].length ; j++) {
					System.out.print("matrizOriginal[" + i + "][" + j + "] = ");
					matrizOriginal[i][j] = Integer.parseInt(leitor.readLine());
				}
			}
		} catch (Exception erro) {}
		
		// Processamento
		for (int i = 0 ; i < matrizOriginal.length ; i++) {
			for (int j = 0 ; j < matrizOriginal[i].length ; j++) {
				matrizTransposta[j][i] = matrizOriginal[i][j];
			}
		}
		
		// Saída de dados
		System.out.println("===== Matriz Original =====");
		for (int i = 0 ; i < matrizOriginal.length ; i++) {
			for (int j = 0 ; j < matrizOriginal[i].length ; j++) {
				System.out.print(matrizOriginal[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("===== Matriz Transposta =====");
		for (int i = 0 ; i < matrizTransposta.length ; i++) {
			for (int j = 0 ; j < matrizTransposta[i].length ; j++) {
				System.out.print(matrizTransposta[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

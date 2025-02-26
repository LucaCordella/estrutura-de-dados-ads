import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultiplicacaoMatrizes {
	public static void main(String[] args) {
		// Declaração de Variáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		int[][] operando1 = new int[2][3];
		int[][] operando2 = new int[3][2];
		int[][] resultado = new int[2][2];
		
		// Entrada de dados
		try {
			for (int i = 0 ; i < operando1.length ; i++) {
				for (int j = 0 ; j < operando1[i].length ; j++) {
					System.out.print("operando1[" + i + "][" + j + "] = ");
					operando1[i][j] = Integer.parseInt(leitor.readLine());
				}
			}
			
			for (int i = 0 ; i < operando2.length ; i++) {
				for (int j = 0 ; j < operando2[i].length ; j++) {
					System.out.print("operando2[" + i + "][" + j + "] = ");
					operando2[i][j] = Integer.parseInt(leitor.readLine());
				}
			}
		}catch (Exception e) {}
		
		// Processamento
		for (int i = 0 ; i < resultado.length ; i++) {
			for (int j = 0 ; j < resultado[i].length ; j++) {
				for (int k = 0 ; k < operando2.length ; k++) {
					resultado[i][j] += (operando1[i][k] * operando2[k][j]);
				}
			}
		}
		
		// Saída de dados
		for (int i = 0 ; i < resultado.length ; i++) {
			for (int j = 0 ; j < resultado[i].length ; j++) {
				System.out.print(resultado[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

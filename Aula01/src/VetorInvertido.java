import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VetorInvertido {
	public static void main (String args[]) {
		
		// Declaração de variáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		int[] vetorOriginal = new int[5];
		int[] vetorInvertido = new int[5];
		
		// Entrada de dados
		try {
			for (int i = 0 ; i < vetorOriginal.length ; i++) {
			System.out.print("Digite o valor da posição " + i + " do vetor original: ");
			vetorOriginal[i] = Integer.parseInt(leitor.readLine());
			}
		}catch (Exception erro) {}
		
		// Processamento
		for (int i = 0 ; i < vetorOriginal.length ; i++) {
			vetorInvertido[vetorOriginal.length - 1 - i] = vetorOriginal[i];
		}
		
		// Saída de dados
		for (int i = 0 ; i < vetorInvertido.length ; i++) {
			System.out.println("vetorInvertido[" + i + "] = " + vetorInvertido[i]);
		}
	}
}

// Ctrl + Shift + O (Importa as coisas tudo)

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PreenchimentoVetor {
	public static void main (String args[]) {
		
		// Declaração de variáveis
		
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(
								System.in));
		int[] vetor = new int[10];
		
		// Entrada de dados
		try {
			for (int i = 0 ; i < vetor.length ; i++) {
				System.out.print(("Digite o valor da posição " + i + " do vetor: "));
				vetor[i] = Integer.parseInt(leitor.readLine());
			}
		} catch (Exception erro) {}
		
		// Saída de dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.println("Vetor[" + i + "] = " + vetor[i]);
		}
	}
}

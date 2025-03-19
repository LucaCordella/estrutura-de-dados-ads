public class Principal {
	public static void main(String[] args) {
		Fila objFila = new Fila();
		System.out.println("========= Fila =========");
		System.out.println();
		for (int i = 0 ; i < 10 ; i++) {
			objFila.entrar(i);
		}
		for (int i = 0 ; i < 11 ; i++) {
			objFila.sair();
		}
	
		System.out.println();
		System.out.println("========= Pilha =========");
		System.out.println();
		Pilha objPilha = new Pilha();
		for (int i = 0 ; i < 10 ; i++) {
			objPilha.push(i);
		}
		for (int i = 0 ; i < 11 ; i++) {
			objPilha.pop();
		}
	}
}
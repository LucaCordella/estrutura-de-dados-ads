import java.math.BigInteger;

public class Principal {
	public static void main(String[] args) {
		Arvore objArvore = new Arvore();
		
		for (BigInteger i = BigInteger.ZERO ;
			 i.compareTo(new BigInteger("10000000")) < 0 ;
			 i = i.add(BigInteger.ONE)) {
			objArvore.inserir(0);
		}
		
		objArvore.imprimir();
	}
}
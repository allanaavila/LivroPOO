
public class ExemploForAvancadoNumeros {

	public static void main(String[] args) {
		// usando o comando for avancado com um vetor de um numero inteiro
		
		int j = 0;
		int[] squares = {0,1,4,9,16,25};
		
		
		for(int i: squares) {
			System.out.printf("%d ao quadrado é %d \n", j++, i);
		}

	}

}

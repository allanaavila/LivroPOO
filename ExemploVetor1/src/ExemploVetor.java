
public class ExemploVetor {

	public static void main(String[] args) {
		
		int[] vetor; //definindo o vetor, sendo apenas uma referencia
		
		vetor = new int[5];  // alocando 5 posicoes inteiras para o vetor
		
		vetor[0] = 10;
		vetor[1] = 20;
		vetor[2] = 30;
		vetor[3] = 40;
		vetor[4] = 50;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Elemento - vetor [" + i + "] = " + vetor[i]);
		}
		
		int vetorInt[] = { 30, 4, 9};
		
		for(int i = 0; i < vetorInt.length; i++) {
			System.out.println("Elemento - vetor [" + i + "] = " + vetorInt[i]);
		}

	}

}

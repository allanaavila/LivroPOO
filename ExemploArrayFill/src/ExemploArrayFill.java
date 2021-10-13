import java.util.Arrays;

public class ExemploArrayFill {
	
	public static void main(String[] args) {
		
		int vetor[] = new int[5];
		
		Arrays.fill(vetor, 20);
		
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(" " + vetor[i]);
		}
		
	}

}

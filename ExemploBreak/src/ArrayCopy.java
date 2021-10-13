
public class ArrayCopy {

	public static void main(String[] args) {
		
		int vetor[] = {1, 2, 3, 4};
		int vetor01[] = {5, 6, 7, 8};
		
		System.arraycopy(vetor, 0, vetor01, 1, 3);
		
		for(int i = 0; i < vetor01.length; i++) {
			System.out.print( " " + vetor01[i]);
			
		}

	}

}

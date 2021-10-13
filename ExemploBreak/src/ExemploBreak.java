import java.io.IOException;
import java.util.Scanner;

public class ExemploBreak {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Digite f para terminar: ");
		
		int letra = ' ';
		
		while(true) {
			// le do teclado de 1 caractere
			letra = System.in.read();
			if((char) letra == 'f') {
				break; // quebra o loop do while(true)
			}
		}
		
		System.out.println("O loop foi quebrado");
		System.out.println("Usando o comando break com label");
		breakLabel();

	}
	
	private static void breakLabel() {
		int[] tLista = { 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100
		};
		
		int i;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		labelbreak: while(true) { //primeiro nivel do loop e a definicao do label
			do {// segundo nivel do loop
				System.out.println("Digie um numero. (0 - fim)");
				num = sc.nextInt();
				
				if(num == 0) {
					break labelbreak; //quebra o primeiro nivel do loop
				}
				
				// valida o numero lido
				if(num < 0 || num > 100) {
					System.out.println("Digitar numeros entre 1 e 100");
				}
			}
			
			while(num < 0 || num > 100);
			for(i = 0; i < tLista.length; i++) {
				if(tLista[i] == num)
					break; // quebra o loop do for
			}
			
			if(i < tLista.length)
				System.out.println("O numero foi encontrado no vetor e esta na posicao " + i);
			else
				System.out.println("O numero nao foi encontrado no vetor");
		
		}
	}

}

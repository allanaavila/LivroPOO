import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		// declara e aloca espaco com 10 bytes do tipo primitivo int
		
		int variavel[] = new int[10];
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe os valores");
		
		for(int i = 0; i < variavel.length; i++) {
			System.out.println("Variavel [" + i + "]? ");
			
			variavel[i] = teclado.nextInt();
		}
		
		
		int soma = 0;
		int cont = 0;
		
		for(cont = 0; cont < variavel.length; cont++) {
			//soma os valores lidos
			
			soma += variavel[cont];
		}
		
		System.out.println("\n Media =  " + soma / cont);
	}

}

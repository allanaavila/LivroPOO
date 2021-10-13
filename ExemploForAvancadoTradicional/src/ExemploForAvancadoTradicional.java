import java.util.Scanner;

public class ExemploForAvancadoTradicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero de elementos: ");
		
		int tamanho = sc.nextInt();
		
		int vetor[] = new int[tamanho];
		
		if(tamanho > 0) {
			//for tradicional realizado a leitura dos dados via teclado
			
			for(int i = 0; i < tamanho; i++) {
				System.out.print("Elemento = [" + i + "]? ");
				vetor[i] = sc.nextInt();
			}
			
			int soma = 0;
			for(int elemento: vetor) {
				soma += elemento;  // somando os elementos
			}
			System.out.println("Media = " + soma / tamanho);
		}
		else {
			System.out.println("Valor lido é invalido!!!");
		}

	}

}

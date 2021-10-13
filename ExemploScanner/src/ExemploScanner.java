import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		
		System.out.print("Digite um numero inteiro: ");
		Scanner var = new Scanner(System.in);
		
		int numero = var.nextInt(); //declarando e iniciando a variavel
		
		System.out.println("Valor digitado = " + numero);
		
		System.out.print("Digite uma string composta: ");
		
		
		Scanner sc = new Scanner(System.in).useDelimiter("\r\n");
		
		String nome = sc.next();
		
		System.out.println("String digitada = " + nome);
		
		System.out.print("Digite uma string composta: ");
		
		Scanner sc1 = new Scanner(System.in);
		
		String nome1 = sc1.nextLine();
		
		System.out.println("String digitada = " + nome1);
		
		System.out.print("Digite uma String composta: ");
		
		nome1 = sc1.next();
		
		System.out.println("String digitada = " + nome1);
		
		
		
		
		
		
		
		
		
		
	}

}

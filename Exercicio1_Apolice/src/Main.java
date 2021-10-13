import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Apolice novoObj = new Apolice();
		
		novoObj.idade = 25;
		
		novoObj.nomeSegurado = "Allana Cristina Diniz Mendes de Avila";
		
		novoObj.valorPremio = 500;
		
		System.out.println();
		
		System.out.println("Imprimir os dados inicializados");
		
		novoObj.imprimir();
		
		novoObj.calcularPremioApolice();
		
		System.out.println();
		
		System.out.println("Imprimindo os dados apos a execucao do metodo calcularPremioApolice");
		
		novoObj.imprimir();
		
		novoObj.oferecerDesconto("Curitiba");
		
		System.out.println();
		
		System.out.println("Imprimindo os dados apos a execucao do metodo oferecerDesconto");
		
		novoObj.imprimir();
		

		
		
		
		
		
		
		

	}

}


public class Main {

	public static void main(String[] args) {
		
		Computador novoObj = new Computador();
		
		novoObj.marca = "HP";
		novoObj.cor = "Preto";
		novoObj.modelo = "DV6383";
		novoObj.numeroSerie = 12348933;
		novoObj.preco = 3000;
		
		System.out.println("Imprimindo os dados inicializados");
		
		novoObj.imprimir();
		novoObj.calcularValor();
		
		System.out.println();
		
		System.out.println("Imprimindo os dados apos a execucao do metodo CalcularValor");
		
		novoObj.imprimir();
		
		Computador novoObj1 = new Computador();
		
		novoObj1.marca = "IBM";
		novoObj1.cor = "Branco";
		novoObj1.modelo = "IBM583";
		novoObj1.numeroSerie = 9873312;
		novoObj1.preco = 4000;
		
		
		novoObj1.calcularValor();
		
		System.out.println();
		
		System.out.println("Imprimindo os dados apos a execucao do metodo CalcularValor");
		
		novoObj1.imprimir();
		
		
		int ret = novoObj1.alterarValor(2000);
		
		if(ret > 0) {
			System.out.println("Valor Alterado!!!");
		}
		else {
			System.out.println("Valor NAO Alterado!!!");
		}
		
		System.out.println();
		
		System.out.println("Imprimindo dados apos a execucao do metodo alterarValor");
		
		novoObj1.imprimir();
		
		System.out.println();
		
		System.out.println("Executando o metodo alterarValor com o valor negativo");
		
		ret = novoObj1.alterarValor(-1300);
		
		if(ret > 0) {
			System.out.println("Valor Alterado!!!");
		}
		else {
			System.out.println("Valor NAO Alterado!!!");
		}
		
		System.out.println();
		
		System.out.println("Imprimindo dados apos a execucao do metodo alterarValor");
		
		novoObj1.imprimir();
			

	}

}

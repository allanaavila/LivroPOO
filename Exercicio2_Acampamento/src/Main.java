
public class Main {

	public static void main(String[] args) {
		
		
		Acampamento novoObj = new Acampamento();
		
		novoObj.idade = 22;
		
		novoObj.nome = "Allana Avila";
		
		System.out.println("Imprimindo os dados inicializados");
		
		novoObj.imprimir();
		
		novoObj.separarGrupo();
		
		System.out.println();
		
		System.out.println("Imprimindo os dados apos a execucao do metodo separarGrupo");
		
		novoObj.imprimir();
	}

}

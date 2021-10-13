
public class Eleitoral {
	
	String nome;
	int idade;
	
	
	public void imprimir() {
		
		System.out.println("Nome do Eleitor: " + this.nome + " ");
		
		System.out.println("Idade do Eleitor: " + this.idade + " ");
		
		verificar();
	}
	
	public void verificar() {
		
		if(this.idade < 16) {
			System.out.println("Eleitor não pode votar");
		}
		if((this.idade >= 16) && (this.idade <= 65)) {
			System.out.println("Eleitor deve votar");
		}
		if(this.idade > 65) {
			System.out.println("Voto Facultativo");
		}
	}

}


public class Apolice {
	
	String nomeSegurado;
	int idade;
	double valorPremio;
	
	
	
	public void imprimir() {
		
		System.out.println("Nome: " + nomeSegurado + " ");
		System.out.println("Idade: " + idade + " ");
		System.out.println("Valor do Premio: " + valorPremio + " ");
	}
	
	public void calcularPremioApolice() {
		
		if(this.idade >= 18 && this.idade <= 25){
			
			this.valorPremio += (this.valorPremio * 20)/100;
		}
		
		
		if(this.idade >= 25 && this.idade <= 36) {
			
			this.valorPremio += (this.valorPremio * 15)/100;
		}
		
		if(this.idade > 36) {
			
			this.valorPremio += (this.valorPremio * 10)/100;
		}
	}
	
	
	public void oferecerDesconto(String nomeCidade) {
		
		if(nomeCidade.equals("Curitiba")) {
			this.valorPremio -= (this.valorPremio * 20)/100;
		}
		
		if(nomeCidade.equals("Rio de Janeiro")) {
			this.valorPremio -= (this.valorPremio * 15)/100;
		}
		
		if(nomeCidade.equals("Sao Paulo")) {
			this.valorPremio -= (this.valorPremio * 10)/100;
		}
		if(nomeCidade.equals("Belo Horizonte")) {
			this.valorPremio -= (this.valorPremio * 5)/100;
		}
	}

}

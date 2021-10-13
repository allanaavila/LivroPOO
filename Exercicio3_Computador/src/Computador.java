
public class Computador {
	
	String marca;
	String cor;
	String modelo;
	int numeroSerie;
	double preco;
	
	
	
	public void imprimir() {
		
		System.out.println("Marca: " + this.marca + " ");
		System.out.println("Cor: " + this.cor + " ");
		System.out.println("Modelo: " + this.modelo + " ");
		System.out.println("Numero de Serie:  " + this.numeroSerie);
		System.out.println("Preco: " + this.preco + " ");
	}
	
	public void calcularValor() {
		
		if(this.marca.equals("HP")) {
			this.preco = this.preco * 1.30;
		}
		
		if(this.marca.equals("IBM")) {
			this.preco = this.preco * 1.50;
		}
	}
	
	public int alterarValor(double novoValor) {
		if(novoValor > 0) {
			this.preco = novoValor;
			return 1;
		}
		return 0;
	}

}

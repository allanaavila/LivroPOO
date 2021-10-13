
public class PontoBidimensional {
	
	//exemplo do uso do conceito de overload com construtores
	
	private double x;
	private double y;
	
	
	//construtor sem argumentos, inicializando os atributos com 0
	
	public PontoBidimensional() {
		this.x = 0.0;
		this.y = 0.0;
	}
	
	//construtor composto por dois paramentros do tipo double 
	
	public PontoBidimensional(double px, double py) {
		this.x = px;
		this.y = py;
	}
	
	
	//metodo toString para converter os tipos primitivos em Strings e apresentar na tela
	
	public String toString() {
		
		return "Ponto2D [x = " + this.x + ", y = " + this.y + "]";
	}
	
}

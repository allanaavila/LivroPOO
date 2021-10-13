
public class ContaCorrenteSobrecarga {
	
	int conta;
	int agencia;
	double saldo;
	
	void efetuarSaque(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	void efetuarDeposito(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	void imprimirSaldo() {
		System.out.println(this.saldo);
	}
	
	void imprimirAtributos() {
		System.out.println("Metodos imprimirAtributos()");
	}
	
	void imprimirAtributos(int a) {
		System.out.println("Metodos imprimirAtributos(int a)");
	}
	
	void imprimirAtributos(char a) {
		System.out.println("Metodos imprimirAtributos(char a)");	
	}
	
	void imprimirAtributos(int a, char b) {
		System.out.println("Metodos imprimirAtributos(int a, char b)");
	}
	
	void imprimirAtributos(char b, int a) {
		System.out.println("Metodos imprimirAtributos(char b, int a)");
	}
	
	// int imprimirAtributos(char a){}
	/*A linha anterior ira gerar um erro por estar duplicando a definicao de metodo: 
	 * void imprimirAtributos(char a) */
}


public class ContaCorrente {
	
	int conta;
	int agencia;
	double saldo;
	String nomeCliente;
	
	
	public int sacar(double valor) {
		
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			
			return 1;
		}
		return 0;
		
	}
	
	public void depositar(double valor) {
		
		this.saldo = this.saldo + valor;
		
	}
	
	public void imprimir() {
		
		System.out.println("Conta: " + this.conta + " ");
		System.out.println("Agencia: " + this.agencia + " ");
		System.out.println("Saldo Conta Corrente: " + this.saldo + " ");
		System.out.println("Nome Cliente: " + this.nomeCliente + " ");
	}

}

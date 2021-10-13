
public class ContaCorrente {
	
	int conta;
	int agencia;
	double saldo;
	String nome;
	
	
	public int sacar(double valor) {
		if(valor > this.saldo) {
			return 0;
		}
		this.saldo = this.saldo - valor;
		return 1;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void imprimir() {
		System.out.println("Conta = " + this.conta);
		System.out.println("Agencia = " + this.agencia);
		System.out.println("Saldo = " + this.saldo);
		System.out.println("Nome Cliente = " + this.nome);
	}

}

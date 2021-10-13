
public class ContaCorrente {
	
	int conta;
	int agencia;
	double saldo;
	String nome;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	void efetuarSaque(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	void imprimirSaldo() {
		System.out.println(this.saldo);
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getConta() {
		return this.conta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}

}

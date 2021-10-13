
public class ContaCorrente {
	
	int conta;
	int agencia;
	double saldo;
	static double cpmf; // atributo estatico
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
	void efetuarDeposito(double valor) {
		this.saldo = saldo + valor;
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
	
	public void setCpmf(double cpmf) {
		ContaCorrente.cpmf = cpmf;
	}
	public double getCpmf() {
		return cpmf;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	

}

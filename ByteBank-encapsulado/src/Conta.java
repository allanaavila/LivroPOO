
public class Conta {
	
	//atributos
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	private static int total;
	
	//construtor padrao
	public Conta() {
		
	}
	
	//construtor 
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas é: " + Conta.total);
		
		
		this.agencia = agencia;
		this.numero = numero;
		
		System.out.println("Estou criando uma conta: " + this.numero);
		System.out.println("Agencia: " + this.agencia);
	}
	
	
	
	//metodo deposita
	public void deposita(double valor){
		this.saldo += valor;
		
	}
	
	//metodo saca
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	//metodotransfere
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			//destino.saldo += valor;
			destino.deposita(valor);
			return true;
			
		}
		return false;	
	}
	
	
	
	
	//getter e setters
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Nao pode valor <= 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}

}

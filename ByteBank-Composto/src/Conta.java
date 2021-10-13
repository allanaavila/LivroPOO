
public class Conta {
	
	//atributos
	
	double saldo = 100;
	int agencia;
	int numero;
	
	//associacao
	Cliente titular;


	
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

}

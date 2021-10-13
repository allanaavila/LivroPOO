
public class Principal {

	public static void main(String[] args) {
		
		
		ContaCorrente objeto1 = new ContaCorrente(); //criando o objeto1
		
		objeto1.efetuarSaque(41.80);
		objeto1.imprimirSaldo();
		
		ContaCorrente objeto2 = new ContaCorrente(); // criando o objeto 2
		
		objeto2.efetuarSaque(131.10);
		objeto2.imprimirSaldo();
		
		
	}

}

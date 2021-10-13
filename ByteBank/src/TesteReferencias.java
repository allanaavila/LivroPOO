
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		//primeiraConta.saldo = 300;
		
		System.out.println("Saldo da 1 conta: " + primeiraConta.getSaldo());
		
		Conta segundaConta  = primeiraConta; //referencia da primeiraConta para segundaConta
		
		System.out.println("Saldo da 2 conta: " + segundaConta.getSaldo());
		
		//segundaConta.saldo += 100;
		
		System.out.println("Saldo da 2 conta: " + segundaConta.getSaldo());
		
		System.out.println("Saldo da 1 conta: " + primeiraConta.getSaldo());
		
		if(primeiraConta == segundaConta) {
			System.out.println("Sao a mesmissima conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}

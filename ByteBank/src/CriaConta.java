
public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		//primeiraConta.saldo = 200;
		//primeiraConta.saldo += 100;
		
		System.out.println("Saldo 1 conta: " + primeiraConta.getSaldo());
		
		
		Conta segundaConta = new Conta();
		
		//segundaConta.saldo = 50;
		
		System.out.println("Saldo 2 conta: " + segundaConta.getSaldo());
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma Conta");
		}
		else {
			System.out.println("Contas Diferentes");
		}
		
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		//Conta terceiraConta = new Conta();
		
		//terceiraConta.saldo = 400;
		
		//System.out.println("Saldo 3 conta: " + terceiraConta.saldo);

	}

}

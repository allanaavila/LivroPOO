import java.util.Scanner;

public class Main {
	
	private static int case1;
	ContaCorrente cc = new ContaCorrente();

	public static void main(String[] args) {
		
		Main obj = new Main();
		
		int op = 0;
		
		while(op != 9) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Saque");
			System.out.println("3 - Deposito");
			System.out.println("4 - Consultar Saldo");
			System.out.println("9 - Sair");
			System.out.println("Entre com uma opcao: ");
			op = sc.nextInt();
			
			switch (op) {
				case 1:
					obj.execCadastrar();
					break;
				case 2:
					obj.execSaque();
					break;
				case 3:
					obj.execDeposito();
					break;
				case 4:
					obj.execConsulta();
					break;
			}
		}
	}	
	
	public void execDeposito() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor para o deposito: ");
		double valor = sc.nextDouble();
		
		this.cc.depositar(valor);
		System.out.println("Deposito realizado");
	}
	
	public void execSaque() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor para o saque: ");
		double valor = sc.nextDouble();
		
		int ret = this.cc.sacar(valor);
		
		if(ret ==1) {
			System.out.println("Saque realizado");
		}
		else {
			System.out.println("Saque NAO realizado");
		}
	}
	
	public void execConsulta() {
		this.cc.imprimir();
	}
	
	public void execCadastrar() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com nome do cliente:      ");
		this.cc.nomeCliente = sc.nextLine();
		
		System.out.println("Entre com o numero da agencia:    ");
		this.cc.agencia = sc.nextInt();
		
		System.out.println("Entre com o numero da conta:     ");
		this.cc.conta = sc.nextInt();
		
		System.out.println("Entre com o saldo da Conta Corrente:       ");
		this.cc.saldo = sc.nextDouble();
	}
			
}

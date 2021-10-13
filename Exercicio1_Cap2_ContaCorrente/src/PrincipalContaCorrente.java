import java.util.Scanner;

public class PrincipalContaCorrente {
	
	public final static int TAM = 3;
	
	ContaCorrente cc[] = new ContaCorrente[TAM];
	
	public static int indice = 0;
	
	//atributo utilizado para a pesquisa de uma conta corrente cadastrada no vetor
	
	int op;
	
	public int getOp() {
		return this.op;
	}
	
	public void setOp(int op) {
		/*
		 caso op seja menor ou igual a zero e ainda maior que o maior indice cadastrado
		 apresenta o erro e utiliza a primeira posicao como padrao.*/
		
		if(op > indice || op <= 0) {
			System.out.println("Posicao invalida. sera executada para a primiera posicao.");
			
			this.op = 1;
		}
		else {
			this.op = op;
		}
	}
	
	public static void main(String[] args) {
		
		PrincipalContaCorrente obj = new PrincipalContaCorrente();
		
		Scanner sc = new Scanner(System.in).useDelimiter("\r\n");
		
		
		while(true) {
			
			System.out.println("Podemos cadastrar somente 3 contas correntes.");
			System.out.println("1 - CADASTRAR");
			System.out.println("2 - SACAR");
			System.out.println("3 - DEPOSITAR");
			System.out.println("4 - CONSULTAR");
			System.out.println("9 -  SAIR");
			System.out.println("Entre com uma opcao: ");
			
			int opcaoMenu = sc.nextInt();
			
			
			switch (opcaoMenu) {
			
			case 1:
				obj.execCadastro();
				break;
			case 2: 
				obj.execSaque();
				break;
			case 3: 
				obj.execDeposito();
				break;
			case 4: 
				obj.execConsulta();
			default:
				if(opcaoMenu == 9)
					System.exit(0);
				System.out.println("Opcao Invalida");
			}
		}
		
	}
	
	public void execCadastro() {
		if(indice >= TAM) {
		
		System.out.println("Todas as posicoes ja foram ocupadas. Encerrando o programa.");
		System.exit(0);
	}
	//o conteudo \r\n define que o separador entre strings e o enter o padrao e o espaco
	
		Scanner sc = new Scanner(System.in).useDelimiter("\r\n");
	
		this.cc[indice] = new ContaCorrente();
	
		System.out.println("Digitar a conta: ");
		this.cc[indice].conta = sc.nextInt();
	
		System.out.println("Digitar a agencia: ");
		this.cc[indice].agencia = sc.nextInt();
	
		System.out.println("Digitar nome do cliente: ");
		this.cc[indice].nome = sc.next();
	
		System.out.println("Digitar o saldo: ");
		this.cc[indice].saldo = sc.nextDouble();
	
		indice ++;  //incrementando o indice para o vetor
	}	
	
	public void execSaque() {
		
		if(indice > 0) {
			System.out.println("Qual posicao devera ser sacada.");
			
			Scanner sc = new Scanner(System.in);
			
			//metodo setOP valida se a posicao digitada esta dentro dos limites
			
			setOp(sc.nextInt());
			
			System.out.println("Digite um valor: ");
			double valor = sc.nextDouble();
			
			int ret = this.cc[getOp() - 1].sacar(valor);
			
			if(ret == 0) {
				System.out.println("Saque NAO realizado");
			}
			else {
				System.out.println("Saque Realizado com Sucesso!!!");
			}
		}else {
				System.out.println("Nenhuma conta foi cadastrada");
			}
			
		}
	
	
	public void execDeposito() {
		
		if(indice > 0) {
			System.out.println("Qual posicao devera ser depositada");
			
			Scanner sc = new Scanner(System.in);
			
			setOp(sc.nextInt());
			
			System.out.print("Digite um valor: ");
			double valor = sc.nextDouble();
			
			this.cc[getOp() - 1].depositar(valor);
		}
		else {
			System.out.println("Nenhuma conta foi cadastrada");
		}
	}
	
	public void execConsulta() {
		if(indice > 0) {
			System.out.println("Qual posicao devera ser apresentada");
			
			Scanner sc = new Scanner(System.in);
			
			setOp(sc.nextInt());
			
			this.cc[getOp() - 1].imprimir();
			
		}
		else {
			System.out.println("Nenhuma conta foi cadastrada");
		}
	}

	
}



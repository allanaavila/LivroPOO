
public class TestaGetSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		
		//conta.numero = 1234;
		
		conta.setNumero(1234);
		
		System.out.println("Numero da conta: " + conta.getNumero());
		
		
		Cliente paulo = new Cliente();
		
		//conta.titular = paulo;
		
		//paulo.nome = "Paulo Silveira";
		
		paulo.setNome("Paulo Silveira");
		
		paulo.setCpf("123.123.123-78");
		
		paulo.setProfissao("Programador");
		
		conta.setTitular(paulo);
		
		
		System.out.println("Nome Titular: " + conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		//agora em duas linhas:
		
		Cliente titularConta = conta.getTitular();
		titularConta.setProfissao("Programador");
		
		
		System.out.println("Profissao: " + conta.getTitular().getProfissao());
		System.out.println("CPF: " + conta.getTitular().getCpf());
		
	}

}

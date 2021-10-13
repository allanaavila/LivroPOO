
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		
		//conta.saldo =  100;
		
		conta.deposita(50);
		
		System.out.println("Saldo da Conta do Paulo: " + conta.getSaldo());

		
		boolean conseguiuRetirar = conta.saca(20);
		
		System.out.println("Novo saldo da conta do Paulo: " + conta.getSaldo());
		System.out.println("Conseguiu sacar: " + conseguiuRetirar);
		
		
		Conta contaM = new Conta();
		
		contaM.deposita(1000);
		
		boolean sucessoTransferencia = contaM.transfere(400,  conta);
		if(sucessoTransferencia) {
			System.out.println("Transferencia com sucesso");
		}
		else {
			System.out.println("Saldo Insuficiente");
		}
		
		
		System.out.println("Conta da Marcela: " + contaM.getSaldo());
		
		System.out.println("Conta do Paulo pos Transferencia: " + conta.getSaldo());
		
		
		conta.titular = "Paulo Silveira";
		
		System.out.println(conta.titular);
		
		contaM.titular = "Marcela Macedo";
		
		System.out.println(contaM.titular);
	}

}

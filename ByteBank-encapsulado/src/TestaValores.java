
public class TestaValores {

	public static void main(String[] args) {
		
		//int total = 0;
		Conta conta = new Conta(1234, 23334);
		//total++;
		
		//conta esta inconsistente
		//conta.setAgencia(-50);
		//conta.setNumero(-330);
		
		//System.out.println(conta.getAgencia());
		
		
		conta.setAgencia(123445);
		
		
		Conta conta2 = new Conta(1234, 12356);
		
		Conta conta3 = new Conta(3455, 89674);
		
		
		//System.out.println(Conta.total);
		
		System.out.println("Total de contas abertas: " + Conta.getTotal());
		
		
	
	}

}

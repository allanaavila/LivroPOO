
public class Main {

	public static void main(String[] args) {
		
		Estoque es1 = new Estoque();
		
		
		es1.nomeProduto = "Mochilas";
		es1.quantidade = 100;
		es1.valor = 10;
		
		es1.imprimir();
		
		int ret = es1.verificarDisponibilidade(100);
		
		if(ret == 1) {
			System.out.println("Produto na quantidade informada DISPONIVEL");
		}
		else {
			System.out.println("Produto na quantidade informada INDISPONIVEL");
		}
		
		ret = es1.verificarDisponibilidade(500);
		
		if(ret == 1) {
			System.out.println("Produto na quantidade informada DISPONIVEL");
		}
		else {
			System.out.println("Produto na quantidade informada INDISPONIVEL");
		}
		
		
		Estoque es2 = new Estoque();
		
		es2.nomeProduto = "Pastas";
		es2.quantidade = 50;
		es2.valor = 250;
		
		es2.imprimir();
		
		ret = es2.verificarDisponibilidade(120);
		
		if(ret == 1) {
			System.out.println("Produto na quantidade informada DISPONIVEL");
		}
		else {
			System.out.println("Produto na quantidade informada INDISPONIVEL");
		}
		
		Estoque es3 = new Estoque();
		
		es3.nomeProduto = "Telefones";
		es3.quantidade = 150;
		es3.valor = 59;
		
		es3.imprimir();
		
		ret = es3.verificarDisponibilidade(120);
		
		if(ret == 1) {
			System.out.println("Produto na quantidade informada DISPONIVEL");
		}
		else {
			System.out.println("Produto na quantidade informada INDISPONIVEL");
		}
		
		

	}

}


public class Estoque {
	
	String nomeProduto;
	double valor;
	int quantidade;
	
	
	public void imprimir() {
		
		System.out.println("Nome Produto: " + this.nomeProduto + " ");
		System.out.println("Quantidade:  " + this.quantidade + " ");
		System.out.println("Valor:  " + this.valor + " ");
		
	}
	
	public int verificarDisponibilidade(int quant) {
		
		if((this.quantidade > 0) && (this.quantidade >= quant)) {
			return 1;
		}
		return 0;
	}
	
	public int removerProdutos(int quant) {
		
		int ret = verificarDisponibilidade(quant);
		
		if(ret ==1) {
			this.quantidade = this.quantidade - quant;
			return 1;
		}
		return 0;
	}

}

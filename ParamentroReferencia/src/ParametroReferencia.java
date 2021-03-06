
public class ParametroReferencia {

	//exemplo da passagem de parametros usando tipos referencia
	
	int meuAtributo = 0;
	
	//metodo construtor sem argumentos.Utilizado na criacao do objeto
	
	public ParametroReferencia() {
		
	}
	
	public ParametroReferencia(int meuAtributo) {
		this.meuAtributo = meuAtributo;
	}
	
	public void alterarValor(int arg) {
		this.meuAtributo = arg;
	}
	
	public String toString() {
		//a classe Integer e uma classe wrapper 
		
		return Integer.toString(this.meuAtributo);
	}
	
	public void alterar1() {
		ParametroReferencia y = new ParametroReferencia(1);
		
		System.out.println(y.toString());
		
		alterar2(y);
		
		System.out.println(y.toString());
	}
	
	public void alterar2(ParametroReferencia param) {
		//este metodo esta alterando o valor do atributo da classe
		
		param.alterarValor(2);
		
		System.out.println(param.toString());
	}
}

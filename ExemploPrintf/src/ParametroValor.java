
public class ParametroValor {
	
	//exemplo da passagem de parametros usando tipos primitivos
	
	public void alterar1() {
		
		int y = 1;
		System.out.println(y);
		
		//passando o valor de y como parametro para o metodo alterar2();
		
		alterar2(y);
		System.out.println(y);
	}
	
	public void alterar2(int param) {
		//mesmo alterando o valor de param para 2 esta alteracao nao ira refletir na variavel y
		
		param = 2;
		
		System.out.println(param);
	}

}


public class Main {

	public static void main(String[] args) {
		
		//instanciar objetos da classe Ponto2D. Ira executar o construtor se argumentos
		
		
		PontoBidimensional obj = new PontoBidimensional();
		
		
		System.out.println(obj.toString());
		
		//fara a execucao automatica do construtor que recebe dois parametros do tipo double
		
		PontoBidimensional obj1 = new PontoBidimensional(10.0, 20.0);
		
		System.out.println(obj1.toString());

	}

}

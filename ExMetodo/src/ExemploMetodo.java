import java.util.Date;

public class ExemploMetodo {
	
	
	private int meuAtributo = 0; 
	
	public static void main(String[] args) {
		
		Date today = new Date();   // pode ser usado por qualquer metodo
		
		System.out.println(today);
		
		imprimir();
		
	}
	
	public static void imprimir() {
		// esta variavel podera ser usada somente no metodo imprimir()
		
		int minhaVariavel = 0;
		System.out.println("metodo imprimir");
	}

}

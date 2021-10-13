
public class OperadorUnario {

	public static void main(String[] args) {
		
		int var1 = 10;
		int var2 = 20;
		int res = 0;
		
		res = var1 + var2;
		
		System.out.println("res: " + res);  //imprime 30
		
		res = var1++ + var2; //var1 vai valer 11 aois a execucao do operador
		
		System.out.println("res: " + res); //imprime 30
		
		res = var1 + var2;
		
		System.out.println("res: " + res); // imprime 31
		
		res = var1 + --var2;
		
		System.out.println("res: " + res); //imprime 30

	}

}

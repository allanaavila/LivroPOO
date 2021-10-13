import java.io.Console;

public class OperadorLogico {

	public static void main(String[] args) {
		
		
		if(Console.readInt("\n Numero 1: ") > 10 && Console.readInt("Numero 2: ") > 10) {
			System.out.println("Os dois numeros sao maiores que 10.");
		}
		else {
			System.out.println("O primeiro ou o segundo numeo nao e maior que 10");
		}

	}

}

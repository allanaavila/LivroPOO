import java.io.IOException;

public class ExemploWhile {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Digite f para terminar: ");
		
		int letra = ' ';
		
		do {
			letra = System.in.read();
		}
		
		while((char) letra != 'f');
		

	}

}

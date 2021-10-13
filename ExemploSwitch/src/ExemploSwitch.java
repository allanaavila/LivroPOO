import java.io.IOException;

public class ExemploSwitch {

	public static void main(String[] args)  throws IOException{
		
		System.out.println("Digite uma das letras da palavra JAVA: ");
		
		int numero = System.in.read(); // le do teclado apenas um caractere
		
		switch((char) numero) {
			
			case 'J':
			case 'j':
			case 'A':
			case 'a':
			case 'V':
			case 'v':
				
				System.out.println("Letra digitada esta correta!");
				break;
			
			case (char) 13: //utilizando para tratar o enter
				
				System.out.println("Foi digitado apenas um <enter> .");
			
				break;
				
			default:
				
				System.out.println("Letra digitada incorreta!");
		}
		

	}

}

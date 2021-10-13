import java.io.IOException;

public class ExemploIFElse {

	public static void main(String[] args)  throws IOException{
		
		System.out.println("Digte uma das letras da Palavra JAVA: ");
		
		int numero = System.in.read(); //le do teclado apenas um caractere
		
		if(((char) numero == 'J') || ((char) numero == 'j')
			|| ((char) numero == 'A') || ((char) numero == 'a') 
				|| ((char) numero == 'V') || ((char) numero == 'v')){
					System.out.println("Letra digitada esta correta!");
				}
				else {
					if((char) numero == (char) 13) {
						System.out.println("Foi digitado apenas um <enter>.");
					}
					else {
						System.out.println("Letra digitada esta incorreta!");
					}
				}

	}

}


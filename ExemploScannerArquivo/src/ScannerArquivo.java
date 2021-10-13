import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Numeros contidos no arquivo: ");
		
		Scanner sc = new Scanner(new File(".\\modulo1\\numeros.txt"));
		
		while(sc.hasNextLong()) {
			long aLong = sc.nextLong();
			System.out.println("Numero: " + aLong);
		}

	}

}


public class ExemploContinue {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 30; i++) {
			if((i > 10) && (i < 20)) {
				continue;
			}
			//apresenta na tela quando o i nao estiver entre 10 e 20
			System.out.println("i = " + i);
		}
		// devido a execucao os numeros  entre 11 e 19 nao imprimi
	}

}

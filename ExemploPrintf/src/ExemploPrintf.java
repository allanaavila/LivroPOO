
public class ExemploPrintf {

	public static void main(String[] args) {
		
		System.out.printf("|%8d|\n", 820);
		
		System.out.printf("|%2.6f|\n", 1223, 4432);
		
		System.out.printf("|%2.2f|\n", 1223, 4432);
		
		System.out.printf("|%10.2f|\n", 1223, 4432);
		
		System.out.printf("|%010.2f|\n", 1223, 4432);
		
		System.out.printf("|%20f|\n", 1223, 4432);
		
		System.out.printf("|%.2f|\n", 1223, 4432);
		
		System.out.printf("|%10s|\n", "abcdefghijklmnopqrstuvxywz");
		
		System.out.printf("|%10.8s|\n", "abcdefghijklmnopqrstuvxywz");
		
		System.out.printf("|%10s|\n", "abcde");
		
		//alinhado a esquerda
		
		System.out.printf("|%-10s|\n", "abcde");
		
		//arredondamento na sexta casa
		
		System.out.printf("%f\n", 10.123456589);
		
		System.out.printf("%f\n", 10.123456589);
		
		
		
	}

}

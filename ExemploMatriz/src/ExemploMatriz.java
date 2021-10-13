
public class ExemploMatriz {

	public static void main(String[] args) {
		
		//usando uma matriz com inicializacao direta
		
		int[][] matriz; //definindo a matriz
		
		matriz = new int[2][3]; // alocando espaco para a matriz
		
		matriz[0][0] = 10;
		matriz[0][1] = 20;
		matriz[0][2] = 30;
		matriz[1][0] = 40;
		matriz[1][1] = 50;
		matriz[1][2] = 60;
		
		for(int i = 0 ; i < matriz.length; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(matriz[i][j]);
			}
		}

	}

}

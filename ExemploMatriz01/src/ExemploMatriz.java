
public class ExemploMatriz {

	public static void main(String[] args) {
		//usando uma matriz com inicializacao feita pela leitura de dados do teclado
		
		double matriz[][] = new double [3][4]; // cria uma matrix com 3 linhas e 4 colunas
		
		for(int l = 0; l < matriz.length; l++) {//carregando matriz
			for(int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = l * matriz[l].length + c;
			}
		}
		
		for(int l = 0; l < matriz[l].length; l++) {
			//utilizando a linha (matriz[l].length) para inicializar o tamanho da coluna
			for(int c = 0; c < matriz[l].length; c++) {
				System.out.print(matriz[l][c] + "\t"); // \t apresenta a tab
			}
			System.out.println();
		}

	}

}

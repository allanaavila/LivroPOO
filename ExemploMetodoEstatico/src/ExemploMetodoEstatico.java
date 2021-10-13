
// Exemplo de acesso a metodos estaticos

public class ExemploMetodoEstatico {
	
	// atributo estatico visivel para todos os outros objeto
	
	private static int objetos = 0;
	
	//o metodo ExemploMetodoEstatico incrementa o atributo estatico objetos
	
	public ExemploMetodoEstatico() {
		
		objetos++;
	}
	
	//metodo estatico
	public static int getObjetos() {
		return objetos;
	}
	
}

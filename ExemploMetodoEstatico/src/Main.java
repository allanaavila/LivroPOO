// exemplo de uso de uma classe com atributo e metodo estatico


public class Main {

	public static void main(String[] args) {
		//fazendo acesso ao metodo getObjetos de forma correta
		
		System.out.println("Quantidade Objetos: " + ExemploMetodoEstatico.getObjetos());
		
		System.out.println("Criando um objeto");
		
		ExemploMetodoEstatico d = new ExemploMetodoEstatico();
		
		System.out.println("Quantidade de Objetos criado: " + d.getObjetos());

	}

}

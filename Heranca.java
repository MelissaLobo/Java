package estudos;

class Animal{
	
	public Animal() {
		System.out.println("construiu animal");
	}
	
	public Animal(String nome) {
		System.out.println("construiu animal" +nome);
	}
	
}

class Gato extends Animal{
	
	public Gato() {
		System.out.println("construiu gato");
	}
	
	public Gato(String a,String b){
		
	}
	
}

public class Heranca {
	
	public static void main(String[] args) {
		//new Animal();
		new Gato();
	
		
	}

}

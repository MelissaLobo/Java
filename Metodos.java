package estudos;

public class Metodos {

	public int  somar( int num1, int num2 ){
		return num1 + num2;
	}
}

class Metodo{ 
	public void escrever() { 
		System.out.println("Método sem Retorno - VOID "); 
	}
}

class MetodosSemRetorno2 { 

	public static void main(String[] args) { 
		Metodo m = new Metodo(); 
		m.escrever(); 
	} 
}

//Retorna uma String
class MetodoComRetorno{

	String nome = "Melissa Lobo";
	public String retornaNome(){
		return nome;
	}
}

class Metodo_Com_Retorno {

	public static void main(String[] args) {
		MetodoComRetorno m = new MetodoComRetorno();
		System.out.println(m.retornaNome());

	}
}

//Retorna um Inteiro
class ValoresInt{
	public int calculadora(){
		int primeiroNumero = 10;
		int segundoNumero = 20;
		return primeiroNumero + segundoNumero;
	}
}

class Metodo_Com_Retorno_Inteiro {

	public static void main(String[] args) {
		ValoresInt valores = new ValoresInt();

		System.out.print(valores.calculadora());
	}
}

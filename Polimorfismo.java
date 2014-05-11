import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

interface Voar extends Andar{
	void voar();

}

interface Andar{
	void andar();
}
abstract class imprimirComCaractere{

	String caractere;

	public abstract void definirOcaractere();

	public void imprimecomcaractere(){
		definirOcaractere();
		System.out.println("caractere"+caractere);
	}
}

class Bruno extends imprimirComCaractere implements Voar,Andar,Serializable{

	@Override
	public void definirOcaractere() {
		caractere="bruno";

	}

	@Override
	public void andar() {
		System.out.println("bruno andando");

	}

	@Override
	public void voar() {
		System.out.println("bruno voando");

	}}


class Passaro implements Voar{

	@Override
	public void voar() {
		System.out.println("passaro voando");

	}

	@Override
	public void andar() {
		System.out.println("passaro andando");
		
	}
}

class Melissa implements Voar,Andar{

	@Override
	public void voar() {
		System.out.println("melissa voando");

	}

	@Override
	public void andar() {
		System.out.println("melissa andando");

	}

}

public class Polimorfismo {

	public static void main(String[] args) {
		new Bruno().imprimecomcaractere();
	}


	public static void mandaAndar(Andar andar){
		andar.andar();
	}

	public void x(){
		List<String> lista = new ArrayList<String>();

	}

	public static void mandaAndar(imprimirComCaractere a){
		a.imprimecomcaractere();
	}

}

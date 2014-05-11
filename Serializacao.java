package estudos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.Test;

class Jogador implements Serializable{

	String fase = "1";
	Integer vida = 3;
	Magia magia = new Magia();

	@Override
	public String toString() {
		return "fase " + fase + " vida "+ vida + " magia "+ magia.poder;
	}
}

class Magia implements Serializable{


	String poder = "kamehamera";
	Integer magia = 3;
}

public class Serializacao {

	@Test
	public void serializaObjeto() throws IOException {
		Jogador jodagor = new Jogador();
		jodagor.fase= "10";
		FileOutputStream arquivo = new FileOutputStream("meuobjeto.ser");
		ObjectOutputStream escrevedorDeObjetosNoArquivo = new ObjectOutputStream(arquivo);
		escrevedorDeObjetosNoArquivo.writeObject(jodagor);
		escrevedorDeObjetosNoArquivo.close();

	}

	@Test
	public void deserializaObjeto() throws Exception {

		FileInputStream fileInputStream = new FileInputStream("meuobjeto.ser");
		ObjectInputStream leitorDeobjetos = new ObjectInputStream(fileInputStream);
		Object object = leitorDeobjetos.readObject();
		Jogador jogador = (Jogador) object;
		leitorDeobjetos.close();
		System.out.println(jogador);

	}

	@Test
	public void stringSplit() throws Exception {

		String texto = "melissa lobo meu amor";
		String[] palavras = texto.split(" ");

		for(String item:palavras){
			System.out.println(item);
		}
	}
}

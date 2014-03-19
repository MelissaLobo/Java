package estudos;
   
import org.junit.Test;

public class Arrays {

	@Test
	public void criandoUmArray(){
		String lista []={"Pão","Queijo"," Presunto","Leite","Requeijão"};
	}

	@Test
	public void verificarTamanhodoArray(){
		String lista []={"Pão","Queijo","Presunto","Leite","Requeijão"};
		System.out.println("O tamanho do  array é "+ lista.length);
	}
	@Test
	public void juntarPalavrasComArray(){
		String lista []={"Pão","Queijo","Presunto","Leite","Requeijão"};
		String phrase = lista[0] + " " + lista[1] + " " + lista[2]
				+ " " +  lista[3] +  " e " + lista[4];
		System.out.println("Precisamos comprar "+ phrase);
	}
}

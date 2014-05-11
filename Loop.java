package estudos;

import org.junit.Test;

public class Loop {
	
	@Test
	public void testeForEach () {
		String lista [] = {"Pão","Queijo"," Presunto","Leite","Requeijão"};

		for(String item:lista){
			System.out.println("o item é "+ item);
		}

	}
	
	@Test
	public void testeWhile () {
		int x = 0;
		System.out.println("Antes do loop");
		while (x < 5){
		System.out.println("No loop");
		System.out.println("O valor de x é " + x);
		x = x + 1;
		}
	}
	
	@Test
	public void juntarPalavrasComForEach () {
		String lista [] = {"Pão","Queijo"," Presunto","Leite","Requeijão"};

		String resultado="";
		for(String item:lista){
			resultado=resultado+" "+item;
		}
		System.out.println(resultado);

	}
	
	@Test
	public void juntarPalavrasComFor() {
		String lista [] = {"Pão","Queijo"," Presunto","Leite","Requeijão"};
        
		String resultado="";
		
		for(int i = 0; i < lista.length; i ++){
			
			resultado=resultado+" "+lista[i];
		}
		System.out.println(resultado);

	}
	
	@Test
	public void juntarPalavrasDeNumeroParComFor() {
		String lista [] = {"Pão","Queijo"," Presunto","Leite","Requeijão"};
        
		String resultado="";
		
		for(int i = 0; i < lista.length; i ++){
			
			if(i % 2 == 0){
			resultado=resultado+" "+lista[i];
			}
		}
		System.out.println(resultado);

	}
	@Test
	public void juntarPalavrasDeNumeroImparComFor() {
		String lista [] = {"Pão","Queijo"," Presunto","Leite","Requeijão"};
        
		String resultado="";
		
		for(int i = 0; i < lista.length; i ++){
			
			if(i % 2 == 1){
			resultado=resultado+" "+lista[i];
			}
		}
		System.out.println(resultado);

	}
	
	@Test
	public void juntarPalavrasDeTresEmTresComFor() {
		String lista [] = {
			"Pão","Queijo"," Presunto","Leite","Requeijão","Manteiga","Margarina",
			"Chocolate","Suco","Café","Chá","Bolo","Salame","Geléia","Agua","Biscoito"
		};

		int contador=0;
		String resultado="";

		for(int i = 0; i < lista.length; i ++){

			contador++;
			if(contador==3){
				resultado=resultado+" "+lista[i];
				contador=0;
			}
		}
		System.out.println(resultado);

	}

}

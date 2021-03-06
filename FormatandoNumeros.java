package estudos;



import java.util.Date;

import org.junit.Test;


public class FormatandoNumeros {


	@Test
	public void formatandoComVirgula(){
		String f = String.format("%,d", 1000000000);
		System.out.println(f);
	}
	
	@Test
	public void formatandoComPonto(){
		String f = String.format("%.2f", 10000.00000);
		System.out.println(f);
		
		//2f só deixa dois numeros depois da virgula
	}
	@Test
	public void formatandoComPontoEVirgula(){
		String numeroFormatado = String.format("%,.2f", 1000.000000);
		System.out.println(numeroFormatado);
	}
	@Test
	public void formatandoDataEHora(){
		String data = String.format("%tc", new Date());
		System.out.println(data);
	}
	@Test
	public void formatandoHora(){
		String hora = String.format("%tr", new Date());
		System.out.println(hora);
	}
	

}

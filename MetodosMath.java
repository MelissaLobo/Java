package estudos;

import org.junit.Test;

public class MetodosMath {

	@Test
	public void valorAbsoluto(){
		int x = Math.abs(-500);
		System.out.println(x);
	}
	
	@Test
	public void valorMaior(){
		int produto1[] = {10, 17};
		System.out.println("O numero maior é " + Math.max(produto1[0], produto1[1]));
	}
	
	@Test
	public void valorMaior2(){
		int produto = Math.max(96,69);
		System.out.println("O numero maior é " + produto);
	}
	
	@Test
	public void valorMenor(){
		int produto1[] = {10, 17};
		System.out.println("O numero menor é " + Math.min(produto1[0], produto1[1]));
	}
	
	@Test
	public void valorMenor2(){
		int produto = Math.min(96,69);
		System.out.println("O numero menor é " + produto);
	}
	
}

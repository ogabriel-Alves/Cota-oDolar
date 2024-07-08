package util;

public class Calculator {
	
	public static double IOF = 6.00;
	public static double dollarPrice (double dollar,double reais) {
		double valor = dollar * reais;
		return valor+= valor*IOF/100;
		
	}
	
}

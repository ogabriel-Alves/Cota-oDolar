package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class program {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double reais = sc.nextDouble();
		double c = Calculator.dollarPrice(reais, dollar);
		System.out.printf("Amount to be paid in reais = %.2f%n", c);
		
		sc.close();
	
	}

}
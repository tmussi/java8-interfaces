package com.desafiojava8;

import java.util.function.Function;

public class MainFunction {

	public static void main(String[] args) {

		Function<Integer, Double> celsiusToFarenheit = new Function<Integer, Double>() {
			
			@Override
			public Double apply(Integer celsius) {
				return new Double((celsius * 9/5) + 32);
			}
		};
		
		Function<Integer, Double> celsiusToFarenheitLambda = (Integer celsius) -> new Double((celsius * 9/5) + 32); 
		
		
		System.out.printf("Celsius = %d to Farenheit = %.2f\n", 10, celsiusToFarenheit.apply(10));
		System.out.printf("Celsius = %d to Farenheit = %.2f\n", 30, celsiusToFarenheit.apply(30));
		System.out.printf("Celsius = %d to Farenheit = %.2f\n", 10, celsiusToFarenheitLambda.apply(10));
		System.out.printf("Celsius = %d to Farenheit = %.2f", 30, celsiusToFarenheitLambda.apply(30));
		
		
	}

}

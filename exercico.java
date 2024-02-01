package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String product = "Product:";
		System.out.println(product);
		String product1 = "Computer";
		double price1 = 2100.0;
		System.out.printf("%s, wish price is $ %.2f%n ", product1, price1);
		
		
		
		String product2 = "Office desk";
		double price2 = 650.50;
		System.out.printf("%s, wish price is $ %.2f%n ", product2, price2);
		System.out.println();
		
		
		byte age = 30;
		int code = 5290;
		char gender = 'F';
			

		System.out.printf("Record: %d years old, code %d and gender :%c%n", age, code, gender);
		System.out.println();
		double measure = 53.234567;
		System.out.printf("Meause with eight decimal places: %.8f%n ", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n ", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US descimal point: %.3f%n", measure);
		
		
				
		
		
		
		
		
	
	    

	}

}
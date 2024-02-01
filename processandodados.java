package processamento_dados_1;

import java.util.Scanner;
import java.util.Locale;
public class processandodados {

		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char x;
		x = sc.nextDouble();
		System.out.println("Você digitou:" + x);
		
		
		
		sc.close();

	}

}

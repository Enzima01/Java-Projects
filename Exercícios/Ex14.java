/* Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.*/

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float imposto;
		System.out.println("Digite seu salário: ");
		float salario = entrada.nextFloat();

		if (salario <= 2000) {
			System.out.println("Isento de impostos");
		} else if (salario > 2000 && salario <= 3000) {
			imposto = (float) salario * (float) 0.08;
			System.out.printf("Valor de imposto a pagar: %.2f R$", imposto);
		} else if (salario > 3000 && salario <= 4500) {
			imposto = (float) salario * (float) 0.18;
			System.out.printf("Valor de imposto a pagar: %.2f R$", imposto);
		} else if (salario > 4500) {
			imposto = (float) salario * (float) 0.28;
			System.out.printf("Valor de imposto a pagar: %.2f R$", imposto);
		}
	}

}

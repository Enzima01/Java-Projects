/*
* Fazer um programa que leia três valores com ponto flutuante de dupla
* precisão: A, B e C. Em seguida, calcule e mostre:
* 
* a) a área do triângulo retângulo que tem A por base e C por altura.
* 
* b) a área do círculo de raio C. (pi = 3.14159)
* 
* c) a área do trapézio que tem A e B por bases e C por altura.
* 
* d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A e B
*/

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		float a = entrada.nextFloat();
		System.out.println("Digite o valor de B: ");
		float b = entrada.nextFloat();
		System.out.println("Digite o valor de C: ");
		float c = entrada.nextFloat();

		float areatriangulo = (a * c) / 2;
		System.out.printf("AREA DO TRIÂNGULO RETÂNGULO: %.3f\n\n", areatriangulo);

		float areacirculo = (float) (3.14159 * Math.pow(c, 2));
		System.out.printf("AREA DO CÍRCULO: %.3f\n\n", areacirculo);

		float areatrapezio = (float) (((a + b) * c) / 2);
		System.out.printf("AREA DO TRAPÉZIO: %.3f\n\n", areatrapezio);

		float areaquadrado = (float) Math.pow(b, 2);
		System.out.printf("AREA DO QUADRADO: %.3f\n\n", areaquadrado);

		float arearetangulo = (float) a * b;
		System.out.printf("AREA DO RETÂNGULO: %.3f\n\n", arearetangulo);

	}

}

/*
* Fazer um programa que leia tr�s valores com ponto flutuante de dupla
* precis�o: A, B e C. Em seguida, calcule e mostre:
* 
* a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
* 
* b) a �rea do c�rculo de raio C. (pi = 3.14159)
* 
* c) a �rea do trap�zio que tem A e B por bases e C por altura.
* 
* d) a �rea do quadrado que tem lado B. e) a �rea do ret�ngulo que tem lados A e B
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
		System.out.printf("AREA DO TRI�NGULO RET�NGULO: %.3f\n\n", areatriangulo);

		float areacirculo = (float) (3.14159 * Math.pow(c, 2));
		System.out.printf("AREA DO C�RCULO: %.3f\n\n", areacirculo);

		float areatrapezio = (float) (((a + b) * c) / 2);
		System.out.printf("AREA DO TRAP�ZIO: %.3f\n\n", areatrapezio);

		float areaquadrado = (float) Math.pow(b, 2);
		System.out.printf("AREA DO QUADRADO: %.3f\n\n", areaquadrado);

		float arearetangulo = (float) a * b;
		System.out.printf("AREA DO RET�NGULO: %.3f\n\n", arearetangulo);

	}

}

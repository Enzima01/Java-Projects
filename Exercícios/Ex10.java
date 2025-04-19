/*
* Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do
* jogo, sabendo que o mesmo pode come�ar em um dia e terminar em outro, tendo
* uma dura��o m�nima de 1 hora e m�xima de 24 horas.
*/

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int horainicial, horafinal;
		int duracao;

		System.out.print("Em qual hora o jogo come�ou?: ");
		horainicial = entrada.nextInt();

		System.out.print("Em qual hora o jogo terminou?: ");
		horafinal = entrada.nextInt();

		if (horainicial < horafinal) {
			duracao = horafinal - horainicial;
		} else {
			duracao = 24 - horainicial + horafinal;
		}

		System.out.println("O jogo durou " + duracao + (" horas"));

	}

}

/* Crie um programa em Java que solicite ao usuário a temperatura média de cada um dos doze meses do ano. 
 * Essas temperaturas devem ser armazenadas em um vetor de números reais.
 * Após a coleta dos dados, o programa deve calcular a média anual das temperaturas e exibir esse valor ao final.
 * Em seguida, o programa deve identificar e exibir os meses em que a temperatura média foi superior à média anual,
 * informando o nome do mês e sua respectiva temperatura. 
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[] temp = new double[12];

		String[] meses = new String[12];

		double tempTotal = 0;

		double mediaTemp = 0;

		meses[0] = "Janeiro";
		meses[1] = "Fevereiro";
		meses[2] = "Março";
		meses[3] = "Abril";
		meses[4] = "Maio";
		meses[5] = "Junho";
		meses[6] = "Julho";
		meses[7] = "Agosto";
		meses[8] = "Setembro";
		meses[9] = "Outubro";
		meses[10] = "Novembro";
		meses[11] = "Dezembro";

		for (int i = 0; i < temp.length; i++) {
			System.out.print("Digite a temperatura media de " + meses[i] + ": ");
			temp[i] = sc.nextDouble();
			tempTotal += temp[i];
		}

		mediaTemp = tempTotal / temp.length;
		System.out.printf("%nMedia anual de temperatura: %.2f  ºC%n", mediaTemp);

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] > mediaTemp) {
				System.out.printf("%n%s - %.2f ºC%n", meses[i], temp[i]);
			}
		}

		sc.close();
	}

}

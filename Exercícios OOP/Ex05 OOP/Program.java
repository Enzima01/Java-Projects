/* PT-BR |
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano.
 * (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada).
 * Ao final, mostrar qual a nota final do aluno no ano.
 * Dizer também se o aluno está aprovado ou não e, em caso negativo,
 * mostrar quantos pontos faltam para o aluno obter o minímo para ser aprovado (que é 60% da nota).
 * 
 * EN |
 * Create a program to read the name of a student and the 3 grades they got in the 3 trimesters of the year.
 * (first trimester is worth 30 and the second and third worth 35 each).
 * In the end, show the student's final grade of the year.
 * Also show if the student passed or failed, in case of failure,
 * show how many points missed for the student obtain the minimum grade to pass (which is 60% of the total score).
 */

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();

		System.out.print("Name: ");
		student.name = sc.nextLine();

		System.out.print("Grade 1: ");
		student.grade1 = sc.nextDouble();

		System.out.print("Grade 2: ");
		student.grade2 = sc.nextDouble();

		System.out.print("Grade 3: ");
		student.grade3 = sc.nextDouble();

		System.out.println(student);
		student.StudentCondition();

		sc.close();

	}

}

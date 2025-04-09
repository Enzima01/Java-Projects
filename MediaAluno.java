import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int aluno, i=0;
		String nome;
		
		System.out.printf("Digite a quantidade de alunos:" );
		aluno = teclado.nextInt();
		
		for(i=0;i<aluno;i++) {
			
			System.out.print("Digite o nome do aluno: ");
			nome = teclado.next();
			
			System.out.print("Digite a nota da prova 1: ");
			float n1 = teclado.nextFloat();
			
			System.out.print("Digite a nota da prova 2: ");
			float n2 = teclado.nextFloat();
			
			float media = (n1+n2)/2;
			System.out.printf("Media de %s: %.2f\n",nome, media);
			
			if(media < 6) {
				System.out.println("Aluno(a) Reprovado(a)!\n\n");
			}
			else {
				System.out.println("Aluno(a) Aprovado(a)!\n\n");
			}
		
		}

	}

}

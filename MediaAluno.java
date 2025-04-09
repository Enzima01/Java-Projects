import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int aluno, i=0;
		String nome;
		
		System.out.printf("Digite a quantidade de alunos:" );
		aluno = entrada.nextInt();
		
		for(i=0;i<aluno;i++) {
			
			System.out.print("Digite o nome do aluno: ");
			nome = entrada.next();
			
			System.out.print("Digite a nota da prova 1: ");
			float n1 = entrada.nextFloat();
			
			System.out.print("Digite a nota da prova 2: ");
			float n2 = entrada.nextFloat();
			
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

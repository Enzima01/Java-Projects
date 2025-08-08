
public class Operations {

	int n;
	double[] notas;
	String[] nomes;

	public Operations(double[] notas, String[] nomes) {
		this.notas = notas;
		this.nomes = nomes;
	}

	public double mediaNotas() {
		int soma = 0;

		for (double n : notas) {
			soma += n;
		}
		return (double) soma / notas.length;

	}

	public void maiorNota() {
		double maiorNota = notas[0];
		String melhorAluno = nomes[0];
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > maiorNota) {
				maiorNota = notas[i];
				melhorAluno = nomes[i];
			}
		}
		System.out.printf("Maior nota: %.2f - %s%n", maiorNota,melhorAluno);
	}
	
	public void menorNota() {
		double menorNota = notas[0];
		String piorAluno = nomes[0];
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < menorNota) {
				menorNota = notas[i];
				piorAluno = nomes[i];
			}
		}
		System.out.printf("Menor nota: %.2f - %s%n", menorNota,piorAluno);
	}
	
	public void maiorMediaNotas() {
		System.out.println("\nAlunos com notas acima da media geral: ");
		for(int i=0; i<notas.length;i++) {
			if(notas[i] > mediaNotas()) {
				System.out.printf("%s - %.2f%n",nomes[i], notas[i]);
			}
		}
	}
}

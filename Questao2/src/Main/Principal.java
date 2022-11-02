package Main;

import java.util.Scanner;

	public class Principal{
	
	public static void main(String[] args){
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
	Scanner sc = new Scanner (System.in);
	System.out.print("Digite a quantidade de alunos: ");
	int n = sc.nextInt();
	
	System.out.println();
	
	for (int i = 0; i < n; i = i + 1){
	System.out.println("Aluno #" +(i+1));
	System.out.print("Insira o nome do aluno: ");
	sc.nextLine();
	String nome = sc.nextLine();
	System.out.print("Insira a média do aluno: ");
	double media = sc.nextFloat();
	
	System.out.println();
	
	if (media >= 7 && media <= 10){
	count1++;
		}
	if (media < 2 && media >= 0){
	count2++;
		}
	if (media >= 2 && media < 7){
	count3++;
		}
	}
	System.out.println("Alunos aprovados: "+count1);
	System.out.println("Alunos em avaliação final: "+count3);
	System.out.println("Alunos reprovados: "+count2);
	
	sc.close();
	}
}
package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/* Faça um programa que receba o nome do
		aluno e as 4 notas bimestrais desse aluno e mostre a media;

		Scanner leia = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = leia.nextLine();

        double[] notas = new double[4];
        double somaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º bimestre: ");
            notas[i] = leia.nextDouble();
            somaNotas += notas[i];
        }

        double media = somaNotas / notas.length;

        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Média: " + media);

        leia.close();
		*/
		
		
		
		
		
		
		/* faça um programa que receba 50 números, mostre os números pares  contidos em cada posição do vetor e 
		  a sua posição (indice) do vetor;
		
		Scanner leia = new Scanner(System.in);
        int[] vetor = new int[50];

        System.out.println("Digite 50 números:");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = leia.nextInt();
        }
        
        System.out.println("Números pares encontrados:");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println("Número par: " + vetor[i] + " (Posição: " + i + ")");
            }
        }
        */
		
		
		
		
		
        /* Usando o random faça uma simulação de um sorteio, cadastrando 10 pessoas, apenas uma pessoa será a 
         ganhadora para a proxima turma de java do senai;
		
		Scanner leia = new Scanner(System.in);
        Random random = new Random();
        List<String> pessoas = new ArrayList<>();

        System.out.println("Sorteio valendo uma vaga no curso de Java do Senai");
        System.out.println("Cadastre 10 pessoas:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Nome da pessoa " + i + ": ");
            String nome = leia.nextLine();
            pessoas.add(nome);
        }

        int totalPessoas = pessoas.size();
        int indiceGanhador = random.nextInt(totalPessoas);
        String ganhador = pessoas.get(indiceGanhador);

        System.out.println("O nome do ganhador é: " + ganhador);
		*/
		
		
	}

}

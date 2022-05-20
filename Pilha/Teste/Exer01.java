package EstruturaDeDados.Pilha.Teste;

import java.util.Scanner;

import EstruturaDeDados.Pilha.Pilha;

public class Exer01 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        Scanner tcd = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            int n = tcd.nextInt();
            if (n % 2 == 0) {
                System.out.println("Empilhando o número " + n);
                pilha.empilha(n);
            } else {
                Integer desempilhado = pilha.desempilha();
                if (desempilhado == null) {
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Número ímpar, Desempilhando um elemento da pilha: " + desempilhado);
                }
            }
        }
        System.out.println("Todos números lidos, desempilhando números da pilha...");
        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());
        }
    System.out.println("Todos elementos desempilhados!");
    }
}
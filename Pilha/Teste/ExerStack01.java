package EstruturaDeDados.Pilha.Teste;

import java.util.Scanner;
import java.util.Stack;

public class ExerStack01 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner tcd = new Scanner(System.in);
 
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            int n = tcd.nextInt();
            if (n % 2 == 0) {
            System.out.println("Empilhando o número " + n);
            stack.push(n);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Número ímpar, Desempilhando um elemento da pilha: " + stack.pop());
                }
            }
        }   
        System.out.println("Todos números lidos, desempilhando números da pilha...");
        while (!stack.isEmpty()) {
            System.out.println("Desempilhando um elemento da pilha: " + stack.pop());
        }
    System.out.println("Todos elementos desempilhados!");
    }
}
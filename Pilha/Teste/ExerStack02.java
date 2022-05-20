package EstruturaDeDados.Pilha.Teste;

import java.util.Scanner;
import java.util.Stack;

public class ExerStack02 {
    public static void main(String[] args) {
        Stack <Integer> par = new Stack<>();
        Stack <Integer> impar = new Stack<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um número inteiro: ");
            int n = scan.nextInt();
            if (n == 0){
                if (par.isEmpty()) {
                    System.out.println("Pilha par vazia!");
                } else {
                    System.out.println("Desempilhando da pilha par: " + par.pop());
                }

                if (impar.isEmpty()) {
                    System.out.println("Pilha impar vazia!");
                } else {
                    System.out.println("Desempilhando da pilha impar: " + impar.pop());
                }
            } else if (n % 2 == 0) {
                System.out.println("Empilhando na pilha par: " + par.push(n));
            } else {
                System.out.println("Empilhando na pilha impar: " + impar.push(n));
            }
            
            }  
            System.out.println("Desempilhando todos os números da pilha par"); 
            while (!par.isEmpty()) {
            System.out.println("Desempilhando os elementos das pilha par: " + par.pop());
            }

            System.out.println("Desempilhando todos os números da pilha impar"); 
            while (!impar.isEmpty()) {
            System.out.println("Desempilhando os elementos das pilha impar: " + impar.pop());
            }
    }
}   
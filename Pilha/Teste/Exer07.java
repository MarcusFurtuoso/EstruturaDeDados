package EstruturaDeDados.Pilha.Teste;

import java.util.Scanner;
import java.util.Stack;

public class Exer07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número a ser convertido em binário: ");
        int numero = scan.nextInt();
        System.out.println("Número convertido: " + decimalBinario(numero) + "\n");

        imprimeResultado(25, 16);
        imprimeResultado(10035, 8);
        imprimeResultado(10035, 17);
    }

    public static void imprimeResultado(int numero, int base) {
        System.out.println(numero + " na base " + base + " é: " + decimalQualquerBase(numero, base));
    }

    public static String decimalBinario(int numero) {
        Stack<Integer> pilha = new Stack<>();
        String numBinario = "";
        int resto;
        while (numero > 0) {
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2;
        }
        while (!pilha.isEmpty()) {
            numBinario += pilha.pop();
        }
        return numBinario;
    }

    public static String decimalQualquerBase(int numero, int base) {

        if (base > 16) {
            throw new IllegalArgumentException();
        }

        Stack<Integer> pilha = new Stack<>();
        String numBase = "";
        int resto;
        String bases = "0123456789ABCDEF";
        while (numero > 0) {
            resto = numero % base;
            pilha.push(resto);
            numero /= base;
        }
        while (!pilha.isEmpty()) {
            numBase += bases.charAt(pilha.pop());
        }
        return numBase;
    }
}
package EstruturaDeDados.Pilha.Teste;

import EstruturaDeDados.Pilha.Pilha;

public class Exer05Palindromo {
    public static void main(String[] args) {
        
        imprimeResultado("Ada");
        imprimeResultado("ABCD");
        imprimeResultado("ABCCBA");
        imprimeResultado("Maria");
    }

    public static void imprimeResultado(String palavra) {
        System.out.println(palavra + " é palindromo? " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra) {

        Pilha<Character> pilha = new Pilha<>();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }

        String palavraInversa = "";
        while (!pilha.estaVazia()) {
            palavraInversa +=pilha.desempilha();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }   

        return false;
    }
}
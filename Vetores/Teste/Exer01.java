package EstruturaDeDados.Vetores.Teste;

import EstruturaDeDados.Vetores.Lista;

public class Exer01 {
    public static void main(String[] args) {
            Lista<String> lista = new Lista<>(5);
            lista.adiciona("A");
            lista.adiciona("B");
            lista.adiciona("C");
    
            System.out.println(lista.contem("A"));
            System.out.println(lista.contem("D"));
            System.out.println(lista.contem("C"));
        }
    }

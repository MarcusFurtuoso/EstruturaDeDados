package EstruturaDeDados.Vetores.Teste;

import EstruturaDeDados.Vetores.Lista;

public class Exer03 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");
        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista);
        
        lista.remove(2);
        System.out.println(lista);

        lista.remove(3);
        System.out.println(lista);
    }
}

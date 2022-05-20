package EstruturaDeDados.Pilha.Teste;

import java.util.Stack;

public class ExerStack03 {
    public static void main(String[] args) {
        Stack<Livro> livro = new Stack<>();

        Livro livro1 = new Livro();
        livro1.setNome("Coração de aço");
        livro1.setAutor("Brandon Sanderson");
        livro1.setAnoLancamento(2016);
        livro1.setIsbn("B01M9JT4UV");

        Livro livro2 = new Livro();
        livro2.setNome("O homem mais rico da Babilônia");
        livro2.setAutor("George S Clason");
        livro2.setAnoLancamento(2017);
        livro2.setIsbn("8595081530");

        Livro livro3 = new Livro();
        livro3.setNome("Mais esperto que o Diabo");
        livro3.setAutor("Napoleon Hill");
        livro3.setAnoLancamento(2014);
        livro3.setIsbn("8568014003");

        Livro livro4 = new Livro();
        livro4.setNome("Do Mil ao Milhão. Sem Cortar o Cafezinho.");
        livro4.setAutor("Thiago Nigro");
        livro4.setAnoLancamento(2018);
        livro4.setIsbn("8595083274");

        Livro livro5 = new Livro();
        livro5.setNome("Java®: Como Programar");
        livro5.setAutor("Paul Deitel");
        livro5.setAnoLancamento(2016);
        livro5.setIsbn("8543004799");

        Livro livro6 = new Livro();
        livro6.setNome("Mindset: A nova psicologia do sucesso");
        livro6.setAutor("Carol S. Dweck");
        livro6.setAnoLancamento(2017);
        livro6.setIsbn("8547000240");

        System.out.println("Empilhando livros..");
        
        livro.push(livro2);
        livro.push(livro3);
        livro.push(livro4);
        livro.push(livro5);
        livro.push(livro6);

        System.out.println("Pilha está vazia? " + livro.isEmpty());
        System.out.println(livro);
        System.out.println("Tamanho da pilha: " + livro.size());

        System.out.println("Desempilhando pilha..");
        livro.pop();
        System.out.println(livro);

        System.out.println("Topo da pilha: " + livro.peek());
        System.out.println("Tamanho da pilha: " + livro.size());

        System.out.println("Desempilhando livros da pilha..");
        while (!livro.isEmpty()) {
            System.out.println("Desempilhando livro: " + livro.pop());
        }

        System.out.println("Tamanho da pilha: " + livro.size());
    }
}
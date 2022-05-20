package EstruturaDeDados.Pilha.Teste;

import EstruturaDeDados.Pilha.Pilha;

public class Exer03 {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<>(20);
        
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
        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);
        pilha.empilha(livro4);
        pilha.empilha(livro5);
        pilha.empilha(livro6);

        System.out.println("Pilha está vazia? " + pilha.estaVazia());
        System.out.println(pilha);

        System.out.println("Desempilhando pilha..");
        pilha.desempilha();
        System.out.println(pilha);

        System.out.println("Topo da pilha: " + pilha.topo());
        System.out.println("Tamanho da pilha: " + pilha.tamanho());
        
        System.out.println("Desempilhando livros da pilha..");
        
        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando livro: " + pilha.desempilha());
        }

        System.out.println("Tamanho da pilha: " + pilha.tamanho());
    }
}

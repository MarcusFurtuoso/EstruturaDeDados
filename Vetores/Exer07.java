package EstruturaDeDados.Vetores;

import java.util.ArrayList;
import java.util.Scanner;

import EstruturaDeDados.Vetores.Teste.Contato;

public class Exer07 extends Exer06 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
        ArrayList <Contato> lista = new ArrayList<>(20);

        criarContatosDinamicamente(1, lista);

        int opcao = 1;
        while (opcao != 0) {
        opcao = obterOpcaoMenu(tcd);
        
        switch (opcao) {
            case 1:
                adicionarContatoFinal(tcd, lista);
                break;
            case 2: 
                adicionarContatoPosicao(tcd, lista);
                break;
            case 3:
                obtemContatoPosicao(tcd, lista);
                break;
            case 4:
                obtemContato(tcd, lista);
                break;
            case 5:
                pesquisarUltimoIndice(tcd, lista);
                break;
            case 6:
                pesquisarContatoExiste(tcd, lista);
                break;
            case 7:
                excluirPorPosicao(tcd, lista);
                break;
            case 8:
                excluirContato(tcd, lista);
                break;
            case 9:
                tamanhoVetor(lista);
                break;
            case 10:
                limparVetor(lista);
                break;
            case 11:
                imprimirVetor(lista);
                break;
            default:
                break;
        }
        } 
        System.out.println("Usuário digitou 0, programa terminado!");
    }

    private static void adicionarContatoFinal(Scanner tcd, ArrayList<Contato> lista) {
        System.out.println("Criando contato, entre com as informações: ");
        String nome = lerInformacao("Entre com o nome: ", tcd);
        String telefone = lerInformacao("Entre com o telefone: ", tcd);
        String email = lerInformacao("Entre com o email: ", tcd);

        Contato contato = new Contato(nome, telefone, email);
        lista.add(contato);
        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner tcd, ArrayList<Contato> lista) {
        System.out.println("Criando contato, entre com as informações: ");
        String nome = lerInformacao("Entre com o nome: ", tcd);
        String telefone = lerInformacao("Entre com o telefone", tcd);
        String email = lerInformacao("Entre com o email: ", tcd);

        Contato contato = new Contato(nome, telefone, email);
        int pos = lerInformacaoInt("Entre com a posição a adicionar o contato", tcd);

        try {
            lista.add(pos,contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);    
        } catch (Exception e) {
            System.out.println("Posição invalida, contato não adicionado");
        }
    }

    private static void obtemContatoPosicao(Scanner tcd, ArrayList<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição do contato:", tcd);

        try {
            Contato contato = lista.get(pos);

            System.out.println("Contato existe, segue os dados:");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    private static void obtemContato(Scanner tcd, ArrayList<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição do contato:", tcd);

        try {
            Contato contato = lista.get(pos);

            System.out.println("Contato existe, segue os dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado");
            pos = lista.indexOf(contato);

            System.out.println("Contato encontrado na posição: " + pos);
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    private static void pesquisarUltimoIndice(Scanner tcd, ArrayList<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição do contato:", tcd);

        try {
            Contato contato = lista.get(pos);

            System.out.println("Contato existe, segue os dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último indice do contato encontrado");
            pos = lista.indexOf(contato);

            System.out.println("Contato encontrado na posição: " + pos);
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    private static void pesquisarContatoExiste(Scanner tcd, ArrayList<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição do contato:", tcd);

        try {
            Contato contato = lista.get(pos);

            boolean existe = lista.contains(contato);
            if (existe) {
                System.out.println("Contato existe, segue os dados:");
                System.out.println(contato);    
            } else {
                System.out.println("Contato não existe!");
            }

        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    private static void excluirPorPosicao(Scanner tcd, ArrayList<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser removida:", tcd);

        try {   
            lista.remove(pos);
            
            System.out.println("Contato excluido com sucesso!");
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    private static void excluirContato(Scanner tcd, ArrayList<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser removida:", tcd);

        try {   
            Contato contato = lista.get(pos);

            lista.remove(contato);
            
            System.out.println("Contato excluido com sucesso!");
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    public static void tamanhoVetor(ArrayList<Contato> lista) {
        System.out.println("Tamanho do vetor é: " + lista.size());
    }

    public static void limparVetor(ArrayList<Contato> lista) {
        lista.clear();

        System.out.println("Todos os contatos excluidos com sucesso!");
    }

    public static void imprimirVetor(ArrayList<Contato> lista) {
        System.out.println(lista);
    }

    private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {
        Contato contato;

        for (int i = 1; i < quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato" + i);
            contato.setTelefone("11111" + i);
            contato.setEmail("contato" + i + "@gmail.com");

            lista.add(contato);
        }
    }

}
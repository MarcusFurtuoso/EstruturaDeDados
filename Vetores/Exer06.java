package EstruturaDeDados.Vetores;

import java.util.Scanner;

import EstruturaDeDados.Vetores.Teste.Contato;

public class Exer06 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
        Lista <Contato> lista = new Lista<>(20);

        criarContatosDinamicamente(5, lista);

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

    private static void adicionarContatoFinal(Scanner tcd, Lista<Contato> lista) {
        System.out.println("Criando contato, entre com as informações: ");
        String nome = lerInformacao("Entre com o nome: ", tcd);
        String telefone = lerInformacao("Entre com o telefone", tcd);
        String email = lerInformacao("Entre com o email: ", tcd);

        Contato contato = new Contato(nome, telefone, email);
        lista.adiciona(contato);
        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner tcd, Lista<Contato> lista) {
        System.out.println("Criando contato, entre com as informações: ");
        String nome = lerInformacao("Entre com o nome: ", tcd);
        String telefone = lerInformacao("Entre com o telefone", tcd);
        String email = lerInformacao("Entre com o email: ", tcd);

        Contato contato = new Contato(nome, telefone, email);
        int pos = lerInformacaoInt("Entre com a posição a adicionar o contato", tcd);

        try {
            lista.adiciona(pos,contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);    
        } catch (Exception e) {
            System.out.println("Posição invalida, contato não adicionado");
        }
    }

    private static void obtemContatoPosicao(Scanner tcd, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição do contato:", tcd);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, segue os dados:");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    private static void obtemContato(Scanner tcd, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição do contato:", tcd);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, segue os dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado");
            pos = lista.busca(contato);

            System.out.println("Contato encontrado na posição: " + pos);
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    private static void pesquisarUltimoIndice(Scanner tcd, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição do contato:", tcd);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, segue os dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último indice do contato encontrado");
            pos = lista.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição: " + pos);
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    private static void pesquisarContatoExiste(Scanner tcd, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição do contato:", tcd);

        try {
            Contato contato = lista.busca(pos);

            boolean existe = lista.contem(contato);
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

    private static void excluirPorPosicao(Scanner tcd, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser removida:", tcd);

        try {   
            lista.remove(pos);
            
            System.out.println("Contato excluido com sucesso!");
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    private static void excluirContato(Scanner tcd, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser removida:", tcd);

        try {   
            Contato contato = lista.busca(pos);

            lista.remove(contato);
            
            System.out.println("Contato excluido com sucesso!");
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    public static void tamanhoVetor(Lista<Contato> lista) {
        System.out.println("Tamanho do vetor é: " + lista.tamanho());
    }

    public static void limparVetor(Lista<Contato> lista) {
        lista.limpar();

        System.out.println("Todos os contatos excluidos com sucesso!");
    }

    public static void imprimirVetor(Lista<Contato> lista) {
        System.out.println(lista);
    }

    protected static String lerInformacao(String msg, Scanner tcd) {
        System.out.println(msg);
        String entrada = tcd.nextLine();

        return entrada;
    }

    protected static int  lerInformacaoInt(String msg, Scanner tcd) {
        boolean entradaValida = false;
        int num = 0;
        while (!entradaValida) {
            try {
            System.out.println(msg);
            String entrada = tcd.nextLine();
            num = Integer.parseInt(entrada);   

            entradaValida = true;   
            } catch (Exception e) {
            System.out.println("Entrada inválida, digite novamente!");
            }
        }
        return num;
    }

    protected static int obterOpcaoMenu(Scanner tcd) {
        
        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida) {

        System.out.println("Digite a opção desejada: ");
        System.out.println("1- Adiconar contato no final do vetor");
        System.out.println("2- Adiconar contato em uma posicao especifica");
        System.out.println("3- Obtem contato de uma posicao especifica");
        System.out.println("4- Consultar contato");
        System.out.println("5- Consultar ultimo indice do contato");
        System.out.println("6- Verifica se o contato existe");
        System.out.println("7- Excluir por posicao");
        System.out.println("8- Excluir contato");
        System.out.println("9- Verifica o tamanho do vetor");
        System.out.println("10- Exclui todos os contatos do vetor");
        System.out.println("11- Imprime vetor");
        System.out.println("0- Sair");  
        
        try {
            entrada = tcd.nextLine();
            opcao = Integer.parseInt(entrada);

            if (opcao >= 0 && opcao <=11) {
                entradaValida = true;
            } else {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("Entrada inválida, digite novamente!\n\n");
        }
    }
        return opcao;
    }

    protected static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
        Contato contato;

        for (int i = 1; i < quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato" + i);
            contato.setTelefone("11111" + i);
            contato.setEmail("contato" + i + "@gmail.com");

            lista.adiciona(contato);
        }
    }
}
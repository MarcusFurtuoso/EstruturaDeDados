package EstruturaDeDados.Fila.Teste;

import EstruturaDeDados.Fila.FilaPrioridade;

public class Aula24 {
    public static void main(String[] args) {
        
        FilaPrioridade<Integer> fila = new FilaPrioridade<>();

        // Para não ativar a exception comentar o if na estrutura estática
        fila.enfileira(2);
        fila.enfileira(1);
        fila.enfileira(3);

        System.out.println(fila);
    }
}

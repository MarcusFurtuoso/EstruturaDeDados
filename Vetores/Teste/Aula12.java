package EstruturaDeDados.Vetores.Teste;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        
        arrayList.add("A");
        arrayList.add("B");
        System.out.println(arrayList);

        arrayList.add(1, "C");
        System.out.println(arrayList);

        boolean existe = arrayList.contains("D");
        if(existe) {
            System.out.println("Elemento existe no array");
        } else {
            System.out.println("Elemento não existe no array");
        }

        int pos = arrayList.indexOf("D");
        if (pos > -1) {
            System.out.println("Elemento existe no array na posição: " + pos);
        } else {
            System.out.println("Elemento não existe no array: " + pos);
        }

        System.out.println(arrayList.get(2));

        arrayList.remove("C");
        arrayList.remove(0);
        System.out.println(arrayList);

        System.out.println(arrayList.size());

        System.out.println(arrayList.lastIndexOf("B"));
    }
}

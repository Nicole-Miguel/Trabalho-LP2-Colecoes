/* Código feito por:
Danyelle Gomes SP3044459
Giovana Soares SP3044815
Kaliny Victoria SP3044475
Melissa Turbano SP3045013
Nicole Miguel SP3044513
Pedro Henrique SP3045471
*/

import java.util.*;

public class Lista<T> {
    private List<T> lista = new ArrayList<>();
    private Map<Integer, String> mapeiaLista = new HashMap<Integer, String>();
    
    public void adicionaElemento(int id, T elemento) {
        lista.add(id,elemento);
    }

    public void removeElemento(int id) {
        if(id > lista.size()) {
            System.out.println("Indíce maior que o tamanho da lista!");
        } else {
            lista.remove(id);
        }
    }

    public void atualizaElemento(int id, T elemento){
        removeElemento(id);
        lista.add(id, elemento);
    }

    public void encontraElemento(String elemento) {
        if(lista.contains(elemento)) {
            System.out.printf("\n%s encontrado.\n\n", elemento);
        } else {
            System.out.println("\nElemento não encontrado.\n\n");
        }
    }

    public void ordenaElementos() {
        Collections.sort(lista, null);
    }

    public void exibeElementos() {
        int i = 0;
        Iterator <T> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.printf("Posição %d --> %s\n", i, iterator.next());
            i++;
        }
    }

    public void mapeia(Integer id, String nome) {
        mapeiaLista.put(id, nome);
        System.out.println(mapeiaLista);
    }
}
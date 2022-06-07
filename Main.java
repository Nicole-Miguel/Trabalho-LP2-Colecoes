/* Código feito por:
Danyelle Gomes SP3044459
Giovana Soares SP3044815
Kaliny Victoria SP3044475
Melissa Turbano SP3045013
Nicole Miguel SP3044513
Pedro Henrique SP3045471
*/

class Main {
    public static void main(String[] args) {
        Lista list = new Lista <String>();

        list.adicionaElemento(0, "Dany");
        list.adicionaElemento(1,"Nick");
        list.adicionaElemento(2, "Kaly");
        list.adicionaElemento(3, "Pedro");
        list.adicionaElemento(4, "Mel");
        list.adicionaElemento(5, "Gi");
        
        list.exibeElementos();
        System.out.println("-------------");
        
        list.encontraElemento("Ana");

        list.removeElemento(1);
        list.exibeElementos();
        System.out.println("-------------");

        list.ordenaElementos();
        list.exibeElementos();
        System.out.println("-------------");

        list.atualizaElemento(1, "Ni");
        list.exibeElementos();
        System.out.println("-------------");

        list.mapeia(1, "Carol");
        list.mapeia(2, "João");
    }
}
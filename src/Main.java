public class Main {

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.insertar(100);
        arbol.insertar(75);
        arbol.insertar(38);
        arbol.insertar(143);
        arbol.insertar(12);
        arbol.insertar(31);
        arbol.recorridoInorder();
        arbol.buscarNumero(75);
        arbol.buscarNumero(0);


    }
}

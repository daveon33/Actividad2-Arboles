public class ArbolBinario {

    // Clase nodo tiene un valor y dos nodos hijos
    class Nodo {
        int numero;
        Nodo izquierda, derecha;
    }

    // Dejamos el constructor por defecto, al crear una instancia de ArbolBinario se inicializa raiz como null
    Nodo raiz;

    public void insertar(int numero) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.numero = numero;
        nuevoNodo.izquierda = null; // Cada nuevo nodo se inicializa con dos nodos hijos null a la izq y der
        nuevoNodo.derecha = null;

        // Cuando aún no existen nodos en el arbol, el primero insertado será la raiz
        if(raiz == null) {
            raiz = nuevoNodo;
            return;
        }

        Nodo ultimoNodo = raiz; // El nodo sobre el que estamos trabajando en momento

        /* La lógica del arbol es la siguiente, a partir de este punto se entiende
        que ya existe un nodo previo, es aqui donde evaluamos si el valor del nuevo
        nodo insertado debe ir a la izquierda o a la derecha del nodo actual,
        para eso revisamos primero su valor y luego si hay un espacio libre a la izquierda
        o a la derecha dependiendo del caso, logrando así la asignación del nuevo nodo
        correctamente en el arbol
         */

        while(true) {
            if(numero < ultimoNodo.numero) {
                if(ultimoNodo.izquierda == null) {
                    ultimoNodo.izquierda = nuevoNodo;
                    break;
                }

                ultimoNodo = ultimoNodo.izquierda; // Caso en el que el nodo a la izquierda esté ocupado
            } else {
                if(ultimoNodo.derecha == null) {
                    ultimoNodo.derecha = nuevoNodo;
                    break;
                }

                ultimoNodo = ultimoNodo.derecha;
            }
        }
    }

    /* Este par de métodos usan la recursividad para recorrertodo el arbol
    de izquierda a derecha, básicamente se va a llamar a la misma función
    hasta que esta se encuentre con un nodo nulo, deteniendo la función y
    devolviendo los valores en el orden de menor a mayor.
     */

    public void recorridoInorder(Nodo nodo) {
        if(nodo == null) {
            return;
        }

        recorridoInorder(nodo.izquierda);
        System.out.print(nodo.numero + " ");
        recorridoInorder(nodo.derecha);
    }

    public void recorridoInorder() {
        recorridoInorder(raiz);
        System.out.println();
    }

    /* El metodo buscar numero va a revisar el valor de cada uno
    de los nodos hasta encontrar uno con el mismo valor empezando
    desde la raiz y hasta encontrarse con un nodo nulo, en dicho caso
    no se entiende que no existe dicho numero en el arbol.
     */

    public void buscarNumero(int numero) {
        Nodo ultimoNodo = raiz;

        while(ultimoNodo != null) {
            if(numero == ultimoNodo.numero) {
                System.out.println("El número " + numero + " existe en el arbol!");
                return;
            } else if (numero < ultimoNodo.numero) {
                ultimoNodo = ultimoNodo.izquierda;
            } else {
                ultimoNodo = ultimoNodo.derecha;
            }
        }

        System.out.println("El número " + numero + " no existe en el arbol...");
    }










}

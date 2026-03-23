# Actividad2-Arboles

## ¿Qué es un árbol binario?
 
Un árbol binario es una estructura de datos donde cada elemento, el cual llamamos **nodo** puede tener como máximo dos hijos, uno a la izquierda y otro a la derecha.
 
La lógica que definimos para organizar el arbol es la siguiente:
 
- El valor de la rama izquierda es **menor** que el valor nodo padre.
- El valor de la rama derecha **mayor o igual** al del nodo padre.
 
 
### Ejemplo
 
Luego de insertar los valores `100, 50, 55, 75, 850`:
 
```
        100         
       /   \
      50   850
       \
       55
         \
         75
```
 
- `50` está a la izquierda de `100` porque `50 < 100`.
- `850` está a la derecha de `100` porque `850 > 100`.
- `55` está a la derecha de `50` porque `55 > 50`.
- `75` está a la derecha de `55` porque `75 > 55`.
 
---
 
## Estructura del programa
 
El programa tiene dos clases principales:
 
### `Nodo` 
 
Usamos esta clase dentro de ArbolBinario y representa cada elemento de nuestro árbol.
 
- `numero` — el número almacenado.
- `izquierda` — referencia al hijo izquierdo (`null` si no existe).
- `derecha` — referencia al hijo derecho (`null` si no existe).
 
### `ArbolBinario`
 
Contiene la lógica de nuestro árbol. Consta de tres métodos:
 
| Método | Descripción |
|---|---|
| `insertar(int valor)` | Agrega un nuevo nodo al arbol|
| `buscarNumero(int valor)` | Busca en el árbol y nos dice si el número existe o no |
| `recorridoInorder()` | Imprime todos los valores en orden ascendente |
 
---
 
## Cómo funciona el recorrido inorder
 
El recorrido **inorder** revisa los nodos siguiendo esta secuencia en cada subárbol:
 
```
izquierda → nodo actual → derecha
```
 
Este orden produce los valores de **menor a mayor**.
 

### Método y uso de recursión
 
```java
public void recorridoInOrder(Nodo nodo) {
    if (nodo == null) return;       // Cuando se encuentra un nodo nulo se detiene la recursión
    recorridoInOrder(nodo.izquierda);           // visita subárbol izquierdo
    System.out.print(nodo.valor + " "); // imprime el nodo actual
    recorridoInorder(nodo.derecha);           // visita subárbol derecho
}
```
 
El método usan la recursividad para recorrer todo el arbol de izquierda a derecha, básicamente se va a llamar a la misma función hasta que esta se encuentre con un nodo nulo, deteniendo la función y devolviendo los valores en el orden de menor a mayor.
 

## Archivos del proyecto
 
```
├── ArbolBinario.java   # Estructura del árbol y sus métodos
└── Main.java           # Para realizar los tests
```
 
---

## Ejemplo de prueba en consola

<img width="522" height="303" alt="image" src="https://github.com/user-attachments/assets/fcf54733-7110-4759-b51f-6a5d359a845f" />

Se crea un nuevo árbol y se agregan varios nodos con diferentes números, luego se ejecuta el método recorridoInOtder

<img width="855" height="302" alt="image" src="https://github.com/user-attachments/assets/6f26cff0-a5e2-4935-9d68-209de290fd3f" />

Se muestran los valores de cada nodo en orden de menor a mayor

<img width="465" height="345" alt="image" src="https://github.com/user-attachments/assets/403b04ae-69d2-412b-bfea-d0aa66f7cb97" />

Se ejecuta el método buscarNumero para revisar si cada caso está en el árbol

<img width="872" height="279" alt="image" src="https://github.com/user-attachments/assets/eef62525-035b-4ae7-bc7d-3bdb72006f9c" />



 
## Autor

David Fernando González Gallego

IUDigital de Antioquia
 

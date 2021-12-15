package com.solucionfactible.dev;

/**
 * comp checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, 
 * here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 * @author developer
 */
public class AreSame {
	
    /**
     * 1.Se agrega variable bandera, se inicializa en false.
     * 2.Se agregaron dos ciclos for, uno para recorrer el arreglo a y el segundo para recorrer el arreglo b. 
     * 3.Se agrega validacion para determinar si la multiplicacion del valor a*a es igual al valor de b.
     * 4.Si lo anterior se cumple, la variable bandera cambia a true.
     *
     * @param a
     * @param b
     * @return bandera
     */
	public static boolean comp(int[] a, int[] b) {
            boolean bandera = false;
                for (int x = 0; x < a.length; x++) {
                    for (int y = 0; y < b.length; y++) {
                        if ((a[x] * a[x]) == b[y]) {
                            bandera = true;
                        }
                    }
                }
            return bandera;
        }
}

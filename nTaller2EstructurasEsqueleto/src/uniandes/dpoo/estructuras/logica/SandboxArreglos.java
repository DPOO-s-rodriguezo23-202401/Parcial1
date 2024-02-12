package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    	int[] nuevo_enteros = new int[arregloEnteros.length];
        int k = 0;
        for (int enteros : arregloEnteros ) {
        	nuevo_enteros[k++] = enteros;
        }
        
        return nuevo_enteros;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	String[] nuevo_cadenas = new String[arregloCadenas.length];
    	int k = 0;
    	for (String j: arregloCadenas) {
    		nuevo_cadenas[k++] = j;
    	}
         return nuevo_cadenas;    
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
    	return arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	return arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
        int[] nuevo_arreglo = new int[arregloEnteros.length+1];
        int k =0;
        for(int valor:arregloEnteros) {
	        nuevo_arreglo[k++] = valor;
        }
        nuevo_arreglo[nuevo_arreglo.length-1] = entero;
        arregloEnteros = nuevo_arreglo;
        
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	String[] nuevo_arreglo = new String[arregloCadenas.length+1];
        int k =0;
        for(String j:arregloCadenas) {
        	nuevo_arreglo[k++] = j;
        }
        nuevo_arreglo[nuevo_arreglo.length-1] = cadena;
        arregloCadenas = nuevo_arreglo;

    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
        int[] nuevo_arreglo = new int[arregloEnteros.length];
        int k = 0;
    	for (int num : arregloEnteros) {
            if (num != valor) {
                nuevo_arreglo[k++] = num;
            }
            }
    	arregloEnteros = nuevo_arreglo;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
        String[] nuevo_arreglo = new String[arregloCadenas.length];
        int k = 0;
    	for (String j : arregloCadenas) {
            if (j != cadena) {
                nuevo_arreglo[k++] = j;
            }
            }
    	arregloCadenas = nuevo_arreglo;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
        if (posicion < 0) {
            posicion = 0; 
        } 
        else if (posicion > arregloEnteros.length) {
            posicion = arregloEnteros.length; 
        }
        
        int[] nuevoArreglo = new int[arregloEnteros.length + 1];
        
        int k = 0;
        while (k < posicion) {
            nuevoArreglo[k] = arregloEnteros[k];
            k++;
        }
        
        nuevoArreglo[posicion] = entero;
        
        int j = posicion + 1;
        while (j < arregloEnteros.length + 1) {
            nuevoArreglo[j] = arregloEnteros[j-1];
            j++;
        }
        
        
        arregloEnteros = nuevoArreglo;

    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
        int[] nuevo_arreglo = new int[arregloEnteros.length - 1];
        int i = 0;
        while (i < posicion) {
            nuevo_arreglo[i] = arregloEnteros[i];
            i++;
        }
        i++;
        while (i < arregloEnteros.length) {
            nuevo_arreglo[i] = arregloEnteros[i];
            i++;
            
        }
        arregloEnteros = nuevo_arreglo;
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	
    	int[] nuevo_arreglo = new int[valores.length];
    	int k =0;
        
    	for(double j: valores) {
    		nuevo_arreglo[k++] = (int) j;
    	}
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	String[] nuevo_arreglo = new String[objetos.length];
        
        
        int k =0;
    	for(Object j: objetos) {
    		nuevo_arreglo[k++] = j.toString();;
    	}
        
        arregloCadenas = nuevo_arreglo;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
        for (int k = 0; k < arregloEnteros.length; k++) {
            if (arregloEnteros[k] < 0) {
                arregloEnteros[k] *= -1;
            }
        }
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
        int n = arregloEnteros.length;
        boolean intercambio;
        
        do {
            intercambio = false;
            for (int i = 1; i < n; i++) {
                if (arregloEnteros[i - 1] > arregloEnteros[i]) {
                    // Intercambiar los elementos
                    int temp = arregloEnteros[i - 1];
                    arregloEnteros[i - 1] = arregloEnteros[i];
                    arregloEnteros[i] = temp;
                    intercambio = true;
                }
            }
            n--;
        } while (intercambio);
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
        int n = arregloCadenas.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arregloCadenas[j].compareTo(arregloCadenas[minIndex]) < 0) {
                    minIndex = j;
                }
            }
     
            String temp = arregloCadenas[minIndex];
            arregloCadenas[minIndex] = arregloCadenas[i];
            arregloCadenas[i] = temp;
        }
    }
	
    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
        int contador = 0;
        for (int num : arregloEnteros) {
            if (num == valor) {
                contador++;
            }
        }
        return contador;
    }


    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
        int contador = 0;
        for (String str : arregloCadenas) {
            if (str.equalsIgnoreCase(cadena)) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int contador = 0;
        for (int num : arregloEnteros) {
            if (num == valor) {
                contador++;
            }
        }
    	int[] respuesta = new int[contador];
    	int contador2 = 0;
        
        for (int k = 0; k < arregloEnteros.length; k++) {
            if (arregloEnteros[k] == valor) {
            	respuesta[contador2] = k;
                contador2++;
            }
        }
        
        return respuesta;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	if (arregloEnteros.length == 0) {
            return null; 
        }
    	
    	int minimo = 9999;
        int maximo = 0;
        
    	for (int num : arregloEnteros) {
            if (num < minimo) {
                minimo = num;
            }
            if (num > maximo) {
                maximo = num;
            }
        }

        return new int[]{minimo, maximo};
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
        HashMap<Integer, Integer> respuesta = new HashMap<>();

        for (int valores : arregloEnteros) {
            Integer repetidos = respuesta.get(valores);

            if (repetidos == null) {
            	respuesta.put(valores, 1);
            } else {
            	respuesta.put(valores, repetidos + 1);
            }
        }

        return respuesta;
        }



    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
        HashMap<Integer, Integer> repetidos = new HashMap<>();

        for (int k : arregloEnteros) {
        	repetidos.put(k, repetidos.getOrDefault(k, 0) + 1);
        }

        int contador = 0;
        for (int valor : repetidos.values()) {
            if (valor > 1) {
                contador++;
            }
        }

        return contador;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    if (arregloEnteros.length != otroArreglo.length) {
        return false;
    }

    for (int i = 0; i < arregloEnteros.length; i++) {
        if (arregloEnteros[i] != otroArreglo[i]) {
            return false; 
        }
    }

 
    return true;
	}

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    if (arregloEnteros.length != otroArreglo.length) {
        return false;
    }

    int[] conteoArregloEnteros = contarOcurrencias(arregloEnteros);
    int[] conteoOtroArreglo = contarOcurrencias(otroArreglo);

    for (int i = 0; i < conteoArregloEnteros.length; i++) {
        if (conteoArregloEnteros[i] != conteoOtroArreglo[i]) {
            return false;
        }
    }
    return true;
    }

    private int[] contarOcurrencias(int[] arreglo) {
    int maxValor = Integer.MIN_VALUE;
    for (int valor : arreglo) {
        if (valor > maxValor) {
            maxValor = valor;
        }
    }

    int[] conteo = new int[maxValor + 1];
    for (int valor : arreglo) {
        conteo[valor]++;
    }
    return conteo;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
        if (cantidad <= 0 || minimo >= maximo) {
            System.out.println("Parámetros inválidos.");
            return;
        }

        arregloEnteros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            int randomValue = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
            arregloEnteros[i] = randomValue;
        }
    }
}

package Parcial_clases;


public class Hombres extends Humanos{
	
	public Hombres(float peso, float altura, float edad) {
        super(peso,altura,edad);
        
    }
	public static float TMBHombre() {
        float calculo = (float) (88.362 + (13.397 *  peso) + (4.799 *  altura) - (5.677 *  edad));
        return calculo;
    }
	public static void main(String[] args) {
	    System.out.println("el resultado para hombre es " + TMBHombre());
	}

	
}

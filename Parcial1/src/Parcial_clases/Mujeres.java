package Parcial_clases;

public class Mujeres extends Humanos{
	
	public Mujeres(float peso, float altura, float edad) {
        super(peso,altura,edad);
        
    }
	public static float TMBMujeres() {
        float calculo = (float) (447.593 + (9.247 * peso) + (3.098 * altura) - (4.33 * edad));
        return calculo;
    }
	public static void main(String[] args) {
	    System.out.println("el resultado para mujer es " + TMBMujeres());
	}


}

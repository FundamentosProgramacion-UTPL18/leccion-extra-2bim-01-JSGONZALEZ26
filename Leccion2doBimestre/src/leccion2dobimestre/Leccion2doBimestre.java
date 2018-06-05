/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion2dobimestre;

/**
 *
 * @author Jairo
 */
public class Leccion2doBimestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double arreglo1[] = {110, 220, 430, 140, 250, 460};
        double arreglo2[] = {10, 20, 30, 40, 50, 60};
        double arreglo3[] = new double[6];
        double arreglo4 = 0;

        for (int i = 0; i < arreglo3.length; i++) {
            arreglo3[i] = (arreglo1[i] + arreglo2[i]) / 2;
            arreglo4 += arreglo3[i];
        }
        arreglo4 = arreglo4 / arreglo3.length;
        System.out.println("Arreglo 1\tArreglo 2\tResultado");
        for (int i = 0; i < arreglo3.length; i++) {
            System.out.println(arreglo1[i] + "\t\t" + arreglo2[i] + "\t\t" + arreglo3[i]);
        }
        System.out.printf("\nEl promedio de arreglo 3 es: %.2f\n",arreglo4);
    }

}

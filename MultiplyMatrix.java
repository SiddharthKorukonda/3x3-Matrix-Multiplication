/* Siddharth Korukonda
   115607752
   CSE 114
   Paul Fodor
   Homework 5
   Question 1 (MultiplyMatrix.java)
 */

import java.util.*;

public class MultiplyMatrix {
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] product = new double[3][3];

        for (int i=0; i<a.length; i++) {
            for (int j=0; j<b[0].length; j++) {
                for (int k=0; k<b.length; k++) {
                    product[i][j] += a[i][k]*b[k][j];
                }
            }
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the matrices: ");
        int size = s.nextInt();

        double[][] a = new double[size][size];
        double[][] b = new double[size][size];

        System.out.print("Enter the values for Matrix A: \n");
        for (int i=0; i<size; i++) {
            for (int j=0; j<a[0].length; j++) {
                a[i][j]=s.nextDouble();
            }
        }

        System.out.print("Enter the values for Matrix B: \n");
        for (int i=0; i<size; i++) {
            for (int j=0; j<b[0].length; j++) {
                b[i][j]=s.nextDouble();
            }
        }

        double[][] product = multiplyMatrix(a,b);

        System.out.print("Multiplication of the matrix is: \n");
        for (int i=0; i<product.length; i++) {
            for (int j=0; j<product[i].length; j++) {
                System.out.printf("%.1f ", product[i][j]);
            }
            System.out.println();
        }
    }
}

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector a = new Vector();
        Vector b = new Vector();
        a.setVector();
        a.showVector();
        System.out.println("");
        System.out.println("Length of your vector equals");
        System.out.println(Vector.lengthOfVector(a)+"\n");
        b.setVector();
        b.showVector();
        System.out.println("");
        System.out.println("Scalar product of your vectors equals");
        System.out.println(Vector.scalarProduct(a,b)+"\n");
        System.out.println("The result of multiplying your vectors equals");
        Vector.vectorMultiplication(a,b).showVector();
        System.out.println("");
        System.out.println("The cosine between your vectors equals");
        System.out.println(Vector.cosineBetweenVectors(a,b)+"\n");
        System.out.println("The result of sum your vectors equals");
        Vector.sumVector(a,b).showVector();
        System.out.println("");
        System.out.println("The result of subtract your vectors equals");
        Vector.subtractVector(a,b).showVector();
        System.out.println("");
        System.out.println("Input length of your array of vectors");
        int n = in.nextInt();
        Vector.arrayOfVectors(n);
    }
}

package com.company;
import java.util.Scanner;

public class Vector {
    Scanner in = new Scanner(System.in);
    private double x;
    private double y;
    private double z;
    public Vector(){

    }
    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void setVector(){
        System.out.println("Input X coordinate");
        this.x = in.nextInt();
        System.out.println("Input Y coordinate");
        this.y = in.nextInt();
        System.out.println("Input Z coordinate");
        this.z = in.nextInt();
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public double getZ() {
        return this.z;
    }
    public void showVector(){
        System.out.println("Vector is (x= "+Math.round(this.x*100.0)/100.0+", y= "+Math.round(this.y*100.0)/100.0+", z= "+Math.round(this.z*100.0)/100.0+")");
    }
    public static double lengthOfVector(Vector vector){
        double lengthOfVector = Math.sqrt((vector.getX()*vector.getX()+vector.getY()*vector.getY()+vector.getZ()*vector.getZ()));
        return Math.round(lengthOfVector*100.0)/100.0;
    }
    public static double scalarProduct(Vector vector1, Vector vector2){
        double scalarProduct =vector1.getX()*vector2.getX()+vector1.getY()*vector2.getY()+vector1.getZ()*vector2.getZ();
        return Math.round(scalarProduct*100.0)/100.0;
    }
    public static Vector vectorMultiplication(Vector vector1, Vector vector2){
        Vector vectorMultiplication = new Vector(vector1.getY()*vector2.getZ()-vector1.getZ()*vector2.getY(),vector1.getZ()*vector2.getX()-vector1.getX()*vector2.getZ(),vector1.getX()*vector2.getY()-vector1.getY()*vector2.getX());
        return vectorMultiplication;
    }
    public static double cosineBetweenVectors(Vector vector1, Vector vector2){
        double cosine = scalarProduct(vector1,vector2)/(lengthOfVector(vector1)*lengthOfVector(vector2));
        return Math.round(cosine*100.0)/100.0;
    }
    public static Vector sumVector(Vector vector1, Vector vector2){
        Vector sum = new Vector(vector1.getX()+vector2.getX(),vector1.getY()+vector2.getY(),vector1.getZ()+vector2.getZ());
        return sum;
    }
    public static Vector subtractVector(Vector vector1, Vector vector2){
        Vector subtract = new Vector(vector1.getX()-vector2.getX(),vector1.getY()-vector2.getY(),vector1.getZ()-vector2.getZ());
        return subtract;
    }
    public static Vector[] arrayOfVectors(int n){
        Vector[] array = new Vector[n];
        for (int i = 0; i < n; i++){
            array[i] = new Vector(Math.random(),Math.random(),Math.random());
            array[i].showVector();
        }
        return array;
    }
}

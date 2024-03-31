
package pkg7_enkapsulasi;

import java.util.Scanner;

public class LinearEquation {
    
    /*atribut private*/
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    
    /*kosntruktor tampa argumen*/
    public LinearEquation(){
        
    }
    
    /*penggunaan set untuk menetapkan nilai*/
    public void setEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    
    
    /*enam method get pada tiap huruf*/
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getD(){
        return d;
    }
    public double getE(){
        return e;
    }
    public double getF(){
        return f;
    }
    
    /*mengembalikan nilai true*/
    public boolean isSolvable(){
        return (a * d) - (b * c) !=0;
    }
    
    /*mengembalikan solusi pada persamaan x*/
    public double getX(){
        return (e * d - b * f) / (a * d / b * c);
    }
    
    /*mengembalikan solusi pada persamaan y*/
    public double getY(){
        return (a * f - e * c)/(a * d - b * c);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        LinearEquation equation  = new LinearEquation(); 
        
        /*input a*/
        System.out.println("nilai a: ");
        double a = scanner.nextDouble();
        
        /*input b*/
        System.out.println("nilai b: ");
        double b = scanner.nextDouble();
        
        /*input c*/
        System.out.println("nilai c: ");
        double c = scanner.nextDouble();
        
        /*input d*/
        System.out.println("nilai d: ");
        double d = scanner.nextDouble();
        
        /*input e*/
        System.out.println("nilai e: ");
        double e = scanner.nextDouble();
        
        /*input f*/
        System.out.println("nilai f: ");
        double f = scanner.nextDouble();
        
        /*pemanggilan set */
        equation.setEquation(a, b, c, d, e, f);
        
        /*percabangan if disertai pemanggilan method*/
        if(equation.isSolvable()){
            System.out.println("Persamaan memiliki solusi.");
            System.out.println("x = " + equation.getX());
            System.out.println("y = " + equation.getY());
        }else{
            System.out.println("Persamaan tidak memiliki solusi.");
        }
        
    }
    
}

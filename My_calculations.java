/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_calculations;

/**
 *
 * @author sjcet
 */
class Calculation {
    int z;
    public void addition(int x,int y){
        z=x+y;
        System.out.println("the sum of given number is:"+z);
    }
    public void subtraction(int x,int y){
        z=x-y;
        System.out.println("the difference between two numbers:"+z);
    }
}
public class My_calculations extends Calculation {
    public void multiplication(int x,int y){
            z=x*y;
            System.out.println("the product of the given numbetrs:"+z);
        }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=20,b=10;
        My_calculations demo = new My_calculations();
        demo.addition(a,b);
        demo.subtraction(a,b);
        demo.multiplication(a,b);
}
    }
        // TODO code application logic here
    
    


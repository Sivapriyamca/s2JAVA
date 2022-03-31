/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class Add {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        Scanner myobj=new Scanner(System.in);
        System.out.println("enter first number");
        a=myobj.nextInt();
        System.out.println("enter second number");
        b=myobj.nextInt();
        c=a+b;
        System.out.println("sum is :"+c);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest;

/**
 *
 * @author sjcet
 */import java.util.Scanner;
public class Largest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,n3;
        Scanner myobj=new Scanner(System.in);
        System.out.println("enter first number");
        n1=myobj.nextInt();
        System.out.println("enter second number");
        n2=myobj.nextInt();
        System.out.println("enter third number");
        n3=myobj.nextInt();
        if(n1>=n2)
        {
            if(n1>n3)
                System.out.println(n1+"is the largest number");
            else
                System.out.println(n3+ "is the largest number");
           
        }
          else
            {
                if(n2>=n3)
                    System.out.println(n2+"is the largest number");
                else
                 System.out.println(n3+"is the largest number");   
            }
        }
    
}

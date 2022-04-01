/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author sjcet
 *
 */
 import java.util.Scanner;

public class Product {
    int pcode,price;
    String pname;
    Product()
    {
        Scanner n1 = new Scanner(System.in);
        System.out.println("enter the product code");
        pcode=n1.nextInt();
        
        System.out.println("enter the price");
        price=n1.nextInt();
        
        System.out.println("enter the product name");
        pname=n1.next();
        
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Product p1=new Product();
        Product p2=new Product();
         Product p3=new Product();
         System.out.println("THE LOWEST PRICED PRODUCT, ID AND PRICE:");
     if(p1.price<p2.price && p1.price<p3.price)
     {
         System.out.println("product code is "+p1.pcode);
         System.out.println("product name is "+p1.pname);
         System.out.println("price is"+p1.price);
         
     }
     else if(p2.price<p1.price && p2.price<p3.price)  {
         System.out.println("product code is "+p2.pcode);
         System.out.println("product name is "+p2.pname);
          System.out.println("price is"+p2.price);
            
        }
     else
         System.out.println("product code is "+p3.pcode);
         System.out.println("product name is "+p3.pname);
          System.out.println("price is"+p3.price);
         
    }
    
}


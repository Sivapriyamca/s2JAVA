/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class Demo2 {
    int addition(int a,int b)
    {
        int res;
        res=a+b;
        return res;
        
    }
    int addition(int a,int b,int c)
    {
        int res;
        res=a+b+c;
        return res;
    }
    int addition(int c)
    {
        int res;
        res=c+1;
        return res;
    }

public class OverloadingDemo
        
{
    
}

    /**
     * @param args the command line arguments
     */
public static void main(String[] args)
{
        Demo2 obj=new Demo2();
        System.out.println("method overloading demo");
        Scanner scr=new Scanner(System.in);
        System.out.println("enter three integer values for a,b,c:");
        int a=scr.nextInt();
        int b=scr.nextInt();
        int c=scr.nextInt();
        System.out.println("Addition method with two parameters:"+obj.addition(a,b));
        System.out.println("Addition method with three parameters:"+obj.addition(a,b,c));
        System.out.println("Addition method with one parameter :"+a+"+1:"+obj.addition(a));
    }
}


        // TODO code application logic here
    
    


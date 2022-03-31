/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author sjcet
 */
public class Student {
   
    int m1,m2,m3;
    Student(int a,int b,int c)
    {
        
        m1=a;
        m2=b;
        m3=c;
    }
    
    public void sum(){
        int sum;
        sum=m1+m2+m3;
        System.out.println("sum is="+sum);
        
    }
    public void percentage(){
        float percentage;
        percentage=((m1+m2+m3)*100)/300;
        System.out.println("percentage is="+percentage);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student s1=new Student(60,80,70);
        Student s2=new Student(80,50,90);
       
        s1.sum();
        s1.percentage();
        s2.sum();
        s2.percentage();
        // TODO code application logic here
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud;

/**
 *
 * @author sjcet
 */
public class Stud {
 
    int m1,m2,m3,sum;
    Stud()
    {
        m1=50;
        m2=60;
        m3=70;
    }
    public void sum(){
        int sum;
        sum=m1+m2+m3;
        System.out.println("sum is="+sum);
    }
     public void percentage(){
        float percentage;
        percentage = ((m1+m2+m3)*100)/300;
        System.out.println("percentage is="+percentage);
        
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stud s =new Stud();
        s.sum();
        s.percentage();
        
    }
        // TODO code application logic here
        
}

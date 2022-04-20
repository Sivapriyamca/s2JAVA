/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subclass;

/**
 *
 * @author sjcet
 */
class Superclass {
    int age;

    public Superclass(int age) {
        this.age=age;
    }
    public void getAge(){
        System.out.println("the value of the variable named age in super class is:"+age);
    }
}

    

public class Subclass  extends Superclass {

    public Subclass(int age) {
        super(age);
    }
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Subclass s = new Subclass(24);
        s.getAge();
    }
        // TODO code application logic here
    }
    


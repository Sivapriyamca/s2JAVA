/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

import jdk.nashorn.internal.objects.ArrayBufferView;
import org.omg.PortableServer.POAPackage.ObjectAlreadyActiveHelper;

/**
 *
 * @author sjcet
 */
public class Rectangle {
    int l,b;
    Rectangle(int length,int breadth)
    {
        l = length;
        b = breadth;
    }
    public void area()
    {
    int area =l*b;
    System.out.println("area"+area);
    }
    public void perimeter()
    {
        int perimeter=2*(l+b);
        System.out.println("perimeter"+perimeter);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,8);
        r1.area();
        r1.perimeter();
        Rectangle r2 = new Rectangle(7,3);
        r2.area();
        r2.perimeter();
        // TODO code application logic here
    }
    
}

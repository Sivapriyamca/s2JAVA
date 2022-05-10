/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *
 * @author sjcet
 */
import graphics.circle;
import graphics.rectangle;
import graphics.square;
import graphics.triangle;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        circle obj1 = new circle();
        rectangle obj2 = new rectangle();
        square obj3 = new square();
        triangle obj4 = new triangle();
                System.out.println("Choose any    1)Circle   2)Rectangle   3)Square  4)Triangle: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        obj1.area();
                        break;
                    case 2:
                        obj2.area();
                        break;
                    case 3:
                        obj3.area();
                        break;
                    case 4:
                        obj4.area();
                    default:
                        break;
                }

        }
    }

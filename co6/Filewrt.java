/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewrt;

/**
 *
 * @author Student
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filewrt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       try {
           try (FileWriter dataWriter = new FileWriter("DATA.txt")) {
               dataWriter.write("Hai Hallo");
               dataWriter.write(" World");
           }
        } catch (IOException ex) {
            System.out.println("An error occured !");
        }
         
         
         try{
            File dataFile = new File("DATA.txt");
           try (Scanner dataRead = new Scanner(dataFile)) {
               while(dataRead.hasNextLine()){
                   System.out.println(dataRead.nextLine());
               }
           }
        }catch(FileNotFoundException ex){
            System.out.println("An error occured !");
        }
         
    }

}
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args){
        try{
            Scanner  scanner = new Scanner(new File("File.txt"));

            while(scanner.hasNext()){
                String Str = scanner.nextLine();
                String str1 = scanner.next();

                if (!Str.contains("main") && Str.contains("(") && (Str.contains("{") || str1.contains("{")) ){

                    String[] C = Str.split("\\("); 
                    
                    String[] D = C[1].split("\\)"); 

                    String[] split_C = C[0].split(" ");
                    int length = split_C.length;

                    System.out.print(split_C[length-1]);

                    String method = "(" + D[0] + ")";
                    System.out.print(method);

                    System.out.println(", return type: " + split_C[length-2]);
                }

                
            }

        }catch(Exception e){

        }

    }
}
   

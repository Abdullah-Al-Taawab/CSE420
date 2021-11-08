/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Asus
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Lab3 {

 public static void main(String[] args) throws FileNotFoundException {
        Scanner sc;
     sc = new Scanner(new File("C:\\Users\\Asus\\Desktop\\cse420 LAB\\Lab3\\input.txt"));
     int n=sc.nextInt();
     sc.nextLine();
     String ex[]=new String[n];
     for(int i=0;i<n;i++){
         ex[i]=sc.nextLine().trim();
     
    }
    int s=sc.nextInt();
    String checkline[]=new String[s];
    sc.nextLine();
    for(int c=0;c<s;c++){
        checkline[c]=sc.nextLine().trim();
    }        
    Pattern p;
    Matcher m;
    boolean matched = false;
    
    for(int i = 0; i < checkline.length; i++){
        for(int j = 0; j < ex.length; j++){
            matched = false;
            p = Pattern.compile(ex[j]);
            m = p.matcher(checkline[i]);
        if(m.find()){
                    int print = j + 1;
                    System.out.println("YES," + print);
                    matched = true;
                    break;
        }
    }
        
            if(!matched){
                System.out.println("NO,0");
            }
    }
 }
}


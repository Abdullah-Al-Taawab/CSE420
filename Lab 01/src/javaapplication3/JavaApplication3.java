/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication3 {

    
    public static void main(String[] args) throws FileNotFoundException {
        String st = null;
        String [] a;
        a = new String[] {"abstract","assert","boolean","break","byte","case","catch","char","class","const","continue","default","do","double","else","enum","extends","final","finally","float","for","goto","if","implements","import","instanceof","int","interface","long","native","new","package","private","protected","public","return", "short","static","strictfp","super","switch","synchronized","this","throw","throws","transient","try","void","volatile","while","true","false","null" };
        String [] b;
        b = new String[] {"a", "b", "c", "d","e"};
        String [] c;
        c = new String[] {">", "<", ">=", "<=","||","&&","^","|","&","!"};
        String [] d;
        d = new String[] {",", ";", "(",")","{","}","[","]"};
        String [] e;
        e = new String[] {"+", "-", "=", "/","%","*","++","--"};
        ArrayList<String> kword= new ArrayList<>(Arrays.asList(a));
        ArrayList<String> id= new ArrayList<>(Arrays.asList(b));
        ArrayList<String> log= new ArrayList<>(Arrays.asList(c));
        ArrayList<String> ot= new ArrayList<>(Arrays.asList(d));
        ArrayList<String> op= new ArrayList<>(Arrays.asList(e));
        
        ArrayList<String> Keywords = new ArrayList<>();
        ArrayList<String> NumericalValues = new ArrayList<>();
        ArrayList<String> LogicalOperators = new ArrayList<>();
        ArrayList<String> Others = new ArrayList<>();
        ArrayList<String> MathOperators = new ArrayList<>();
        ArrayList<String> Identifiers = new ArrayList<>();
        
         Scanner sc = new Scanner(new File("input.txt"));
        while(sc.hasNext()){
            st=sc.nextLine().trim();
            String[] p = st.split(" "); 
            for(String s:p){
                if(kword.contains(s) && !Keywords.contains(s)){
                    Keywords.add(s);
                }
                else if (id.contains(s) && !Identifiers.contains(s)){
                    Identifiers.add(s);
                }
                else if(op.contains(s) && !MathOperators.contains(s)){
                    MathOperators.add(s);
                }
                else if(log.contains(s) && !LogicalOperators.contains(s)){
                    LogicalOperators.add(s);
                }
                else if(ot.contains(s) && !Others.contains(s)){
                    Others.add(s);
                }
                else if(StringInt(s) && !NumericalValues.contains(s)){
                    NumericalValues.add(s);
                }
                else if(StringDouble(s) && !NumericalValues.contains(s)){
                    NumericalValues.add(s);
                }
                else if( !Identifiers.contains(s) && !MathOperators.contains(s) && !LogicalOperators.contains(s) && !Others.contains(s) && !NumericalValues.contains(s)){
                    Identifiers.add(s);
            }
            }
        }
        
        
            System.out.print("Keywords: ");
        for(int i=0;i<Keywords.size();i++){
            System.out.print(Keywords.get(i));
             if(i==Keywords.size()-1){
                break;
            }
          System.out.print(", ");
        }
               System.out.println();
        System.out.print("Identifiers: ");
        for(int i=0;i<Identifiers.size();i++){
            System.out.print(Identifiers.get(i));
            if(i==Identifiers.size()-1){
                break;
            }
          System.out.print(", ");   
        }
        System.out.println();
        System.out.print("Math Operators: ");
        for(int i=0;i<MathOperators.size();i++){
            System.out.print(MathOperators.get(i));
             if(i==MathOperators.size()-1){
                break;
            }
          System.out.print(", ");
        }
                System.out.println();

        System.out.print("Logical Operators: ");
        for(int i=0;i<LogicalOperators.size();i++){
            System.out.print(LogicalOperators.get(i));
             if(i==LogicalOperators.size()-1){
                break;
            }
          System.out.print(", ");
        }
                System.out.println();

        System.out.print("Numerical Values: ");
        for(int i=0;i<NumericalValues.size();i++){
            System.out.print(NumericalValues.get(i));
            if(i==NumericalValues.size()-1){
                break;
            }
          System.out.print(", ");
            
        }
                System.out.println();
        System.out.print("Others: ");
        for(int i=0;i<Others.size();i++){
            System.out.print(Others.get(i)+" ");
        }
        System.out.println();
    }
    public static boolean StringInt(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }
    public static boolean StringDouble(String str){
        try{
            Double.parseDouble(str);
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }

}

    
        
        
        

       

    


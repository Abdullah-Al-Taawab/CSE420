/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Lab2 {

    
    public static void main(String[] args) throws FileNotFoundException {
    Scanner sc;
    sc = new Scanner(new File("input.txt"));
    int n=sc.nextInt();
    System.out.println(n);
    sc.nextLine();
    int c=1;
    while(sc.hasNext()&& c<=n){
      String st = sc.nextLine().trim();
      if(webchecker(st)){
        System.out.print("Web, "+c);
      }
      else if(emailchecker(st)){
        System.out.print("Email, "+c);
      }
      else if(webchecker(st)==false && emailchecker(st)==false){
        System.out.print("Not valid : "+c);
      }
      c++;
      System.out.println();
    }    
  }
  
  public static boolean emailchecker(String s){
    int state=0;
    boolean Email=false;
    int i=0;
    while(i<s.length()){
      switch(state){
        case 0: if(((int)s.charAt(i)>64 && (int)s.charAt(i)<91) || ((int)s.charAt(i)>96 && (int)s.charAt(i)<123)  ) {
          state=1;
        }
        else{
          state=0;
        } 
        i++; 
        break;
        case 1: if(((int)s.charAt(i)>64 && (int)s.charAt(i)<91) || ((int)s.charAt(i)>96 && (int)s.charAt(i)<123) || ((int)s.charAt(i)>47 && (int)s.charAt(i)<58) ) {
          state=1;
        }
        else if(s.charAt(i)=='@'){
          state=2;
        }
        else{
          state=0;
        } 
        i++;
        break;
        case 2: if(((int)s.charAt(i)>64 && (int)s.charAt(i)<91) || ((int)s.charAt(i)>96 && (int)s.charAt(i)<123)  ) {
          state=2;
        }
        else if(s.charAt(i)=='.'){
          state=3;
        }
        
        i++;  break; 
        case 3:if(((int)s.charAt(i)>64 && (int)s.charAt(i)<91) || ((int)s.charAt(i)>96 && (int)s.charAt(i)<123)  ) {
          state=3;
          if(i+1==s.length()){
            Email=true;

          }
        }
        else if(s.charAt(i)=='.'){
          state=3;
        }
        else{
            state=0;
        }
        i++;  break;
      }
    }
    return Email;
  }
  
  public static boolean webchecker(String s){
    int state=0;
    boolean Website=false;
    int p=0;
    
    while(p<s.length()){
      switch(state){
        case 0: 
          if(s.charAt(p)=='w' || s.charAt(p)=='W' ) {
          state=1;
        }
          else{
            state=0;
          }
          p++;break;
          
        case 1: if(s.charAt(p)=='w' || s.charAt(p)=='W' ) {
          state=2;
        }
        else{
          state=0;
        }
        p++;
        break;
        
        case 2: if(s.charAt(p)=='w' || s.charAt(p)=='W' ) {
          state=3;         
        }
        else{
          state=0;
        } 
        p++; break; 
        case 3: if(s.charAt(p)=='.' ) {
          state=4; 
        }
        else{
          state=0;
        }  
        p++;break;
        case 4: if(((int)s.charAt(p)>64 && (int)s.charAt(p)<91) || ((int)s.charAt(p)>96 && (int)s.charAt(p)<123)  ) {
          state=4; 
        }
        else if(s.charAt(p)=='.'){
          state=5;
        }
        p++;break;   
        
        case 5: if(s.charAt(p)=='c' || s.charAt(p)=='C') {
          state=6; 
        }
        else{
          state=0;
        }    
        p++;  break;
        case 6: if(s.charAt(p)=='o' || s.charAt(p)=='O') {
          state=7;
        }
        else{
          state=0;
        }     
        p++;
        break;
        case 7: if(s.charAt(p)=='m' || s.charAt(p)=='M') {
          Website=true;
          state=0;
        }
        else{
          state=0;
        }   
        p++; break;
      }
    }
    return Website;
  }
  
}


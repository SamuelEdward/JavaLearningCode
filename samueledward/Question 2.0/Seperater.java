/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.Scanner;
/**
 *
 * @author Samuel Edward
 */
public class Seperater {
    
    public static void main(String args[]) {
    int num;
    String [] arr = {};
    
    Scanner sc = new Scanner( System.in);
    System.out.print("Enter a long number: ");
    num = sc.nextInt();
    
    String value = String.valueOf(num);
    
    for (int i = 0; i <= value.length(); i++) {
        String temp = value.substring(i);
        temp = arr[i];
    }
     
    System.out.print("The Number you entered is: ");
    
    for(int i = 0; i <= value.length(); i++) {
     System.out.println(arr[i]);
    }
    
    
    
    }
    
}

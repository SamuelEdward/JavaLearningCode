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
public class EmployeeTest {
    
    public static void main(String args []) {
        String firstName, lastName;
        double salary;
        
         Scanner interger = new Scanner(System.in);
         Scanner decimal = new Scanner(System.in);
         
         System.out.print("Enter the First Name: ");
         firstName = interger.nextLine();
         
         System.out.println("Enter the Last Name: ");
         lastName = interger.nextLine();
         
         System.out.println("Enter the salary: ");
         salary = decimal.nextDouble();
         
         Employee em1 = new Employee(firstName, lastName, salary);
         
         
         System.out.println("The first name is: " + em1.getfirstName());
         System.out.println("The last name is: " + em1.getlastName());
         
         if (salary >= 0) {
         System.out.println("The salary is: " + em1.getsalary());
         } else {
          System.out.println("The salary is not valid");
         }
    }
}
         
         
          
         
         
         
         
         
         
         
         
         
    }
    
}

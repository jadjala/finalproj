/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanager;


import java.util.*;


public class LogIn {
  Scanner scan = new Scanner (System.in);
  
    public void SignIn(CustomHashTable accounts, CustomHashTable manager){
        System.out.println("Enter Your Username");
        String username = scan.next();
        System.out.println("Enter Your Password");
        String password = scan.next();
        
            if(accounts.authenticate(username,password)){
                System.out.println("Welcome User!");
                //ditso sa borrow books window
            } else if (manager.authenticate(username,password)){
                System.out.println("Welcome Manager!");
                //ditso sa manage books window
            } else {
                System.out.println("Invalid Username or Password!");
            }
    }
    
    public static void main (String args []){
        
        LogIn login = new LogIn();
        CustomHashTable accounts = new CustomHashTable(11);
        CustomHashTable manager = new CustomHashTable(11);
          Scanner scan = new Scanner (System.in);
        
        
        manager.insert("manager01", "bookeeper4ever");
        
        
        System.out.println("1. Login \t 2.Sign up");
        int choice = scan.nextInt();
        
        if (choice == 2){
        System.out.println("Enter Your Username");
        String username = scan.next();
        System.out.println("Enter Your Password");
        String password = scan.next();
        
        accounts.insert(username, password);
            System.out.println("ACCOUNT CREATED SUCCESSFULLY! PROCEED TO LOG IN?");
            String choice1 = scan.next();
            login.SignIn(accounts, manager);
            
        //Diretso nas borrow table or unsa ba
        
      /*  for(String key : accounts.keySet()){
            System.out.println(key.hashCode() % 11 + "\t"+ key + "\t" + accounts.get(key));
        }*/
        }
        else if (choice == 1){
        login.SignIn(accounts, manager);
            
        }
        
    }
    
    
}

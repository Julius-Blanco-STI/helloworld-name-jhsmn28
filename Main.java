package main;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner Obj = new Scanner (System.in);  
        System.out.println("What is your name?");
            String name= Obj.nextLine();
        System.out.println("How old are you?");
            String age= Obj.nextLine();
        System.out.println("What's your address?");
            String add= Obj.nextLine();
            
           
        System.out.println("Hi! " + name);
        System.out.println("You are " + age); 
        System.out.println("You live at "+ add);
    }
    
}


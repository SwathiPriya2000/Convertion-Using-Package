package converter;
import java.util.*;
import java.io.*;
public class c
{
   public c()
   {
     System.out.println("Welcome to currency converter");
     System.out.println("\n1.US dollars to INR\n2.INR to US dollars\n3.exit\n");
     int choice;
     Scanner in = new Scanner(System.in);
     do
     {
     System.out.println("Enter your choice:");
     choice =in.nextInt();
     switch(choice)
     {
     case 1:System.out.println("Enter the currency in US dollars:");
            double dollar=in.nextDouble();
            System.out.println(dollar+"dollar"+"="+(dollar*65.37)+"Rupees");
     case 2:System.out.println("Enter the currency in INR:");
            double rupees=in.nextDouble();
            System.out.println(rupees+"Rupees"+"="+(rupees*0.015)+"Dollars");
     case 3:System.out.println("Program completed succesfully");
    }
}while(choice!=3);
}
}






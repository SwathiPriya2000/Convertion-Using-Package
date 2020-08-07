package converter;
import java.util.*;
import java.io.*;
public class t
{
   public t()
   {
     System.out.println("Welcome to currency converter");
     System.out.println("\n1.Hours to minutes\n2.minutes to Hours\n3.exit\n");
     int choice;
     Scanner in = new Scanner(System.in);
     do
     {
     System.out.println("Enter your choice:");
     choice =in.nextInt();
     switch(choice)
     {
     case 1:System.out.println("Enter the input in hours:");
            double h=in.nextDouble();
            System.out.println(h+"hours"+"="+(h*60)+"minutes");
     case 2:System.out.println("Enter the input in minutes:");
            double m=in.nextDouble();
            System.out.println(m+"minutes"+"="+(m*0.012)+"hours");
     case 3:System.out.println("Program completed succesfully");
    }
}while(choice!=3);
}
}







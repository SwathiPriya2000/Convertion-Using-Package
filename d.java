package converter;
import java.util.*;
import java.io.*;
public class d
{
   public d()
   {
     System.out.println("Welcome to distance converter");
     System.out.println("\n1.meter to kilometer\n2.kilometer to meter\n3.exit\n");
     int choice;
     Scanner in = new Scanner(System.in);
     do
     {
     System.out.println("Enter your choice:");
     choice =in.nextInt();
     switch(choice)
     {
     case 1:System.out.println("Enter the input in meter:");
            double m=in.nextDouble();
            System.out.println(m+"meter"+"="+(m*0.0001)+"kilometer");
     case 2:System.out.println("enter the input in kilometer:");
            double km=in.nextDouble();
            System.out.println(km+"kilometer"+"="+(km*1000)+"meter");
     case 3:System.out.println("Program completed succesfully");
     }
}while(choice!=3);
}
}




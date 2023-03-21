import java.util.Scanner;

import java.util.*;
import java.lang.Math.*;

 public class calculator
  {
    public static void main(String args[])
     {
       float a, b;
       char choice;
       Scanner scan = new Scanner(System.in);
	      
      	do
         {
	   System.out.print("Calculator\n");
           System.out.print("1. Square root function\n");
           System.out.print("2. factorial function\n");
           System.out.print("3. natural logarithm\n");
           System.out.print("4. power\n");
           System.out.print("5. Exit\n\n");
           System.out.print("Enter Your Choice : ");
           choice = scan.next().charAt(0);
           switch(choice)
            {
              case '1' : System.out.print("Enter a Number : ");
                         a = scan.nextFloat();
                         double res1 = squareroot(a);
                         System.out.print("Result = " + res1);
	                 break;															                       
	      case '2' : System.out.print("Enter a Number : ");
	                 a = scan.nextFloat();
	                 long res2 = factorial(a) ;
	                 System.out.print("Result = " + res2);
	                 break;
	 
	      case '3' : System.out.print("Enter a Number : ");
	                 a = scan.nextFloat();
	                 double res3 = lnx(a);
	                 System.out.print("Result = " + res3);
	                 break;
	 
	      case '4' : System.out.print("Enter two Number : ");
	                 a = scan.nextFloat();
					 b = scan.nextFloat();
	                 long res4 = power(a, b);
	                 System.out.print("Result = " + res4);
	                 break;
	 
	      case '5' : System.exit(0);
	                 break;
	
	      default : System.out.print("Wrong Choice!!!");
	                break;
	   }
																	            System.out.print("\n---------------------------------------\n");
	}while(choice != 5);  
	
	scan.close();
    }

    public static double squareroot(float x)
    {
        double res = 0;
        res = Math.sqrt(x);
        return res;
    }

    public static long factorial(float x)
    {
        long res = 1;
        for(int i=1; i<=x; i++)
        {
            res *= i;
        }
        return res;
    }

    public static double lnx(float x)
    {
        double res = Math.log(x);
        return res;
    }

    public static long power(float x, float b)
    {
        long res = 1;
        for(int i=1; i<=b; i++)
        {
            res *= x;
        }
        return res;
    }
}
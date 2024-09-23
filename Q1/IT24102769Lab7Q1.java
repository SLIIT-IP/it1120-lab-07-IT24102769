import java.util.Scanner;
public class IT24102769Lab7Q1
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  double mark1,mark2,mark3,mark4,avg;
 
 
  System.out.print("Enter Subject Mark 1:");
  mark1 = sc.nextDouble();

   System.out.print("Enter Subject Mark 2:");
   mark2= sc.nextDouble();

   System.out.print("Enter Subject Mark 3:");
   mark3 = sc.nextDouble();

   System.out.print("Enter Subject Mark 4:");
   mark4 = sc.nextDouble();
 
  avg= (mark1 + mark2 + mark3 + mark4)/4;
 
  System.out.println("Average is : " + avg);

   if(avg>=75 && avg<=100)
    { 
     System.out.println("Overall Grade is : Distinction");
    }
  
   else if(avg>=50 && avg<=74)
   { 
     System.out.println("Overall Grade is : Credit");
    }
   else 
   { 
     System.out.println("Overall Grade is : Fail");
    }
  
  }
}
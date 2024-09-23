import java.util.Scanner;
public class IT24102769Lab7Q3
{
 public static void main(String[]args)
 { 
  Scanner sc=new Scanner(System.in);
  double amt,dis = 0,ttl;
  int i;
  char pMode;
 
  for(i=1; i<=5; i++)
  {
   System.out.println("Costomer "+i );
  
   System.out.print("Enter total bill amount: ");
    amt= sc.nextDouble();

   System.out.print("Enter mode of payment (C for cash,O for other): " );
   pMode=sc.next().charAt(0);
   
   String type;
   if(pMode == 'C' || pMode == 'c')
    {
     dis = (amt*5)/100;
     System.out.println("Discount is "+dis);
    }
   
   else if(pMode == 'O' || pMode == 'o')
    {
     System.out.println("No discount applicable");
     dis = 0;
    }

   else
    {
      System.out.println("Payment Mode is Not Valid" );
     
      continue;
    }

   ttl = (amt-dis);
   System.out.println("Amount to be paid: "+ ttl);

    System.out.println();



    }
  }
}
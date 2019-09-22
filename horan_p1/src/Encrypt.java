import java.util.Scanner;

public class Encrypt 
{
     public static void main (String args [] ) 
     {
    	 Scanner input = new Scanner(System.in);
    	 int num1, num2, num3, num4, encryptedNumber, number;
    	 System.out.println("Enter a 4 digit integer:\t ");
         number = Integer.parseInt(input.nextLine());
         num1 = (number /  1000 + 7) % 10;
         num2 = (number % 1000/100 + 7) % 10;
         num3 = (number % 100/10 + 7) % 10;
         num4 = (number % 10 + 7) % 10;
         encryptedNumber = num1 * 10+num2 + num3 * 1000 + num4 * 100;
         System.out.println("Encrypted number is " + encryptedNumber);
         input.close();
         
      }
}
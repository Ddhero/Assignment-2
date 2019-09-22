import java.util.Scanner;

public class Decrypt 
{
     public static void main (String args [] ) 
     {
    	 Scanner input = new Scanner(System.in);
         int num1, num2, num3, num4, decryptedNumber, number;
         System.out.println("Enter a 4 Digit integer:\t");
         number = Integer.parseInt(input.nextLine());
         num1 = (number / 1000 + 3) % 10;
         num2 = (number % 1000 / 100 + 3) % 10;
         num3 = (number % 100 / 10 + 3) % 10;
         num4 = (number % 10 + 3) % 10;
         decryptedNumber = (num1 * 10) + num2 + (num3 * 1000) + (num4 * 100);
         System.out.println("Decrypted number is " + decryptedNumber);
         input.close();
         
      }
}


import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		double lbs,in,kgs,m,BMI = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Choose an option for the inputs height and weight: \nImperial: lbs and in \nMetric:  kgs and m");
		String option = input.nextLine();
		switch(option)
		{
			case "imperial":
				System.out.println("Enter weight in lbs :");
				lbs = input.nextDouble();
				System.out.println("Enter height in in :");
				in = input.nextDouble();
				BMI = 703*lbs / (in*in);
				break;
			case "metric":
				System.out.println("Enter weight in kgs:");
				kgs = input.nextDouble();
				System.out.println("Enter height in m:");
				m = input.nextDouble();
				BMI = kgs / (m*m);
				break;
			default:
				System.out.println("invalid choice");
				break;
		}
		if(BMI<=18.5)
			System.out.println("BMI is less than 18.5 means: UnderWeight");
		else if(BMI<=24.9)
			System.out.println("BMI between 18.5 and 24.9 means: Healthy");
		else if(BMI<=29.9)
			System.out.println("BMI between 25 TO 29.9 means: Overweight");
		else
			System.out.println("BMI greater than or equal to 30.0 means: obese");
	input.close();
	
	}

}
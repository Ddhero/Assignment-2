package problem3;
import java.util.Scanner;

public class Problem2
{
public static void main(String[] args) 
{
	Scanner input = new Scanner (System.in);
	int numTopics = 5;
	int numRatings = 10;
	String topic[] = {"Global Warming","Economic Policies","Gun Control","Gay Marrige","Immigration"};
	int ratings[][] = new int[5][10];
	for(int i = 0;i<numTopics;i++)
	{
		for(int j = 0;j<numRatings;j++)
		{
			System.out.print("Enter the " +(j+1)+ " rating for the topic '"+topic[i]+"' :");
			ratings[i][j] = input.nextInt();
		}
			System.out.println("");
	}
	System.out.println("\n\nRatings are:\n\n");
	printTab(topic,ratings, numTopics);
	System.out.println("");
	highestPoint(topic, ratings, numTopics);
	lowestPoint(topic, ratings, numTopics);
	input.close();
	
}

private static void printTab(String topic[], int ratings[][], int numTopics) 
{
	double avg;
	String format = "%1$-20s|%2$-10d%3$-10d%4$-10d%5$-10d%6$-10d%7$-10d%8$-10d%9$-10d%10$-10d" + "%11$-10d|%12$-10.2f\n";
	String format1 = "%1$-20s%2$-10s%3$105s\n";
	System.out.format(format1,"Topic","Ratings","Average Rating");
	for(int i = 0;i<numTopics;i++)
	{
		avg = getAvg(ratings[i]);
		System.out.format(format, topic[i],ratings[i][0],ratings[i][1],ratings[i][2],ratings[i][3],ratings[i][4], ratings[i][5],ratings[i][6],ratings[i][7],ratings[i][8],ratings[i][9],avg);
	}
}
private static void highestPoint(String topic[],int ratings[][], int numTopics)
{
	int maxPoint = getSum(ratings[0]);
	int point = 0;
	int maxIndex = 0;
	for(int i = 0;i<numTopics;i++)
	{
		point = getSum(ratings[i]);
		if(point>maxPoint)
		{
			maxPoint = point;
			maxIndex = i;
		}
	}
	System.out.println("The top rated topic is "+topic[maxIndex]+" and total rating is "+maxPoint );
  
	}
	private static void lowestPoint(String topic[],int ratings[][], int numTopics)
	{
		int minPoint = getSum(ratings[0]);
		int point = 0;
		int minIndex = 0;
		for(int i = 0;i<numTopics;i++)
		{	
			point = getSum(ratings[i]);
			if(point<minPoint)
			{
				minPoint = point;
				minIndex = i;
			}
		}
		System.out.println("The lowest rated topic is "+topic[minIndex] + " and total rating is " + minPoint );
  
	}
	private static double getAvg(int rating[]) 
	{
		return getSum(rating)/(double)rating.length;
	}
  
	private static int getSum(int rating[])
	{
		int sum = 0;
		for(int i = 0;i<rating.length;i++)
			sum += rating[i];
		return sum;
	}
	
	}
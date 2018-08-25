package tutorialOne;
import java.util.Scanner; 

/**
 * NTU CS2002 Object Oriented Programming
 * Tutorial 1 Qns 3
 * 
 * @author Jordan Liew
 */

public class BubbleSort {
	
	/**
	 * Sorts the array in ascending order
	 * 
	 * @param a array to be sorted
	 * @param n number of members in the array
	 */
	private static void bubble(int a[],int n) //Arrays.sort(), use Collections.sort() if using ArrayList
	{
		int i,j,t;
		for(i=n-2;i>=0;i--)	//Running the loop n-1 times
		{
			for(j=0;j<=i;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
	 }//end function. 
	
	public static void main(String[] args) {
		int n,i;
		int a[] = new int[100]; //Use arrayList
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n Enter the number of Integer elements to be sorted: ");
		n = sc.nextInt();
		
		for (i=0; i<=n-1;i++)
		{
			System.out.println("\n\n Enter Integer value for element no." + (i+1) + ": ");
			a[i] = sc.nextInt();
		}
		
		bubble(a, n);
		
		System.out.println("\n\n Finally the sorted array is: ");
		for( i=0; i<=n-1;i++)
			System.out.print(a[i] + " ");
		sc.close();
	}
}
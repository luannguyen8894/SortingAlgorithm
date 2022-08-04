
public class Sorts 
{
	//Bubble sort
	public static void myBubbleSort(int arr[]) 
	{
		int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) 
                {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
	}
	
	public static void printArray(int arr[])
	{
		int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
	}
	
	public static void main(String args[])
	{  
		int arr[] = { 64, 34, 25, 12,6, 22,6, 11, 90 };
		System.out.println("Before sort.");
		printArray(arr);
		myBubbleSort(arr);
		System.out.println("After sort.");
        printArray(arr);
	}

}

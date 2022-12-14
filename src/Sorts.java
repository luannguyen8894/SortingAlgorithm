
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
	
	//Insertion sort
	public static void myInsertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) 
        {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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
		int arr2[] = { 15, 31, 22, 12,6, 9, 11, 88 };
		
		System.out.println("Before sort.");
		printArray(arr);
		myBubbleSort(arr);
		System.out.println("After bubble sort.");
        printArray(arr);
        
        System.out.println("Before sort.");
		printArray(arr2);
		myBubbleSort(arr2);
		System.out.println("After insertion sort.");
        printArray(arr2);
	}

}

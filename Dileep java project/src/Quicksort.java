package day7;

public class Quicksort {
public static void quicksort(int[] arr,int low,int high)
{
	if(low<high)
	{
		int pivot=partition(arr,low,high);
	quicksort(arr,low,pivot-1);
	quicksort(arr,pivot+1,high);
}
}
private static int partition(int[] arr,int low,int high)
{
	int pi=arr[high];
	int i=low-1;
	for(int j=low;j<high;j++)
	{
		if(arr[j]<pi)
		{
			i++;
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	int temp=arr[i+1];
	arr[i+1]=arr[high];
	arr[high]=temp;
	return i+1;
}
public static void printArray(int[] arr)
{
	for(int num:arr)
	{
		System.out.println(num+" ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		int arr[]= {4,7,9,2,5,1,8,10};
		System.out.println("original array:");
		printArray(arr);
		quicksort(arr, 0, arr.length-1);
		System.out.println("sorted quick array:");
		printArray(arr);
	}

}
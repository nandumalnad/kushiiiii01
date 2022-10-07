package SWAPNUMBERS;

public class SortingElementsInAscendingOrder
{
public static void main(String[] args)
{
	int[] arr = {8,3,4,32,2,4,5};
	for(int i=0;i<arr.length; i++)
	{
		for(int j=i; j<arr.length;j++)   // we r giving  j=i bcoz to reduce the iteration
		{	
	if(arr[i]>arr[j])   // to compare in ascending order
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	}
}
  for(int i=0; i<arr.length; i++)
  {
	 System.out.print(arr[i]+ " ");
	}
}
}
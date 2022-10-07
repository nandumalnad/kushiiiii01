package collections;

public class RemoveDuplicateValues {
public static void main(String[] args)
{
	int[] arr={2,4,1,1,5,4};
	int len = arr.length;
	int temp[] = new int[arr.length];
	int j=0;
	//count=0;
     //size=arr.length;
	for(int i=0; i<len-1; i++)
	{
		if(arr[i]!= arr[i+1])
		{
			temp[j] = arr[i];
			
		}
	
	}
}
}

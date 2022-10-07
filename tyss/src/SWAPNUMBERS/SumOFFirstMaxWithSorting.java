package SWAPNUMBERS;

public class SumOFFirstMaxWithSorting 
{
public static  void main(String[] args)
{
			int[] arr = {8,3,4,32,4,5,98};
		for(int i=0;i<arr.length; i++)   // this for loop is for iteration
		{
			for(int j=i; j<arr.length;j++)   // we r giving  j=i bcoz to reduce the iteration  and to swap 2 numbers
			{	
		if(arr[i]<arr[j])   //  to compare in descending order
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		}
	}
		int sum=0;
		for(int i=0; i<3; i++)
		{
			sum=sum+arr[i];
}
System.out.println(sum);
	
}
}



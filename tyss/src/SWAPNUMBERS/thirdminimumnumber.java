package SWAPNUMBERS;

public class thirdminimumnumber {
	public static void main(String[] args)
		{
		   int[] arr={4,1,3,2,5};
		  for(int j=0; j<arr.length;j++)
		  {
			  for(int i=j; i<arr.length;i++)
			  {
				  if(arr[j]>arr[i])
				  {
					  int temp=arr[j];
					  arr[j]=arr[i];
					  arr[i]=temp;
				  }
			  }
		  }
			
	 System.out.print("third minimium is " +arr[2]);
		}
}

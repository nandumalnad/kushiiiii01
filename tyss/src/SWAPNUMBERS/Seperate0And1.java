package SWAPNUMBERS;

public class Seperate0And1 {
	public static void main(String[] args)
	{
		int[] arr={2,0,1,3,0,0};
		//int[] arr={1,0,1,0,1,0,0,0,1};    // how we pass the data...output will come like that only by seperating 0,
		int[] temp=new int[arr.length];  //by default all array values will be 0
		int m=0;      //first index as m
		int n=arr.length-1;   //last index as n
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0) // if we want first 1 to print n later 0 means ....arr[i]==1 and inbetween if we add any no means like 2,1,4 means give arr[i]!=0
			{	
				temp[m] =arr[i];
			    m++;
		     }
			else
			{
				temp[n]=arr[i];
				n--;
			}
	}
     for(int i=0; i<temp.length;i++)
     {
    	 System.out.print(temp[i]+" ");
     }
	}
}

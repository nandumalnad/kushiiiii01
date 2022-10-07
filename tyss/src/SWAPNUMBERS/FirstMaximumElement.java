package SWAPNUMBERS;

public class FirstMaximumElement {
	
		public static void main(String[] args)
		{
			int[] arr = {8,3,4,32,4,5, 96};
			for(int i=0;i<arr.length; i++)   // this for loop is for iteration
			{
				for(int j=i; j<arr.length;j++)   // we r giving  j=i bcoz to reduce the iteration  and to swap 2 numbers
				{	
			if(arr[i]>arr[j])   //  to compare in descending order
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
		}
		 System.out.println("First Max Element ----> "+arr[arr.length-1]);  //last index value
		 System.out.println("First Min Element ----> "+arr[0]);   //first index value
		}
}
		

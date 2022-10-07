package SWAPNUMBERS;

public class FirstMinAndSecondMin {
	public static void main(String[] args) {
		//int[] arr ={12,54,36, 9,5,10,109};
		int[] arr={2,3,9,5,1};
		int fmin=arr[0];  //1
		int smin=arr[0];   //1
		for(int i=0; i<arr.length; i++)
		{
		if (arr[i]<=fmin)
		  {
			if(arr[i]!=fmin)
			  {
	            smin=fmin;
	          }
		      fmin=arr[i];
		}
		else if(fmin==smin || arr[i]<smin)
		{
			smin=arr[i];
		}
		}
	 System.out.println("First Min value ===> "+fmin);
	 System.out.println("Second Min value ===> "+smin);
	}
	}



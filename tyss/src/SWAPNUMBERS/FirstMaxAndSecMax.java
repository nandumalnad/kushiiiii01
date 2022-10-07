package SWAPNUMBERS;

public class FirstMaxAndSecMax {
public static void main(String[] args) {
	int[] arr ={12,54,36, 9,5,10,109};
	int fmax=arr[0];  //1
	int smax=arr[0];   //1
	for(int i=0; i<arr.length; i++)
	{
	if (arr[i]>=fmax)
	  {
		if(arr[i]!=fmax)
		  {
            smax=fmax;
          }
	   fmax=arr[i];
	}
	else if(fmax==smax || arr[i]>smax)
	{
		smax=arr[i];
	}
	}
 System.out.println("First Max value ===> "+fmax);
 System.out.println("Second Max value ===> "+smax);
}
}

package SWAPNUMBERS;

public class FirstMaxNoWithoutSorting {
public static void main(String[] args) {
	int[] arr ={1,2,54,100,6,86,4};
	int fmax=arr[0];
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i] > fmax)        // change this condition first min value if arr[i] < fmax
		{
			fmax=arr[i];
			
		}
}
  System.out.println("First Max value ====>"+fmax);
  
  
  
}
}

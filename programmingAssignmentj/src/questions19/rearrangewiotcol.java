package questions19;

import java.util.LinkedHashSet;

public class rearrangewiotcol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-12,11,-13,-5,6,-7,5,-3,-6};
		int [] arr1 = new int [arr.length];
		int j = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				arr1[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				arr1[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}

}

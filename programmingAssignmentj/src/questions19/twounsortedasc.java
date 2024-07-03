package questions19;

import java.util.Arrays;

public class twounsortedasc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,4,2,5,7,88};
		int [] arr1 = {56,3,2,4,99};
		int [] arr2= {2,4,2,5,7,88,0,0,0,0,0};
		int j=0;
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]==0)
			{
				arr2[i]=arr1[j];
				j++;
			}
		}
		Arrays.sort(arr2);
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		

	}

}

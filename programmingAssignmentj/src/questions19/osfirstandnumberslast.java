package questions19;

import java.util.Arrays;

public class osfirstandnumberslast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,6,34,0,8,0,3,0};
		int[] arr1 = new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr1[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
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

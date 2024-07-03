package questions19;

import java.util.LinkedHashSet;

public class duplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,5,2,1,5,56,7};
		LinkedHashSet l=new LinkedHashSet();
		for(int i=0;i<arr.length;i++)
		{
			l.add(arr[i]);
		}
		System.out.println(l);
		

	}

}

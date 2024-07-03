package questions19;

import java.util.Arrays;
import java.util.TreeSet;

public class twounsortascend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {4,0,1,0,3,0,4,6,7,5};
		int[] array2= {2,6,5};
		TreeSet l=new TreeSet();
		int j=0;
		for(int i=0;i<array1.length;i++)
		{
			if(array1[i]==0)
			{
				array1[i]=array2[j];
				j++;
			}
		}
		for(int i=0;i<array1.length;i++)
		{
			l.add(array1[i]);
		}
		System.out.println(l);
		

	}

}

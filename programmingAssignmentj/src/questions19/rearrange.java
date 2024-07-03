package questions19;
import java.util.LinkedHashSet;
public class rearrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-12,11,-13,-5,6,-7,5,-3,-6};
		LinkedHashSet l=new LinkedHashSet();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				l.add(arr[i]);
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				l.add(arr[i]);
			}
		}
		for(Object c:l)
		{
			System.out.print(c+ " ");
		}
	}

}

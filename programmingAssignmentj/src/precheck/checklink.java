package precheck;

import java.util.LinkedHashSet;

public class checklink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {2,3,4,2,5,3,45};
		LinkedHashSet l=new LinkedHashSet();
		for(int a:array)
		{
			l.add(a);
		}
		System.out.println(l);
	}

}

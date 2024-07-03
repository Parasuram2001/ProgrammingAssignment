package questions19;

public class uniqueNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {3,4,2,3,2,7,8,32};
		
		for(int i=0;i<array.length;i++)
		{
			boolean flag=true;
			for(int j=0;j<array.length;j++)
			{
				if(i!=j && array[i]==array[j])
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.print(array[i]+" ");
			}
		}
	}

}

package questions19;

public class sumfound33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,4,20,3,10,5};
		for(int i=0;i<array.length;i++)
		{
			try {
				if(array[i]+array[i+1]+array[i+2]==33)
				{
					System.out.println("the sum found between the three indexes is 33 ");
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("catched");
			}
			
		}

	}

}

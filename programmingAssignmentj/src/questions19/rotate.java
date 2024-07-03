package questions19;

public class rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int rotate=7;
		rotate=rotate%arr.length;
		for(int i=0;i<arr.length;i++)
		{
			if(i<rotate)
			{
				System.out.print(arr[arr.length+i-rotate]+" ");
			}
			else {
				System.out.print(arr[i-rotate]+" ");
			}
		}

	}

}

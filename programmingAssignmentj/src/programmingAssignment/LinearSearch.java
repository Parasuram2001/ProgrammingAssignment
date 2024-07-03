package programmingAssignment;

public class LinearSearch {
	static boolean check(int[] arr,int number)
	{
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==number)
			{
				System.out.println("number is present");
				return true;
			}
		}
		System.out.println("number not present");
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,5,43,22,11};
		int number = 3;
		check(arr,number);
	}

}

package programmingAssignment;

public class IntToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 3;
		String str = "";
		while(number!=0)
		{
			int rem = number%2;
			str = rem + str;
			number = number/2;
		}
		System.out.println(Integer.parseInt(str));
	}

}

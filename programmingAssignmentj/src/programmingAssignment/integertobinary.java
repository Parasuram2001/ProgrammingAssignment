package programmingAssignment;

public class integertobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 16;
		String binary = "";
		while(no!=0)
		{
			int remainder = no%2;
			binary = remainder+binary;
			no = no/2;
		}
		System.out.println(Integer.parseInt(binary));
	}
}
